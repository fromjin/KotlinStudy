package ch02.section04

/** 기본연산자
 *
 *  산술연산자 : +, -, *, /, %(나머지) ; 짝홀 시 유용
 *  대입연산자 : =, +=, -=, *=, /=, %= ; num = num+2 -> num+=2
 *  증감연산자 : ++, -- ; 위치 앞 - 증감 후 대입, 위치 뒤 - 대입 후 증감
 *  비교연산자 : >, <, >=, <=, [==, !=]값, [===, !==]참조 ; 자바와 차이 주의
 *  논리연산자 : &&, ||, !
 * */

fun main() {
    var a: Int = 10
    var b: Int = 10

    var result1 = ++a
    var result2 = b++

    println("result1: $result1, result2: $result2") //11, 10
    println("a: $a, b: $b") //11, 11
}