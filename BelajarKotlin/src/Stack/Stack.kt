package Stack

interface Stack<Element> {
    fun push(element: Element)
    fun pop(): Element?
}

class StackImplement<T : Any> : Stack<T> {
    private val storage = arrayListOf<T>()

    override fun toString(): String {
        return storage.asReversed().toString()
    }

    override fun push(element: T) {
        storage.add(element)
    }

    override fun pop(): T? {
        if (storage.isEmpty()) return null
        return storage.removeAt(storage.size - 1)
    }
}

fun main() {
    val stack = StackImplement<Int>()

    stack.push(1)
    stack.push(2)
    stack.push(3)
    println(stack)
    stack.pop()
    println(stack)
}