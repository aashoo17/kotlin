//integers
fun integers(){
    //signed integers
    val a: Byte = 10
    val b: Short = 10
    val c: Int = 10
    val d: Long = 10

    val e = 10      // this by default selects Int
    val f = 10L     // is L used with literal Long is selected

    // unsigned integers are still in beta in kotlin
    // java never supported them to keep things simple
}

//floating points
fun floats(){
    val a: Float = 10F
    val b: Double = 10.0
}

fun boolean(){
    val a: Boolean = true
    val b: Boolean = false
}

// strings
fun string(){
    var a = "Hello World"
    val b: String = "Hello String"
    //string modification
    //todo: is there non modifiable String class in kotlin
    a = "NEW String"
    println(a)
}

// arrays - for compatibility with java arrays
fun arrays(){
    // integer array
    val a : IntArray = IntArray(10)
    //float array
    val b: FloatArray = FloatArray(10)
}

// range
fun range(){
    val a: IntRange = 1..10     //values from 1 to 10
}

// bitwise operation - operations applied on each bit rather than byte level
fun bitwiseOperation(){
    val a = 10
    val b = 20
    val c = a shl b     // a << b
    val d = a shr b     // a >> b
    val e = a ushr b
    val f = a and b     // a & b
    val g = a or b      // a | b
    val h = a xor b     // a ^ b
    val i = a.inv()     // ~a
}

// type checks
//checking if the type is instance of a given class
fun instanceChecking(){
    val a = "Hello"
    val b = a is String
}

// explicit conversion
fun explicitConversion(){
    // toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble() etc.. will to conversion on integers and floats
    val a: Int = 10
    val b: Long = a.toLong()
}

/*
casting:
as
as is used for casting between classes
remember primitives use toByte(), toInt(), toLong() functions rather

as?
as can fail if it it is not able to succeed in conversion - runtime exception is thrown
as? is fails will take a safe route and will return null
*/

class Ashu: Human {}
interface Human{}

fun typeCasting(){
    val a: Human = Ashu()
    val b = a as Ashu
    val c: Ashu = a     //here think that as is being called implicitly as type is given explicitly to be Ashu

    val d = a as? Ashu
    val e: Ashu?
    e = a   //this implicitly calls as? as type is explicit as Ashu?
}