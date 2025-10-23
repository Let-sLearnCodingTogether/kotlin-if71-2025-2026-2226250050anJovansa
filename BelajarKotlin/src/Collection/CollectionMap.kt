fun main() {
    val fruits: Map<String, Int> = mapOf(
        "apple" to 1,
        "banana" to 2,
        "orange" to 3,
    )
    println(fruits["banana"])
    var mutableFruits: MutableMap<String, Int> = mutableMapOf(
        "apple" to 1,
        "banana" to 2,
        "orange" to 3,
    )

    println("")
}