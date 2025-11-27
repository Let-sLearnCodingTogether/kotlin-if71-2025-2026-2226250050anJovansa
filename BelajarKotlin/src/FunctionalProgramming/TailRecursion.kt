package FunctionalProgramming

//normal rekursif
fun factorial(n: Int): Long {
    return if (n == 1) 1 else n * factorial(n - 1)
}

//tailRec rekursif
tailrec fun factorialTailRec(n: Int, acc: Long = 1): Long {
    return if (n == 1) acc else factorialTailRec(n - 1, acc * n)
}