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
        //fixme: error is not getting catched properly
        e.printStackTrace()
    }

}

// suspend functions
// todo: even regular functions can be called in coroutines why suspend modifier is used
suspend fun coroutineFunc(){
    delay(2000)
//    println("Hello World")
    throw Exception()
}