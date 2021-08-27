class TypeSafeBuilder{
    fun func(){}
}

fun builder(t: TypeSafeBuilder.() -> Unit){}

fun useBuilder(){
    builder {
        // here we can call all the methods in TypeSafeBuilder with signature () -> Unit
        func()
    }
}
