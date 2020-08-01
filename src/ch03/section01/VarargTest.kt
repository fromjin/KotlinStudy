package ch03.section01

/** 가변인자 vararg
 * 함수 하나만 정의하고 여러 개의 인자 받을 수 있음 */
fun normalVarargs(vararg a: Int) {
    for (num in a) {
        println("$num ")
    }
}

fun main(args: Array<String>) {
    normalVarargs(1) // 1개의 인자 구성
    println()
    normalVarargs(1,2,3,4,5) // 5개의 인자 구성
}