package dominio

object Processor {
    fun execute(fileNames:Map<String,List<FileName>>):List<String>{
        val listOfCommands = mutableListOf<String>()
        val placeName = fileNames.keys.first()
        val fileNameList = fileNames.values.first()
        with(fileNameList.sortedBy{ it.orderField })
        {
            forEachIndexed{  index, fileName ->
                var numeroPost = "00$index"
                numeroPost = numeroPost.slice((numeroPost.length - 3) until (numeroPost.length) )
                val extension = fileName.name.split(".")[1]
                listOfCommands.add("mv ${fileName.name} ${placeName +"_" + numeroPost +"." + extension}")
            }
        }
        return listOfCommands
    }
}