fun main() {
    //Immutable
    val animals:Set<String> = setOf("Zebra", "Kucing")
    println(animals)

    println("Size: ${animals.size}")
    println("Is Empty: ${animals.isEmpty()}")
    println("Contains: ${animals.contains("Zebra")}")
    println("Contains ALl: ${animals.containsAll(listOf("Kucing"))} ")

    val animalIterator = animals.iterator()
    while (animalIterator.hasNext()) {
        println("Animal: ${animalIterator.next()}")
    }
}