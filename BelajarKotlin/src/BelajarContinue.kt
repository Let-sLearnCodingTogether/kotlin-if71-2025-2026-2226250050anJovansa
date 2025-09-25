fun main() {
    for(index in 10 .. 20){
        if(index%2 == 0){
            continue
        }
        println("index : $index")
    }
}