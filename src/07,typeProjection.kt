//type projection => menambahkan informasi covariant atau contravariant
class Container<T>(var data:T)

fun main() {
    fun copy(from:Container<out Any>, to:Container<Any>){
        to.data = from.data
    }
    val d1 = Container("Data 1")
    val d2:Container<Any> = Container("Data 2")
    copy(d1, d2)
    println(d2.data)
}