package std

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

// using ktor for creating http client
//https://ktor.io/docs/getting-started-ktor-client.html
fun client(){
    val a = HttpClient(CIO)
    val b = GlobalScope.launch {
        val b = a.get<ByteArray>("https://jsonplaceholder.typicode.com/posts")
        println(b)
    }
    //todo: let main thread be blocked till the couroutine is not completed
}