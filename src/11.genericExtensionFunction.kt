class Data<T>(val data:T)

fun Data<String>.print(){ //hanya untuk tipe String
    println("String value is ${this.data}")
}

fun main() {
    val d1 = Data("Hendrich")
    val d2 = Data(17)
    d1.print()
//    d2.print() //Error
}