package ch03.section04

/**
 * 함수의 블록({})
 * 블록내에서 사용하는 변수 - 지역변수
 *
 * 함수의 범위
 * 최상위함수와 지역함수*
 *
 * 지역변수
 * 특정 코드 블록 내에 사용할 때 지역변수
 * 블록 벗어나면 해당 변수는 프로그램 메모리에서 더이상 사용되지않고 삭제됨
 *
 * 전역변수
 * 최상위에 있는 변수로 프로그램 실행동안 삭제되지않고 메모리에 유지
 * 값이 유지되므로 편리하지만 코드가 길어지고 여러요소가 동시 접근할 경우 잘못 동작할 수 있음
 * 자주 사용되지않는 전역변수는 메모리낭비
 * 따라서 너무 많이 사용은 좋지않음*/
var global = 100

fun main() { // 최상위 레벨의 함수
    val local1 = 15
    println("main local1: $local1")
    c()

    global = 200
    println("main global: $global")
    a() //최상위 함수 언제 어디서든 호출 가능
//    e() // 오류 - c()함수에 정의된 e()는 c()의 블록을 벗어난 곳에서 사용 불가능
    fun f() {
    println("f")
}
    f() // 지역함수는 선언부 다음에 사용 가능

}

fun a() = b()
fun b() = println("b")

fun c() {
    val local1 = 20
//    fun d() = e() // d()는 지역함수이며 e()의 이름을 모름
    fun e() = println("e")
    println("c local1: $local1")

    global = 300
    println("c global: $global")
}