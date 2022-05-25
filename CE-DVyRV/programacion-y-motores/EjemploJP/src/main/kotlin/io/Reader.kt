package io

import dominio.FileName
import java.io.File

class Reader (pathFile:String) {
    private var file: File = File(pathFile)

    fun getInfo():Map<String,List<FileName>>
    {
        val lineas = file.readLines()
        val filesNamesList = lineas[1].split(" ") + lineas[2].split(" ")

        val nombresDeFicheros = MutableList(filesNamesList.size) { indice ->
            FileName(filesNamesList[indice])
        }

        return mapOf(lineas[0] to nombresDeFicheros).also( ::println)
    }
}