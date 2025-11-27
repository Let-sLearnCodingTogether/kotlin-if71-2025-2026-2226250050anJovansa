package FunctionalProgramming

fun createMultiplier(factor: Int): (Int) -> Int {
    return { number: Int -> number * factor }
}

fun compose(f: (Int) -> Int, g: (Int) -> Int): (Int) -> Int {
    return { x: Int -> f(g(x)) }
}

fun square(x: Int) = x * x
fun increment1(x: Int) = x + 1

fun main() {
    val number = listOf<Int>(1, 2, 3, 4, 5)

    val doubled = number.map { it * 2 }
    val even = number.filter { it % 2 == 0 }
    val sum = number.reduce { acc, i -> acc + i }

    val asd = compose(::square, ::increment1)
    println(asd(4))
    println(number)
    println(doubled)
    println(even)
    println(sum)

    val doubled2 = createMultiplier(2)
    println(doubled2(4))
}