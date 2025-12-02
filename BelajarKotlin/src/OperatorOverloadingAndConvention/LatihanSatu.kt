package OperatorOverloadingAndConvention

data class Mana(var current: Int, var max: Int) {
    operator fun plus(other: Mana): Mana {
        return Mana(current + other.current, maxOf(max, other.max))
    }

    operator fun inc(): Mana {
        return Mana(if (current + 10 < max) current + 10 else max, max)
    }

    operator fun minus(other: Int): Mana {
        return Mana(if (current - other > 0) current - other else 0, max)
    }
}

fun main() {
    var mana1 = Mana(50, 100)
    var mana2 = Mana(20, 50)
    println(mana1 + mana2)
    mana1++
    println(mana1)
    println(mana1 - 100)
}