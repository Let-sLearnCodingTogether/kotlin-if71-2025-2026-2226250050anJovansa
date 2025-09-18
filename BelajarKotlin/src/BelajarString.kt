fun main() {
    val university: String = "Universitas Multi Data Palembang"
    val address: String = """
        *jln. Rajawali
        |Sumatera Selatan
        |Palembang
    """.trimMargin("*")
    // default trimMargin adalah pipe (|)
    // gunakan trimIndent() untuk trim tanpa prefix
    println(university)
    println(address)
}