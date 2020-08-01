package ch04.section01

fun main() {
    val a = 12
    val b = 7

    val max = if (a > b) {
        println("a선택")
        a // 마지막 식인 a가 반환되어 max에 할당
    } else {
        println("b선택")
        b
    }
    println(max)
}