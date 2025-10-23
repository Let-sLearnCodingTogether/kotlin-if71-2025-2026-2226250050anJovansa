fun main() {
    //Immutable
    val animals: Set<String> = setOf("Zebra", "Kucing")

    println(animals)

    val fruits: MutableSet<String> = mutableSetOf("Apel", "Jeruk")
    println(fruits)
}