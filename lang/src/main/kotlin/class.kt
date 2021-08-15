//class
//constructors
//primary constructors
class Bird1{}

class Bird2(name: String){}

class Bird3(name: String){
    val name: String
    init{
        this.name = name
    }
}

//secondary constructors
class Bird4(){
    //secondary constructor must invoke primary in kotlin
    //usually delegation to another constructor is optional but kotlin makes at mandatory
    constructor(name: String) : this() {

    }
}

//properties and methods in class
class Bird5{
    val name = "Some random name"
    val age = 10
    fun printBird(){
        print(name + age)
    }
    //inner class
    class Sparrow{}
}

// abstract class
abstract class Bird6(){
    val name = ""
    val age = 10
    //abstract methods- abstract class implementer will complete the function body
    abstract fun printBird()
    //normal methods
    fun speak(){}
}

// companion object - more like static methods provider
class Bird7(){
    companion object {
        // can be accessed as Bird8.someFunc()
        fun someFunc(){}
    }
}

class Bird8(){
    companion object Sparrow{
        // can be accessed as Bird8.sparrow.someFunc()
        fun someFunc(){}
    }
}

// inheritance
open class Base1{

}
class Derive1: Base1(){

}

// overriding methods
open class Base2{
    open fun someFunc(){}
}
class Derive2: Base2(){
    override fun someFunc(){
        //calling superclass function
        super.someFunc()
    }
}

/*
 interfaces
 TODO: difference between abstract class and interface
 abstract class can have state also (i.e. fields)
 multiple interfaces can be implemented
 */

interface Bird{
    fun isBird(): Boolean
}
interface Animal{
    fun isAnimal(): Boolean
}

class Sparrow: Bird, Animal{
    override fun isBird(): Boolean {
        return true
    }
    override fun isAnimal(): Boolean {
        return false
    }
}

// enum class
enum class Man{
    Male, Female
}

//enum fields with data type
//todo: can data type be different for all fields
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}




