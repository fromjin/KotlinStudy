package ch03.section04

// 매개변수가 없는 람다식 함수가 noParam 함수의 매개변수 out으로 지정됨
fun noParam(out: () -> String) = println(out())

// 매개변수가 하나 있는 람다식 함수가 oneParam함수의 매개변수 out으로 지정됨
fun oneParam(out: (String) -> String) {
    println(out("OneParam"))
}

// 매개변수가 두 개 있는 람다식 함수가 twoParam 함수의 매개변수로 지정됨
fun twoParam(out: (String, String) -> String) {
    println(out("OneParam", "TwoParam"))
}

fun withArgs(a: String, b: String, out: (String, String) -> String) {
    println(out(a, b))
}

fun main() {
    // 매개변수 없는 람다식 함수
    noParam({ "Hello World!" })
    noParam { "Hello World!" } // 위와 동일 결과, 소괄호 생략 가능

    // 매개변수가 하나 있는 람다식 함수
    oneParam({ a -> "Hello World! $a" })
    oneParam { a -> "Hello World! $a" } // 소괄호 생략 가능
    oneParam { "Hello World! $it" }  // 람다식 매개변수 하나일 때 화살표 생략 후 it으로 대체 가능

    // 매개변수가 두 개 있는 람다식 함수
    twoParam { a, b -> "Hello World! $a $b" } // 매개변수명 생략 불가
    twoParam { _, b -> "Hello World! $b" } // 특정 매개변수 생략하고플 땐 _(언더바)사용

    // 일반 매개변수와 함께 사용시 람다식 함수를 마지막 매개변수를 갖게 한다
    // 일반 매개변수를 소괄호안에 둔 뒤 마지막 인자 람다식은 소괄호 바깥으로 분리한다
    withArgs("arg1", "arg2") { a, b -> "Hello $a $b" }
}