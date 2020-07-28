package ch02.section03

/** 스마트캐스트
 *  구체적으로 명시되지 않은 자료형을 자동 변환
 *  값에 따라 자료형 결정
 *  Number형은 숫자를 저장하기 위한 특수한 자료형으로 스마트캐스팅

 *  묵시적 변환
 *  Any
 *  자료형이 정해지지 않은 경우
 *  모든 클래스의 뿌리 - Int나 String은 Any형의 자식 클래스
 *  Any는 언제든 필요한 자료형으로 자동 변환 (스마트캐스트)
 *  */

fun main() {
    var test: Number = 12.2 // 12.2에의해 test는 Float형으로 스마트캐스트
    println(test)

    test = 12 // Int형으로 스마트캐스트
    println(test)

    test = 120L // Long형으로
    println(test)

    test += 12.0f // Float형으로
    println(test)

//   test = "Hello" //캐스트 불가능

    var a: Any = 1 //Any형 a는 1로 초기화될 때 Int형이 됨
    a = 20L //Int형이였던 a는 20L에 의해 Long형이 됨
    println("a: $a, type: ${a.javaClass}") //.javaClass : 자바 기본형 호출함수

    checkArg("Jin") //인자 : 문자열
    checkArg(22) //인자 : 정수수
}
// 인자 x를 Any형으로 받는 함수, checkArg
fun checkArg(x: Any) {
    if (x is String) println("x is String: $x") //x가 String형 일 떄
    if (x is Int) println("x is Int: $x") //x가 Int형 일 때
}