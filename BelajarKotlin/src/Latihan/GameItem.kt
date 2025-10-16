package Latihan

data class GameItem(val id: Int, var nama: String, var value: Int, var rarity: String)

fun main() {
    val listItem : List<GameItem> = listOf<GameItem>(
        GameItem(1, "Pedang Besi", 100, "Common"),
        GameItem(2, "Ramuan Kesehatan", 50, "Common"),
        GameItem(3, "Jubah Bayangan", 500, "Epic"),
    )

    val cursedSword = listItem[0].copy(nama = "Pedang Besi Terkutut", value = 250)
    println(listItem[0])
    println(cursedSword)
}