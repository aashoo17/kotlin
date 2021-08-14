package std.collection

fun map(){
    val a = mapOf(1 to "one", 2 to "two")

    //find by key
    val b = a[1]
    val c = a.get(2)

    // iterate over keys and values
    val e = a.keys  //set an iterator
    val f = a.values    //collection an iterator

    //filter
    val g = a.filter { (k, v) ->  k == 1 }
}

fun mutableMap(){
    val a = mutableMapOf(1 to "one", 2 to "two")

    // add
    a.put(3, "three")
    a.putAll(mapOf(4 to "4", 5 to "5"))

    // remove
    a.remove(1)
}