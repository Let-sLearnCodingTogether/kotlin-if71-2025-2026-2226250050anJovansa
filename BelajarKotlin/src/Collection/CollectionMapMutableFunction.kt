fun main() {
    val fruits = mutableMapOf<String, Int>(
        "apple" to 1,
        "orange" to 2,
        "pear" to 3,
    )

    fruits["apple"] = 10
    fruits.put("orange", 10)
    println("Hasil Setelah Put: ${fruits}")

    fruits.remove("apple")
    println("Hasil Setelah Apple Di remove: ${fruits}")

    fruits.putAll(mapOf(
        "anggur" to 4
    ))
    println("Hasil Setelah Put All: ${fruits}")

    fruits.clear()
    println("Hasil Setelah Remove: ${fruits}")
}