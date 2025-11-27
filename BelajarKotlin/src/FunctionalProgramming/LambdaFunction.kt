package FunctionalProgramming

val sum = { a: Int, b: Int -> a + b }

fun sum1(a: Int, b: Int) = a + b

fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Unit) {
    return operation(a, b)
}

fun operateOnNumbers1(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

val repeatFun: String.(Int) -> String = { times -> this.repeat(times) }

fun main() {
    operateOnNumbers(1, 3) { x, y -> println(x + y) }
    println(operateOnNumbers1(2, 5, ::sum1))
    println(sum(1, 2))
    println("Hi".repeatFun(3))
}