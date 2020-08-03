package ch03.section04

fun main() {
    /**
     * 다른 함수의 참조에 의한 호출
     * 람다식이 아닌 일반 함수를 또 다른 함수의 인자에서 호출하는 고차함수의 경우
     * 두 개의 콜론기호(::)를 함수 이름 앞에 사용해 소괄호와 인자를 생략하고 사요 시
     * 일반 함수를 참조에 의한 호출로 사용 가능*/

    // 인자와 반환값이 있는 함수
    val res1 = funcParam(3, 2, ::sum1)
    println(res1)

    // 인자가 없는 함수
    hello(::text) // 반환값이 없음

    // 일반 변수에 값처럼 할당
    val likeLambda = ::sum1
    println(likeLambda(6,6))
}

fun sum1(a: Int, b: Int) = a + b

fun text(a: String, b: String) = "Hi! $a $b"

fun funcParam(a: Int, b: Int, c: (Int, Int) -> Int): Int {
    return c(a, b)
}

fun hello(body: (String, String) -> String): Unit {
    println(body("Hello", "World"))
}