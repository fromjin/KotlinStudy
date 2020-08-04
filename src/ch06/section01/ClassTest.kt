package ch06.section01

class Car {
    val wheel: Int = 4

    fun start() {
        println("start")
    }
}

class Bird {} // 중괄호만 존재해도 되고 중괄호도 없어도 됨

fun main() {
    val sonata = Car()
    sonata.start()
    println(sonata.wheel) // 4


}