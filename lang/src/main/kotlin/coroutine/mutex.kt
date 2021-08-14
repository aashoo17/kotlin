package coroutine

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Mutex

// here we are updating a map from 2 coroutines but we don't want want both coroutine to update the map at same time
// so sync them using mutex
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
    // todo: get the map size and update next two indices
    m[0] = 10
    m[1] = 20
    mux.unlock()
}