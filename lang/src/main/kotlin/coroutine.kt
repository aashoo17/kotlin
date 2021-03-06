import kotlinx.coroutines.*

fun coroutineBasics(){
    // scope of coroutines
    val a = CoroutineScope(Dispatchers.Default)
    // launch and async
    a.launch {
        run()
    }

    // async
//    a.async {
//        run()
//    }.await()
//
//    withContext(Dispatchers.Default){
//        run()
//    }
}

// suspend function
suspend fun run(){
    delay(2000)
    print("Hello after delay")
}

