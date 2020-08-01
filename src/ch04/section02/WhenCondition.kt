package ch04.section02

import java.lang.Integer.parseInt

/** When 구문
 * when구문은 다른 언어의 switch~case를 대체하는 코틀린에서만 제공되는 문법
 *
 * 인자 사용하는 경우
 when (인자) {
 인자에 일치하는 값 혹은 표현식 -> 수행할 문장
 인자에 일치하는 범위 -> 수행할 문장
 ...
 else -> 문장
 }
 *
 * 인자가 없는 경우 - else if처럼 각각의 조건을실행 할 수 있음
 when {
 조건[혹은 표현식] -> 실행문
 ...
 }
 * */

fun main() {
    val x = 1
    val s = "0"
    when (x) {
        1 -> println("x==1")
        2 -> println("x==2")
        else -> {//블록구문사용가능
            println("x는 1,2가 아닙니다.")
        }
    }

    // 일치되는 여러 조건건
   when(x) {
        0,1 -> println("x==0 or x==1")
        else -> println("기타")
    }

    // 함수의 반환값 사용하기
    when(x) {
        parseInt(s) -> println("일치함")
        else -> println("불일치함")
    }

    // in 연산자와 범위 지정자 사용
    when(x) {
        in 1..10 -> println("x는 1 이상 10 이하 입니다.")
        !in 10..20 -> println("x는 10 이상 20 이하의 범위에 포함되지 않습니다.")
        else -> println("x는 어떤 범위에도 없습니다.")
    }

    // is 키워드 사용하기
    val str = "장혜진"
    val result = when(str) {
        is String -> "문자열입니다"
        else -> false
    }
    println(result)

}