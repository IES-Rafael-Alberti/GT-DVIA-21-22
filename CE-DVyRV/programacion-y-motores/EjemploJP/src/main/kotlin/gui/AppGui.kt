import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.AwtWindow
import androidx.compose.ui.window.MenuBar
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import java.awt.FileDialog
import java.awt.Frame
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import dominio.FileName
import dominio.Processor
import io.Reader

internal fun AppGui() = application {
    val titleWindowIni = "Procesa archivo: "
    var isFileChooserOpen by remember { mutableStateOf(false) }
    var titleWindow by remember { mutableStateOf(titleWindowIni) }
    var filePath by remember { mutableStateOf("") }
    var isActiveProcess by remember { mutableStateOf(false) }
    var textProcesed by remember { mutableStateOf("") }


    Window(
        title = titleWindow,
        onCloseRequest = ::exitApplication
    ) {
        MenuBar {
            Menu("Archivo") {
                Item("Abrir", onClick = { isFileChooserOpen = true })
                Item("Procesar", onClick = { textProcesed = formatProcesor(Processor.execute(  Reader(filePath).getInfo()))}, enabled = isActiveProcess)
                Item("Salir", onClick = ::exitApplication)
            }
        }
        FrameWindow(
            isFileChooserOpen,
            filePath = filePath,
            onCloseFileChooser = { directory: String?, fileName: String? ->
                isFileChooserOpen = false
                filePath = directory + fileName
                isActiveProcess = !filePath.isNullOrBlank()
                titleWindow = titleWindowIni + fileName
                textProcesed = formatReader(Reader(filePath).getInfo())
                },
            onClickSelectFile = { isFileChooserOpen = true },
            textProcesed
        )
    }

}

@Composable
internal fun FrameWindow(
    isFileChooserOpen: Boolean = false,
    filePath: String = "",
    onCloseFileChooser: (directory: String?, file: String?) -> Unit,
    onClickSelectFile: () -> Unit,
    textProcesed: String
) {
    MaterialTheme {
        if (isFileChooserOpen)
            FileChooser(onCloseFileChooser = onCloseFileChooser)


        Box(
            modifier = Modifier.fillMaxSize()
                .background(color = Color(180, 180, 180))
                .padding(10.dp)
        )
        {
            //val stateVertical = rememberScrollState(0)
            //val stateHorizontal = rememberScrollState(0)
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(end = 12.dp, bottom = 12.dp)
                //.verticalScroll(stateVertical)
                //.horizontalScroll(stateHorizontal)
            ) {
                Column {

                    TextField(
                        value = filePath,
                        onValueChange = { },
                        label = { Text("Seleccione un archivo:") },
                        placeholder = { Text("Archivo no seleccionado") },
                        modifier = Modifier.padding(start = 10.dp, top = 10.dp, end = 10.dp, bottom = 10.dp)
                            .fillMaxWidth(),
                        leadingIcon = {
                            IconButton(onClick = onClickSelectFile) {
                                Icon(
                                    imageVector = Icons.Filled.Create,
                                    contentDescription = "Seleccione un archivo"
                                )
                            }
                        },
                        colors = TextFieldDefaults.textFieldColors(
                            textColor = Color(0xFF120524),
                            backgroundColor = Color.White,
                            focusedLabelColor = Color(0xFF120524).copy(alpha = ContentAlpha.high),
                            focusedIndicatorColor = Color.Transparent,
                            cursorColor = Color(0xFF120524),
                        ),
                        readOnly = false,
                    )
                    Space()
                    TextField(
                        value = textProcesed,
                        onValueChange = { },
                        label = { Text("Resultado") },
                        placeholder = { Text("No obtenido resultados") },
                        modifier = Modifier.padding(start = 10.dp, top = 10.dp, end = 10.dp, bottom = 10.dp)
                            .fillMaxSize().width(300.dp)
                            .height(200.dp),
                        readOnly = false,

                        )
                }

            }/*
            VerticalScrollbar(
                modifier = Modifier.align(Alignment.CenterEnd)
                    .fillMaxHeight(),
                adapter = rememberScrollbarAdapter(stateVertical)
            )
            HorizontalScrollbar(
                modifier = Modifier.align(Alignment.BottomStart)
                    .fillMaxWidth()
                    .padding(end = 12.dp),
                adapter = rememberScrollbarAdapter(stateHorizontal)
            )*/
        }
    }
}

/**
 * TODO
 *
 * @param parent
 * @param onCloseFileChooser
 */
@Composable
internal fun FileChooser(
    parent: Frame? = null,
    onCloseFileChooser: (directory: String?, file: String?) -> Unit
) = AwtWindow(
    create = {
        object : FileDialog(parent, "Choose a file", LOAD) {
            override fun setVisible(value: Boolean) {
                super.setVisible(value)
                if (value) {
                    onCloseFileChooser(directory, file)
                }
            }
        }
    },
    dispose = FileDialog::dispose
)


@Composable
internal fun Space() {
    Spacer(modifier = Modifier.size(16.dp))
}

private fun formatReader(out: Map<String,List<FileName>>):String {
    var text :String = out.keys.first() + "\n"
    out.values.first().forEach { text += it.name + "\n"  }
    return text
}

private fun formatProcesor(out: List<String>):String {
    var text = ""
    out.forEach{
        text += it + "\n"
    }
    return text
}

