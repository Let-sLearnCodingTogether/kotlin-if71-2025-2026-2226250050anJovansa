package OperatorOverloadingAndConvention

data class Vector(var x: Int, var y: Int) {
    operator fun plus(other: Vector): Vector {
        return Vector(x + other.x, y + other.y)
    }

    operator fun minus(other: Vector): Vector {
        return Vector(x - other.x, y - other.y)
    }

    operator fun plusAssign(other: Vector) {
        x += other.x
        y += other.y
    }
}

fun main() {
    val vector1 = Vector(1, 2)
    val vector2 = Vector(2, 3)

    println(vector1 + vector2)
    println(vector1 - vector2)

    vector1 += vector2
    println(vector1)
}