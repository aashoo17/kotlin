import kotlinx.coroutines.*

// scope of coroutines
fun scope(){
    val a = CoroutineScope(Dispatchers.IO)
    // launch and async
    a.launch {
        run()
        // async
        val b = async {
            run()
        }.await()
        print(b)
        withContext(Dispatchers.Default){
            print("withContext")
        }
    }
}

// suspend function
suspend fun run(){
    delay(2000)
    print("Hello after delay")
}

