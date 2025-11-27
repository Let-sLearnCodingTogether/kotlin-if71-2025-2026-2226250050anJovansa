package FunctionalProgramming

inline fun execute(block: () -> Unit) {
    println("Start")
    block()
    println("End")
}

fun main() {
    execute {
        println("Execute Block")
    }
}