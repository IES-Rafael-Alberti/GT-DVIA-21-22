import dominio.Processor
import io.Reader

fun main()
{
    val entrada = "/home/usuario/Documentos/workspace/IdeaProjects/un7pe/src/main/kotlin/secret-3.in"
    val r = Reader(entrada)
    val l = r.getInfo()
    println(Processor.execute(l))
}