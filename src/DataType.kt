/* 자료형
* Int 정수 4,23 ...
* String 문자열 "Jin9"
* Float 실수 153.2
*/

/* 변수
* val (value) - 불변형 (immutable) 변경X
* var (variable) - 가변형 (mutable) 변경 O
*/

/*
* 선언키워드 변수이름(: 자료형) = 값
* val name(: String) = "JIN"
*/

/* 변수 이름
* 숫자로 시작하면 안됨
* 코틀린에서 사용되는 키워드 사용할 수 없음
* 의미있는 단어로 사용하는 것이 좋음
* 여러 단어 사용해 변수 이름 지을 시 카멜 표기법 사용
* 카멜 표기법 : camelCase (일반 변수, 함수명), AnimalCategory (클래스, 인터페이스)
* */

/* 자료형
* 기본형 (Primitive data) : 성능이 더 좋으나 쓰기 힘들어서 쓰지않게끔 되어있음
* 가공X 순수한 자료형, 프로그래밍 언어에 내장 - int, long, float, double 등
*
* 참조형 (Reference) : 코틀린은 참조형 쓰기
* 동적 공간에 데이터를 둔 다음 이것을 참조하는 자료형 - Int, Long,Float, Double 등등
*/

fun main() {
    val username: String = "Jin"
    // username = "Eunji" : val은 불변형 변수선언 키워드이므로 오류가 뜸

    var username2: String
    // 자료형 지정하지 않은 변수는 사용할 수 없음

    // ctrl+shift+p : 추론타입 확인
    // 이 경우 컴파일러가 값에 따라 데이터형 추론해 선언됨
    var count = 3

    // 변수이름이 하나인 경우 중괄호 생략 가능 : $변수이름
    println("username: $username, count: $count")

    val a: Int = 77
    // 코틀린에서는 참조형 Int를 사용해 77이란 값을 넣었지만 실제로 내부 컴파일 과정을 거치면 기본형같이 사용

}
