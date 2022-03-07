//invariant (default) => tidak boleh disubstitusi  sengan subtype(child) atau supertype(parent)
//<String> != <Any>
//<Any> != <String>
class Invariant<T>(val data:T)

fun main() {
    val d1 = Invariant<String>("Tyson")
//    val d2:Invariant<Any> = d1 //gabisa
}