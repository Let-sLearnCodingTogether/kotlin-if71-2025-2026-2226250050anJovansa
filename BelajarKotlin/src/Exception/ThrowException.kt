package Exception

fun validasiUmur(umur: Int) {
    if (umur < 0) {
        throw IllegalArgumentException("Umur tidak boleh negatif")
    }
    println("Umur valid $umur")
}

fun main() {
    println("Start")
    try {
        validasiUmur(10)
        validasiUmur(-4)
    } catch (error: IllegalArgumentException) {
        println("Error ${error.message}")
    }
    println("Finish")
}