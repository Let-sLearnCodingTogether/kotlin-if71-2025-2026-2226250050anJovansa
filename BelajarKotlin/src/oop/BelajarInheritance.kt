package oop

open class Hewan(val name: String) {
    open fun suara() {
        println("Suara hewan")
    }


}

open class Ayam(name: String) : Hewan(name) {
    override fun suara() { //tambah final pada fun yang tidak mau di wariskan
        super.suara()  //mengambil atribut atau method dari parent
        println("Ayam : Kuku ruyuk")
    }
}

//class anakAyam(name: String) : Ayam(name) {
//    override fun suara() {
//        println("Petok petok")
//    }
//}

fun main() {
    val rambo = Ayam("Rambo")

    rambo.suara()
}