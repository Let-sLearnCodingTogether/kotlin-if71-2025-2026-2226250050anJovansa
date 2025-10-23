fun main() {
    val buah: Map<String, Int> = mapOf(
        "jeruk" to 10,
        "apel" to 3,
    )
    println("Size: ${buah.size}")
    println("Is Empty: ${buah.isEmpty()}")
    println("Contains Key: ${buah.containsKey("jeruk")}")
    println("Contains Value: ${buah.containsValue(10)}")
    println("Get: ${buah.get("jeruk")}")
    println("get Or Default: ${buah.getOrDefault("jeruk", 0)}")
    println("Get All Keys: ${buah.keys}")
    println("Get All Value: ${buah.values}")

    buah.entries.forEach { (key, value)->
        println("Key: ${key}, value: ${value}")
    }

}