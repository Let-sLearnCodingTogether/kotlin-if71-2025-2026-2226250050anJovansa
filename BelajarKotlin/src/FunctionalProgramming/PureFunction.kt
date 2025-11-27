package FunctionalProgramming

//contoh pure function
fun add(a: Int, b: Int): Int = a + b

//contoh impure function
var count = 0
fun increment(a: Int): Int {
    count += 1
    return a + count
}

fun main() {
    add(1, 2)
    add(1, 2)

    println(increment(count))
    println(increment(count))
}