fun exception(){
    // if exception is thrown in try block
    try{
        throwException()
    }catch (e: Exception){
        println("caught exception")
    }
}

// function throwing exception
fun throwException(){
    throw Exception()
}