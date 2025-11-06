package oop

sealed class HasilOperasi() {
    data class Success(val message: String) : HasilOperasi()
    data class Error(val massage: String) : HasilOperasi()
    object Loading : HasilOperasi()
}

fun prosesHasil(hasilOperasi: HasilOperasi) {
    when (hasilOperasi) {
        is HasilOperasi.Loading -> println("System Loading")
        is HasilOperasi.Success -> println(hasilOperasi.message)
        is HasilOperasi.Error -> println(hasilOperasi.massage)
    }
}

fun main() {
    prosesHasil(HasilOperasi.Loading)
    prosesHasil(HasilOperasi.Success("Success"))
    prosesHasil(HasilOperasi.Error("Error"))
}