//type erasure => proses pengecekan generic pada saat compile, dan menghiraukan pengecekan pada saat runtime
//type erasure menjadikan informasi generic yg dibuat akan hilang ketika telah dicompile
//compiler mengubah generic parameter type jadi tipe Any (atau Object di java)

class TypeErasure<T>(param:T){
    private val data:T = param
    fun getData():T=data
}

fun main() {
    val data = TypeErasure("Rudi")
    val name = data.getData()

    val rudi = data as TypeErasure<Int>
    val number = rudi.getData() //error konversi
    println(number)
}