//generic contstraint => membatasi tipe data yg dibolehkan
interface CanSayHello{
    fun sayHello(name:String)
}
open class Employee(val name:String)
open class Manager(param:String):Employee(param)
class VP(param:String):Manager(param)
class VicePresident2(param:String):Employee(param),CanSayHello{
    override fun sayHello(name: String) {
        println("Hello $name")
    }
}

class Car(val name:String)

class Company<T:Employee>(val employee: T) {//hanya bisa type Employee dan turunanya
    override fun toString() = "My name is ${employee.name}"
}

//where keyword digunakan untuk lebih dari satu tipedata
class Company2<T>(val employee: T) where T:Employee, T:CanSayHello{
    override fun toString() = "My name is ${employee.name}"
    fun sayHelloFromCompany(a:String) = employee.sayHello(a)
}

fun main() {
    val d1 = Company(Manager("Yudi"))
    val d2 = Company(VP("Idrus"))
//    val car = Company(Car("Avanza")) //ga bisa karena bukan turunannya
    println("$d1\n$d2")

    //coba lebih dari satu kondisi tipe
    val d3 = Company2(VicePresident2("Yoko"))
    d3.sayHelloFromCompany("Wahju")

}