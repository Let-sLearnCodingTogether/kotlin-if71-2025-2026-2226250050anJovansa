fun main() {
    println("hello world" to "UPPERCASE")
    println("HALO" to "lower")
}

infix fun String.to(type: String): String {
    return if (type == "UPPERCASE") this.uppercase()
    else this.lowercase()
}