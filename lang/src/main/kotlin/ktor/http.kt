package ktor

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.json.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.coroutines.Dispatchers
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
        val respString: String = resp.receive()     //explicit type is required - as generic T is returned
        print(respString)
    }
}

//modify the client properties
fun modifyClient() = runBlocking {
    val client = HttpClient(CIO){
        // http client props
        expectSuccess = false
        developmentMode = false
        followRedirects = true
        // configure the engine props here
        engine {

        }
    }
}
//todo: creation of request from HttpRequest apart from string address

// handling JSON
fun jsonHandling() = runBlocking {
    val client = HttpClient(CIO) {
        install(JsonFeature) {
            // todo: use other serializers
            serializer = GsonSerializer()
        }
    }
    launch(Dispatchers.IO) {
        try{
            val posts: List<Posts> = client.get("https://jsonplaceholder.typicode.com/posts")
            for(i in posts){
                println(i.body)
            }
        }catch (e: Exception){
            print("data fetching error happened")
        }
    }
}

data class Posts(val userId: Int, val id: Int, val title: String, val body: String)
