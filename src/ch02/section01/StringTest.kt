package ch02.section01

/** 문자열 - 문자를 배열처럼 - " "
 * String으로 선언, String Pool이라는 특수한 공간에 구성
 * */

/** ${표현식}으로 문자열출력
 * var a = 1
 * val s1 = "a is $a"
 * val s2 = "a = ${a+2}" : 문자열에 표현식 사용
 * */

fun main() {
    // var로 선언된 str1의 참조 주소는 가변형으로 바뀔 수 있으나
    // 일단 선언되어 생성된 메모리공간의 Hello는 변경 불가능
    var str1: String = "Hello"
    var str2 = "World"
    var str3 = "Hello" // str1, str3는 똑같은 참조를 가짐

    // == : 값만 비교, === : 참조까지 비교
    // 자바는 == 으로 참조까지 비교, === 연산자 없음
    println("str1 === str2: ${str1 === str2}") // false
    println("str1 === str3: ${str1 === str3}") // true
}