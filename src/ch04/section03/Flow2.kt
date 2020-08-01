package ch04.section03

fun main() {

    // 람다식 방법
    val getMessage = lambda@ { num: Int ->
        if(num !in 1..100) {
            return@lambda "Error" //레이블을 통한 반환
        }
        "Success" // 마지막 식이 반환 (람다식의 마지막 식은 return 쓰지않음)
    } // 여기로 나감

    // 익명함수 방법
    val getMessage2 = fun(num: Int): String { // 여기로 나감
        if(num !in 1..100) {
            return "Error"
        }
        return "Success"
    }
    val result = getMessage2(99)

    for (i in 1..5) {
        if (i == 3) break //12
        print(i)
    }
    println()
    println("outside")
}

/**
 * break와 continue
 * for나 while, do.. while문 루프 빠져나올 때 사용
 * break는 반복문을 빠져나옴
 * continue는 반복조건을 다시 보는 것 */

fun labelBreak() {
    println("labelBreak")
    for(i in 1..5) {
        second@ for (j in 1..5) {
            if (j == 3) break
            println("i:$i, j:$j")
        } // 이 부분으로 빠져나감
        println("after for j")
    }
    println("after for i")
}

fun labelBreak2() {
    println("labelBreak")
    first@ for(i in 1..5) {
        second@ for (j in 1..5) {
            if (j == 3) break@first
            println("i:$i, j:$j")
        }
        println("after for j")
    } // 이 부분으로 ㅃㅏ져나감
    println("after for i")
}