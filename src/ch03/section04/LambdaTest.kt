package ch03.section04

/**
 * val 변수이름: 람다식의 선언자료형 = { 람다식의 매개변수: 자료형, .. -> 람다식의 처리내용 }
 * 표현식 두 줄 이상 시 마지막 표현식 반환
 *
 * 선언부의 자료형 생략
 * 추론 가능할 경우
 * 매개변수의 자료형을 명시*/
fun main() {

    var result: Int

    // 일반 변수에 람다식 할당
    var multi1 = { x: Int, y: Int -> x * y }

    /** 람다식이 할당된 변수는 함수처럼 사용 가능 */
    result = multi1(10, 20)
    println(result)

    // 매개변수, 반환식 자료형 둘다 생략 시 에러 (추론X)
    val multi2: (Int, Int) -> Int = { x: Int, y: Int -> x * y } // 생략되지 않은 전체 표현
    val multi3 = { x: Int, y: Int -> x * y }  // 선언 자료형 생략
    val multi4: (Int, Int) -> Int = { x, y -> x * y } // 람다식 매개변수 자료형의 생략

    val greet: () -> Unit = { println("Hello World!") } // 화살표가 없고, 반환값 없을 경우 Unit
    val square: (Int) -> Int = { x -> x * x }

    val nestedLambda: () -> () -> Unit = { { println("nested") } } // 람다식 안의 람다식

    val nestedLambda2 = { { println("nested") } } // 선언부 자료형 생략 (추론가능)
}