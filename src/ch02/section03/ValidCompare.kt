package ch02.section03

/** 자료형 변환
 * 기본형 사용 X, 참조형만 사용
 * 서로 다른 자료형은 변환 과정 거친 후 비교

 * 변환 메소드 종류 : toByte(Byte), toInt(Int), ...

 * 이중등호 == : 값만 비교
 * 삼중등호 === : 값과 참조 주소 둘 다 비교
 * ! 자바에서는 ==에서 값과 참조주소를 비교
 * */

/** 변수 위치 설명
 * !! 코틑린에서는 참조형으로 선언한 변수의 값이 -128~127 범위에 있으면 캐시에 그 값 저장
 *
 * Stack
 * [128(값)] <- a (기본형)
 * [128(값)] <- b (기본형)
 * [주소:a1] <- c (참조형)
 * [주소:a2] <- d (참조형)
 * [주소:a1] <- e (참조형)
 *
 * Heap (동적공간)
 * a1 [128]
 * a2 [128] <- 객체
 * */

fun main() {
    val a: Int = 128 // 정수형 변수 a 선언하고 1 할당
//    val b: Double = a // 자료형 불일치 오류
//    val c: Int = 1.1 // 자료형 불일치 오류

    val f: Double = a.toDouble() // 변환 메소드 사용

    val result = 1L + 3 // Long + Int -> result는 Long으로 자동변환 (큰 자료형으로)

    val b = a // Int형으로 자동추론
    val c: Int? = a // 객체(동적공간)
    val d: Int? = a // d와 e는 값만 같고 스택에 담긴 주소공간은 틀림
    val e: Int? = c

    println(c==d) //true
    println(c===d) //false
    println(c===e) //true


    /** is 키워드 이용해 검사 */
    val num = 256
    if (num is Int) println(num) //num이 Int형 일 떄
    else if (num !is Int) println ("Not a Int") //num이 Int형이 아닐때 !(num is Int)와 동일
}