//apabila == != dapat menggunakan .equals()
//comparable interface => > >= < <= bisa dilakukan jika onject kita mewariskan interface generic comparable
class Fruit(val name:String, val quantity:Int):Comparable<Fruit>{
    override fun compareTo(other: Fruit): Int {
        return quantity.compareTo(other.quantity) //karena quantity adalah Int dan Int implement interface Comparable juga
    }
}

fun main() {
    val fruit1 = Fruit("Jeruk",10)
    val fruit2 = Fruit("Jeruk",15)

    println(fruit1>fruit2)
}