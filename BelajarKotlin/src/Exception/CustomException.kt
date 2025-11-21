package Exception

class saldoKurangException(msg: String) : Exception(msg)

val saldo: Int = 100_000

fun tarikTunai(jumlah: Int) {
    if (jumlah > saldo) {
        throw saldoKurangException("sadar diri")
    } else {
        println("Penarikan berhasil")
    }
}

fun main() {
    try {
        tarikTunai(120_000)
    } catch (error: saldoKurangException) {
        println("Error saldo kurang ${error.message}")
    }

}