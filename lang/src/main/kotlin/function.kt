fun call(x: Int, y: Int, z: String): Int{
    //do something here
    return 10;
}

//Unit type - is a marker that function not returning same like void in c
fun doSomething(): Unit{}

// single expression function
fun singleExpression(x: Int) = x * 2

// lambdas
fun lambdas() {
    /* lambda
    * lambda are similar to function only that they can capture the environment
    * closure = think of it as class/struct having all local variables, args and captures value as class properties
    * apart from arguments and variable created inside normal function lambda can get the variable available outside
    * in the same scope
    */
    val y = 10
    //even though y is not passed as argument or created inside lambda it is available there this is called as
    // capturing the environment
    val a: (Int)->Unit = {x: Int -> println(y)}
    a(20)

    //trailing lambdas
    //if last arg is a lambda then it can be passed outside () during function call
    trailLambda(10){ x: Int -> println(x)}
    //if only lambda is the arg () can be omitted in function call
    call {println(y)}
    //it
    //if lambda is having only one arg it is implicitly named as it
    //from this {x: Int -> println(x)} since x is only arg can be omitted to this {println(it)}
    trailLambda(20){println(it)}
}

//higher order function
fun call(x: ()->Unit){
    x()
}

//function takes trailing lambda
fun trailLambda(x: Int, y: (Int)->Unit){
    y(30)
}

