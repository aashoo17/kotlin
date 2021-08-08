fun conditionalIf(){
    val a = 10
    //todo: using && and ||
    if (a == 10){
        print("got 10 wohoo")
    }else if (a == 20){
        print("got 20 ahaan")
    }else{
        print("something else lol")
    }
}

fun whenUses(){
    val a = 10
    when (a){
        10 -> print("10")
        20 -> print("20")
        30 -> print(30)
        in 40..100 -> print("between 40 and 100")   //if in keyword not used compiler will think int is compared against IntRange
        else -> print("else")
    }
}