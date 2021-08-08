fun whileLoop(){
    var a = 0
    while(a < 10){
        print(a)
        a++
    }
}

// do while

fun doWhile(){
    do {
        val y = 10
    } while (y != 1) // y is visible here!
}

//iterator based for loop
fun forLoop(){
    for (i in 1..10){
        print(i)
    }
}

//TODO: break and continue

/*
break can break out of loop
continue can skip code/steps in the iteration
 */