fun main() {
    println(hitungPanjangNama("Jovan"))
}

fun hitungPanjangNama(name :String?) : Int = name?.length ?: 0