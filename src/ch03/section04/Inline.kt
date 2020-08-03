package ch03.section04

/**일반 익명함수
 * return, break, continue 사용 가능
 * 람다식에서는 사용 불가능 (라벨표기법과 사용)
 *
 * 함수 본문에 조건식에 따라 함수를 중단하고 반환헤야하는 경우 일반 익명함수로 표현할 필요가 있음음 *
 *
 * 인라인 함수
 * 함수가 호출괴는 곳에 내용 모두 복사
 * 함수의 분기 없이 처리되어 성능이 높아지나 코드량이 커질 수 있으니 주의
 * 코드가 복사되어 들어가기때문에 내용은 짧게 작성
 * 람다식 매개변수를 가지고 있는 함수형태 권장
 *
 * 인라인 함수 단점
 * 코드 복사 -> 내용 많은 함수에 사용 시 코드가 늘어남
 *
 * noinline키워드
 * 일부 람다식 함수를 인라인 되지 않게 하기 위해
 *
 * 확장함수
 * 클래스의 멤버 함수를 외부에서 더 추가할 수 있음
 * 너무 많이 만들 시 호환성 떨어질 수 있으나 적절히 사용시 매우 유용
 * */

fun main() {
    fun(x: Int, y: Int): Int = x + y
    val add: (Int, Int) -> Int = fun(x, y) = x + y // 익명함수 사용해서 add 선언
    val result = add(10, 2) //add 사용
    val add1 = fun(a: Int, b: Int) = a + b
    val add2 = { a: Int, b: Int -> a + b } // 람다식과 매우 흡사

    shortFunc(1){println("a: $it")}
    shortFunc2(1){println("a: $it")}
    shortFunc3(1){
        println("a: $it")
        //return // Bye는 실핼안됨
    }

    val source = "Hello World!"
    val target = "Kotlin"
    println(source.getLongString(target))
}

inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Hello")
    out(a)
}
inline fun shortFunc2(a: Int, noinline out: (Int) -> Unit) {
    println("Hello")
    out(a)
}

// 비지역 반환을 막는 crossinline - > 함수 본문에서 return 사용을 금지시킴
inline fun shortFunc3(a: Int, crossinline out: (Int) -> Unit) {
    println("Hello")
    out(a)
    println("Bye")
}

// String을 확장해 getLongString 추가
fun String.getLongString(target: String): String =
        if (this.length > target.length) this  else target
// this는 확장대상에 있던 자리의 문자열인 sourcr 객체를 나타냄