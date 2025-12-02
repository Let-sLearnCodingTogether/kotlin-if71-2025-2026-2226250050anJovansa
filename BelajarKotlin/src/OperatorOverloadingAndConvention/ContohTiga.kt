package OperatorOverloadingAndConvention

class GameCharacter(val inventory: List<String>) {
    operator fun contains(item: String): Boolean {
        return inventory.contains(item)
    }
}

fun main() {
    val hero = GameCharacter(listOf("Item A", "Item B"))

    println("Item A" in hero)
    println("Item B" !in hero)
    println("Item B" in hero)
}