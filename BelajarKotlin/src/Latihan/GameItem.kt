package Latihan

data class GameItem(val id: Int, var nama: String, var value: Int, var rarity: String)

class Player(val name: String, var health: Int = 100, var level: Int = 1) {
    fun takeDamage(damage: Int) {
        if (health > damage) {
            println("Kamu Terkena Damage $damage")
            health -= damage
        } else {
            health = 0
            println("Game Over!!!")
        }
    }

    fun levelUp() {
        println("Kamu Naik Level!")
        level += 1
        health = 100
    }

    fun showStatus() {
        println("Nama : $name, Level : $level, Health : $health")
    }
}

fun main() {
    val listItem: List<GameItem> = listOf<GameItem>(
        GameItem(1, "Pedang Besi", 100, "Common"),
        GameItem(2, "Ramuan Kesehatan", 50, "Common"),
        GameItem(3, "Jubah Bayangan", 500, "Epic"),
    )

    val cursedSword = listItem[0].copy(nama = "Pedang Besi Terkutut", value = 250)
//    println(listItem[0])
//    println(cursedSword)

    val Jovansa: Player = Player("Jovansa Putra Laksana")
    Jovansa.showStatus()
    Jovansa.takeDamage(30)
    Jovansa.showStatus()
    Jovansa.levelUp()
    Jovansa.showStatus()
}