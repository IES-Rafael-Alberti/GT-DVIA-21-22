package dominio

data class FileName(val name: String) {

    var  orderField: String = ""
        private set
        public get() {
            if (field.isNullOrBlank())
                field = obtenerCampoDeOrdenacion(name)
            return field
        }

    private fun obtenerCampoDeOrdenacion(name: String) = when {
        name.startsWith("IMG_", true) -> {
            with(name){
                slice(4..11) + slice(13..18)
            }
        }
        name.startsWith("P", true) -> {
            with(name) {
                "20" + slice(5..6) + slice(3..4) + slice( 1..2) + slice (8..13)
            }
        }
        else -> {
            ""
        }

    }
}

fun main(){
    var fn1 = FileName("IMG_20171203_213455.jpg").orderField.also(::println)
    var fn2 = FileName("P031217_213455.jpg").orderField.also(::println)
}
