fun main() {
    println("Nama Kamu ?")
    val nameInput = readln()

    println("Umur Kamu ?")
    var ageInput = readln()
    val age = ageInput.toIntOrNull()

    if(age != null){
        println("Nama Kamu : $nameInput")
        println("Umur kamu : $age")
    }else{
        println("Umur tidak valid")
    }
}