fun exception(){
    // if exception is thrown by a code put it in try block
    try{
        throwException()    //this code can throw exception
    }
    catch (e: ArithmeticException){
        //so something
    }
    catch (e: Exception){  //catch the exception
        println("caught exception")
    }
    finally {
        // this code always runs
    }
}

// function throwing exception
fun throwException(){
    throw Exception()
}