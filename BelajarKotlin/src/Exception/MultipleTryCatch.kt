package Exception

fun validasiUmur1(umur: Int): Int {
    if (umur < 0) {
        throw IllegalArgumentException("Umur tidak boleh negatif")
    }
    return umur
}

fun main() {
    println("Start")
    try {
        validasiUmur1(10)
        validasiUmur1(-4)
    } catch (error: IllegalArgumentException) {
        println("Error ${error.message}")
    } catch (error: ArithmeticException) {
        println("Error $error")
    } catch (error: Exception) {
        println("Error $error")
    } finally {
        println("Massage dari blok finaly")
    }
    println("Finish")
}