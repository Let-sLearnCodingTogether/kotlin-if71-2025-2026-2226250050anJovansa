fun main() {
    //Mutable
    val animals: MutableSet<String> = mutableSetOf()
    animals.add("Zebra")
    animals.add("Kucing")
    println(animals)

    animals.remove("Zebra")
    println(animals)
    println("Add All: ${animals.addAll(listOf("Anjing"))}")
    println(animals)
    println("Remove All: ${animals.removeAll(listOf("Kucing"))}")
    println(animals)
    println("Retain All: ${animals.retainAll(listOf("Kucing"))}")
    println(animals)
}