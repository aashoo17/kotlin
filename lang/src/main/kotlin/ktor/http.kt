package ktor

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun httpClient() = runBlocking{
    //create the http client by passing the underlying engine to be used
    val client = HttpClient(CIO)
    launch {
        // make the suspending get request inside a coroutine
        // get() call is requiring explicit type of HttpResponse
        val resp : HttpResponse = client.get("https://jsonplaceholder.typicode.com/posts")
        //todo: show the bytes received
        print(resp.status)
    }
}

//todo: modify the client properties
//todo: tell about different engines available and modify the engine properties
//todo: creation of request from HttpRequest apart from string address
//todo: handling json
