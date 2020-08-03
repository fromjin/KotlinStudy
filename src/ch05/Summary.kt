package ch05

/** 람다식
 * { 매개변수[...] -> 람다식 본문 }
 *
 * 고차함수
 * 함수의 매개변수로 함수를 받거나 함수자체를 반환할 수 있는 함수
 * */

fun main() {
    val sum: (Int, Int) -> Int = { x, y -> x + y } // 변수에 할당할 때
    val mul = { x: Int, y: Int -> x * y }
    val add: (Int) -> Int = { it + 1 } // 매개변수가 하나일 경우 매개변수를 생략하고 it으로 대체할 수 있음

    val isPositive: (Int) -> Boolean = {
        val isPositive = it > 0
        isPositive // 마지막 표현식이 반환됨
    }

    val isPositiveLabel: (Int) -> Boolean = number@{
        val isPositive = it > 0
        return@number isPositive // 라벨을 사용하여 반환
    }

    // 함수를 이용한 람다식
    val result = high("Jin", {  x -> inc(x + 3) })

    // 소괄호 바깥으로 빼내고 생략
    val result2 = high("Jin") { inc(it + 3) }

    // 매개변수 없이 함수의 이름만 사용할 때
    val result3 = high("Jin", ::inc)

    // 람다식 자체를 넘겨 준 형태
    val result4 = high("Jin") { x -> x + 3 }

    // 매개변수가 한 개인 경우 생략
    val result5 = high("Jin") { it + 3 }
}

fun inc(x: Int): Int {
    return x + 1
}

//
fun high(name: String, body: (Int)->Int): Int {
    println("name: $name")
    val x = 0
    return body(x)
}