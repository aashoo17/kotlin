class ScopeFunction{
    var str = "Hello World"
    fun func1(){}
    fun func2(){}
}

fun letUses(){
    val a = ScopeFunction()
    a.let {
        it.func1()
        it.func2()
    }
}

fun applyUses(){
    val a = ScopeFunction()
    a.apply {
        str = "something new"
    }
}

fun runUses(){
    val a = ScopeFunction()
    a.run {
        func1()
        func2()
    }
}

fun withUses(){
    val a = ScopeFunction()
    with(a){
        func1()
        func2()
    }
}

fun alsoUses(){
    val a = ScopeFunction()
    a.also{
        it.func1()
        it.func2()
    }
}