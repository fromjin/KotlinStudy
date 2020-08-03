package ch05

import kotlin.random.Random

/**
 * takeIf() : 람다식이 true이면 객체T를 반환, 그렇지 않은 경우 null 반환
 * takeUnless() : 람다식이 false이면 객체T를 반환, 그렇지 않은 경우 null 반환
 * 시간측정함수 : measureTimeMillis, measureNanoTime
 * 난수 발생 import kotlin.random.Random (자바X)
 * */

public inline fun <T> T.takeIf(predicate: (T) -> Boolean): T? = if (predicate(this)) this else null

public inline fun measureTimeMillis(block: () -> Unit): Long {
    val start = System.currentTimeMillis()
    block() // 시간 측정하고자 하는 코드
    return System.currentTimeMillis() - start
} // 함수 자체는 Long형 반환

// 시간이 나노단위
public inline fun measureNanoTime(block: () -> Unit): Long {
    val start = System.nanoTime()
    block()
    return System.nanoTime() - start
}

fun main() {
    // some?.takeIf { it.status }?. apply { doThis() }

    val input = "Kotlin"
    val keyword = "in"

    input.indexOf(keyword).takeIf { it >= 0 } ?: error("keyword not found")
    input.indexOf(keyword).takeUnless { it < 0 } ?: error("keyword not found")

    val executionTime = measureTimeMillis {
        // 측정할 작업 코드
    }
    println("Execution Time = $executionTime ms")

    val number = Random.nextInt(22)  // 숫자는 난수 발생 범위
    println(number)
}