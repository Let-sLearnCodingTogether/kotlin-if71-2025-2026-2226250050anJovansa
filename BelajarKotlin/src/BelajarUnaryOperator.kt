fun main() {
    val a: Int = 5
    val b: Int = -a //hasil -5
    val c: Int = +a //hasil 5
    val isTrue: Boolean = true
    val isFalse: Boolean = !isTrue

    var x = 10
    println(x++) //post-increment -> cetak 10 baru ditambahkan
    println(++x) //pre-increment  -> ditambahkan dulu baru dicetak
    println(x--) //post-decrement -> cetak dulu baru ditambahkan
    println(--x) //pre--decrement -> dikurang dulu baru dicetakl
}