class Function(val name:String){
    fun<T> sayHello(param:T){
        println("Hello $param my name is ${this.name}")
    }
}

fun main() {
    val rudi = Function("Rudi")
    rudi.sayHello<Int>(10)
    rudi.sayHello("Hendrich")
}