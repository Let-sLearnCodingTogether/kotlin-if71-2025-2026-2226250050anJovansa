fun main() {
    fail("Terjadi Kesalahan Fatal")
}

fun fail(massage: String): Nothing {
    throw IllegalArgumentException(massage)
}