package std.collection

fun list(){
    //create
    val a: List<Int> = List(10){ it*10 }
    val b = listOf(10,20,30)
    val c = emptyList<Int>()
    val d = a.toList()  //from existing List

    //accessing elements
    val e = a[0]    //single element
    val f = a.slice(1..3)   // access a slice

    // iterator
    for (i in a){
        print(i)
        //TODO: using for printing space find a better way
        print(" ")
    }

    // iterate without for in
    val iterator = a.listIterator()
    while (iterator.hasNext()){
        print(iterator.next())
        //TODO: using for printing space find a better way
        print(" ")
    }

    //things based on iterator
    // transformation - map, zip, flatten
    val g = listOf(10,20,30,40,50,60,70)
    val h = g.map { it * 2}
    val j = g.zip(h)

    val k = listOf(listOf(10,20,30), listOf(50,60,70))
    val l = k.flatten()

    // filter
    val m = listOf(10,20,30,40,50,60)
    m.filter { it < 40 }

    //ordering
    val n = listOf(10,20,30,40,50,60)
    //TODO: complete ordering - a simple binary predicate would have been nice

}

// mutable list
// all the things for List is applicable for mutable list
// covering operations specific to mutable list here
fun mutableList(){
    //create
    val a = mutableListOf(10,20,30)
    //write operations - add, remove, update
    a.add(40)
    a.add(50,1)

    a.remove(10)
    a.removeAt(0)

    a[2] = 100  //update
}