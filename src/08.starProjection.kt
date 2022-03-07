//star projection => digunakan apabila kita tidak peduli dengan generic parameter
fun main() {
    val displayLength = fun(arr:Array<*>){ //X => star projection
        println("Legth Array is ${arr.size}")
    }
    displayLength(arrayOf(1,2,3,4,5))
    displayLength(arrayOf("yudi","cahyo","wahju"))
}