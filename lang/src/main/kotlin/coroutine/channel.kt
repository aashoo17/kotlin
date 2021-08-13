package coroutine

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun myChannel() = runBlocking {
    val ch = Channel<Int>()
    launch {
        ch.receive()
        print("World")
    }
    launch {
        print("Hello ")
        ch.send(10)
    }
}

// Buffered channels
fun bufferedChannel() = runBlocking {
    val ch = Channel<Int>(10)
    launch {
        ch.receive()
        print("World")
    }
    launch {
        print("Hello ")
        ch.send(10)
        ch.send(20)
        ch.close()
    }
}