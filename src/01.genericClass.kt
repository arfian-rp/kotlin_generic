//generic type=> class/interface yang memilikio property type
/*
* nama generic type yg biasa digunakan
* E element
* K key
* N number
* T type
* V value
* S,U,V,etc 2nd,3rd,4th types
* */

class MyData<T,U>(val firstData:T, val secondData:U){
    fun printAllData() = println("Data: $firstData $secondData")

    fun getFirst():T = firstData
    fun getSecond():U = secondData
}

fun main() {
    val obj1:MyData<String,Int> = MyData("Hardy", 78)
    obj1.printAllData()
    println(obj1.getFirst())
    println(obj1.getSecond())

    val obj2 = MyData(33, "Erich")
    obj2.printAllData()
    println(obj2.getFirst())
    println(obj2.getSecond())

}