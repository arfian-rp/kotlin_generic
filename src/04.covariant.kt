//covariant => bisa melakukan substitusi subtype(child) dengan supertype(parent)
class Covariant<out T>(val data:T){ //T adalah covariant
    fun data():T = data
    //tidak boleh membuat input function generic covariant (setter)
}

fun main() {
    val data1: Covariant<String> = Covariant("Yudi")
    val data2: Covariant<Any> = data1
    println(data2.data())
}