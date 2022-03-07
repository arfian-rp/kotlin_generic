//contravariant => bisa melakukan substitusi supertype(parent) dengan subtype(child)
class Contravariant<in T>{//T adalah contravariant
    fun sayHello(name:T) = println("Hello $name")
    //tidak boleh membuat output function generic contravariant (getter)
}

fun main() {
    val d1: Contravariant<Any> = Contravariant()
    val d2: Contravariant<String> = d1
    d2.sayHello("Rudy")
}
