package LatihanUas

interface Queue<T : Any> {
    fun enqueue(element: T): Boolean
    fun dequeue(): T?

    val count: Int
    val isEmpty: Boolean
        get() = count == 0

    fun peek(): T?
}

class NilaiAkhirQueue<T : Any> : Queue<T> {
    private val list = arrayListOf<T>()

    override fun toString(): String {
        return list.toString()
    }

    override val count: Int
        get() = list.size

    override fun peek(): T? {
        return list.getOrNull(0)
    }

    override fun enqueue(element: T): Boolean {
        list.add(element)
        return true
    }

    override fun dequeue(): T? {
        return if (isEmpty) null else list.removeAt(0)
    }
}

fun main() {
    val queue = NilaiAkhirQueue<Int>()

    queue.enqueue(10)
    queue.enqueue(20)
    println(queue)
    queue.dequeue()
    println(queue)
}