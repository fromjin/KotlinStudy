package ch02

/** 자료형의 최소 최대
* 음수는 2의 보수 표현을 사용해 연산
* (예) -6
* 6의 2진값 : 0000 0110 -> 값 뒤집기 : 1111 1001 -> 1 더하기 : 1111 1010
*
* 2의 보수 사용 이유
* 제한된 자료형 음수/양수로 나누어 최대한 사용, 2의 보수 가산 회로만으로 뺄셈 표현 가능
* */

/**
 * 논리자료형 Boolean ' true / false '
 * 문자자료형 Char - ''
 * 모든 변수 선언만 한 경우 자료형 반드시 명시 !!
 */

fun main() {
    println("Int: ${Int.MIN_VALUE}~${Int.MAX_VALUE}")
    println("Byte: ${Byte.MIN_VALUE}~${Byte.MAX_VALUE}")
    println("Short: ${Short.MIN_VALUE}~${Short.MAX_VALUE}")
    println("Long: ${Long.MIN_VALUE}~${Long.MAX_VALUE}")
    println("Float: ${Float.MIN_VALUE}~${Float.MAX_VALUE}")
    println("Double: ${Double.MIN_VALUE}~${Double.MAX_VALUE}")
}