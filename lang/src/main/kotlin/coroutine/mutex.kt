package coroutine

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Mutex

fun mutex() = runBlocking {
    val mux = Mutex()
    val map = mutableMapOf<Int,Int>()
    launch {
        //do something critical - say map updation
        changeMap(mux,map)
    }
    launch {
        changeMap(mux,map)
    }
    //todo: show/print the map after updation
}

//todo: use the lambda instead of normal function
suspend fun changeMap(mux: Mutex, m: MutableMap<Int,Int>){
    mux.lock()
    m[0] = 10
    m[1] = 20
    mux.unlock()
}