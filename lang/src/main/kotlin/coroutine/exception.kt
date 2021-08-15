package coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun exceptionHandling() = runBlocking {
    try{
        launch {
            coroutineFunc()
        }
    }catch (e: Exception){
        // handle error here
        print("coroutine error")
    }

}

suspend fun coroutineFunc(){
    delay(2000)
//    println("Hello World")
    throw Exception()
}