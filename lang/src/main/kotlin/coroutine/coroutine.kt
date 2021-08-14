package coroutine

import kotlinx.coroutines.*

/*
 Blocking OS thread so that coroutines can complete even if OS thread does not have anything to do:
 runBlocking will block the current thread till coroutines is not completed
 this is required so that main thread does not exit and in turn cleans up all the green threads, and they do not get
 time to complete the code written in them
 runBlocking kinda bridge the gap between blocking and non-blocking world
 */
fun coroutine01() = runBlocking {
    // delay for some time - delay does not block the thread as it is suspend function
    delay(2000)
    //print this line after 2 sec delay
    println("Hello Coroutines")
}

// suspend functions
// todo: even regular functions can be called in coroutines why suspend modifier is used
suspend fun coroutineFunc02(){
    delay(2000)
    println("Hello World")
}

// using suspend function inside coroutines
fun coroutine02() = runBlocking{
    launch {
        coroutineFunc02()
    }
}

// cancelling up the coroutine in between even if the code inside coroutine is not completed
fun coroutine03() = runBlocking {
    val job = launch {
        delay(4000)
    }
    // cancel the coroutine even if it is not complete
    job.cancel()
}

/*
 scope builder:
 handling individual coroutines and cleaning them will be a lot of pain
 enter the CoroutineScope which can manage all coroutines created in a scope
 e.g.
 launch 3 coroutines in a scope and cancel them all using this scope
 */

fun coroutine04() = runBlocking {
    launch {
        coroutineFunc04()
    }
}

suspend fun coroutineFunc04(){
    // todo: what is coroutineScope() - starting with small c letter
    val scope = CoroutineScope(Dispatchers.Default)
    scope.launch {
        coroutineFunc02()
    }
    scope.launch {
        coroutineFunc02()
    }
    scope.launch {
        coroutineFunc02()
    }
    scope.cancel()
}

/*
Dispatchers:
coroutines can run on multiple no of threads Dispatchers tell
on which/how many threads coroutine can be launched
Main - usually we don't run on main in android as UI is drawn in main thread and blocking it will have adverse effect
Default
IO
Unconfined
launch, async, CoroutineScope all take Dispatcher parameters
 */
fun coroutine05() = runBlocking {
    launch (Dispatchers.Default){
        delay(2000)
    }
}

fun coroutine06() = runBlocking {
    async (Dispatchers.IO){
        delay(2000)
    }.await()
}

fun coroutine07() = runBlocking {
    // scope tells to use Default threads for coroutines
    val scope = CoroutineScope(Dispatchers.Default)
    // launch explicitly tells use IO threads instead of scopes Default threads
    scope.launch(Dispatchers.IO){
        delay(2000)
    }
    // this coroutine will use scopes Default threads
    scope.launch {
        delay(1000)
    }
}

