//class

//constructors

//primary constructors
class Bird1{

}

class Bird2(name: String){

}

class Bird3(name: String){
    val name: String
    init{
        this.name = name
    }
}

//secondary constructors
class Bird4(){
    //secondary constructor must invoke primary in kotlin
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

    //inner classes
    class Sparrow{

    }
}

// abstract class

abstract class Bird6(){
    val name = ""
    val age = 10
    abstract fun printBird()
    fun speak(){

    }
}

// companion object
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
 difference between abstract class and interface
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

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}




