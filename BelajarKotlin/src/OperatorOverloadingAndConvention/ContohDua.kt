package OperatorOverloadingAndConvention

class Matrix(private val rows: Int, private val cols: Int) {
    private val data = Array(size = rows) {
        IntArray(size = cols)
    }

    operator fun get(i: Int, j: Int): Int = data[i][j]
    operator fun set(i: Int, j: Int, value: Int) {
        data[i][j] = value
    }
}

fun main() {
    val matrix1 = Matrix(3, 3)
    matrix1[0, 0] = 1
    matrix1[1, 2] = 2

    println(matrix1[0, 0])
}