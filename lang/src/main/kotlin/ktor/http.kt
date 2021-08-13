package ktor

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun httpClient() = runBlocking{
    val client = HttpClient(CIO)
    launch {
        val resp : HttpResponse = client.get("https://jsonplaceholder.typicode.com/posts")
        print(resp.readBytes())
    }
}

//todo: modify the client properties
//todo: modify the engine properties
//todo: creation of request from HttpRequest apart from string address
