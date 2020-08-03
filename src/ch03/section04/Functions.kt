package ch03.section04

/**
 * 중위함수
 * 중위표현법
 * 클래스의 멤버 호출 시 사용하는 점을 생략하고 함수 이름 뒤에 소괄호 생략해 직관적인 이름을 사용할 수 있는 표현법
 *
 * 중위 함수의 조건
 * 멤버 메서드 또는 확장함수여야함
 * 하나의 매개변수를가져야함
 * infix 키워드를 사용하여 정의해야함
 *
 * 재귀
 * 자기 자신을 다시 참조
 * 재귀 함수는 자기 자신을 계속 호출하는 것이 특징
 *
 * 재귀 함수의 필수 조건
 * 무한 호출에 빠지지 않도록 탈출조건 만들기
 * 스택 영역을 이용하므로 호출횟수 무리하게 많이 지정해 연산하지 않기
 * 코드 간단히 하기 */

// Int를 확장해서 multiply() 함수가 하나 더 추가되었음
infix fun Int.multiply(x: Int): Int {  // infix로 선언되므로 중위 함수
    return this * x
}

infix fun Int.strPlus(x: String): String {
    return "$x version $this"
}

// 일반적인 재귀함수
fun factorial (n: Int) : Long {
    return if (n==1) n.toLong() else n * factorial(n-1)
}

// 꼬리재귀함수
// 스택 사용하지않음
tailrec fun tailFactorial (n: Int, run: Int =1 ): Long {
    return if(n==1) run.toLong() else tailFactorial(n-1, run*n )
}

fun main() {

    // 일반 표현법
    // val multi = 3.multiply(10)

    // 중위 표현법
    val mulit = 3 multiply 10
    val str = 3 strPlus "Kotlin"
    println(str)

    val normalFactorial = factorial(4) // factorial(4) - 4*factorial(3) - .. 4*(3*(2*1))
    println("normal: $normalFactorial")
}