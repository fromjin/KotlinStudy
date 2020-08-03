package ch03.section04

/** 값에 의한 호출과 이름에 의한 호출은 함수의 실행 순서가 다르다! */
fun sum(a: Int, b: Int): Int = a + b

fun mul(a: Int, b: Int) = a * b

fun funcFunc(a: Int, b: Int) = sum(a,b) // 함수의 반환 형태로 함수자체를 사용 가능

fun highOrder(a:Int, b:Int, out: (Int, Int)->Int) = out(a,b)

fun main() {

    val result1 = sum(10,5)
    val result2 = mul (sum(10,20),10) // 함수를 인자형태로 사용
    val result3 = funcFunc(2,3)

    var result4: Int
    result4 = highOrder(10,20) {x,y -> x-y}
    println("result1: $result1, result2: $result2, result3: $result3, result4: $result4")


    // 람다식 함수를 호출 (lambda() 호출 -> callByValue()호출)
    val result5 = callByValue(lambda()) // lambda()함수가 callByValue()의 매개변수 b로 들어감
    println(result5)

    val result6 = callByName(otherLambda) // 람다식 이름으로 호출
    println(result6)
}

fun callByValue(b: Boolean): Boolean { // 일반 변수 자료형으로 선언된 매개변수
    println("callByValue function")
    return b
}

val lambda: () -> Boolean = {  // 매개변수가 없어서 화살표표현 없음
    println("lambda function")
    true // 마지막 표현식 문장의 결과가 반환
}

fun callByName(b: () -> Boolean): Boolean { // 람다식 함수 자료형으로 선언된 매개변수
    println("callByName function")
    return b()
}

val otherLambda: () -> Boolean = {
    println("otherLambda function")
    true
}