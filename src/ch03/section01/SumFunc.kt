package ch03.section01

/**
 * 함수의 선언
 * fun 함수이름 ([변수이름: 자료형, 변수이름: 자료형 ...]): [반환값의 자료형] {
 *      표현식 ...
 *      [return 반환값]
 * }
 *
 * 함수 정의할 때 사용한 변수들 : 함수의 매개변수 (parameters) - 기본값(default) 지정 가능
 * 함수를 사용할 때 : 인자 (arguments)
 * */

// 변수의 자료형 꼭 넣어줘야 함
// 반환 값의 자료형 생략시 Unit (자바의 void)
//fun sum(a: Int, b: Int): Int { // 최상위 (Top-level) 함수
//    var sum = a + b
//    return sum
//}

// 간략화 된 함수
fun sum(a: Int, b: Int) = a + b
fun sum1(a: Int, b: Int = 6) = a + b

// vararg 가변인자 : 인자의 개수를 유동적으로 받을 수 있음
// infsum 인자의 개수에 상관없이 합 구하는 함수
fun infsum(vararg nums: Int): Int {
    var sum = 0
    for (num in nums) sum += num
    return sum
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun outfunc(name: String) = println("Name: $name") // 아무런 형 반환 하지 않는 Unit (생략)

/** 최상위함수
 * sum이라는 이름은 main의 위 또는 아래에 두더라도 해당이름을 main안에서 사용가능
 * main안에 sum함수 정의 시 sum은 지역함수
 * */
fun main() { // 최상위 (Top-level) 함수
    val result1 = sum(2, 3)
    val result2 = infsum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val a = 3
    val b = 5
    val result3 = max(a, b) // 인자 값이 매개변수에 복사되어 사용
    val result4 = sum1(2)
    val result5 = sum1(2,b=5) // 직접 이름으로 지정할 수 있음

    println(result1)
    println(result2)
    println(result3)
    outfunc("jin")
    println(result4)
    println(result5)
}