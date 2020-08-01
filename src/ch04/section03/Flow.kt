package ch04.section03

/** 흐름제어
 *
 * 흐름제어문
 * return : 함수에서 결괏값을 반환하거나 지정된 라벨로 이동
 * break : for이나 while의 조건식에 상관없이 반복문을 끝냄
 * continue : for이나 while의 반복문의 본문을 모두 수행하지 않고 다시 조건으로 넘어감
 *
 * 예외 처리문
 * try {} catch{} : try 블록의 본문을 수행하는 도중 예외가 발생하면 catch 블록의 본문을 실행
 * try{} catch {} finally {} : 예외가 발생해도 finally 블록 본문은 항상 실행
 *
 * 인라인으로 선언되지 않은 람다식에서 라벨사용 (라벨 :  코드에서 특정한 위치를 임의로 표시)
 *
 * 람다식 함수명 라벨이름@ {
 * ...
 * return@라벨이름
 * }
 *
 * 암묵적 라벨 : 람다식 함수의 명칭을 그대로 라벨처럼 사용
 *
 * 일반 익명함수
 * fun(a, b) {
 * ...
 * return .. }
 * 비지역반환이 일어나지 않는 것이 장점
 * */

fun add(a: Int, b: Int): Int {
    return a + b
    println("이 코드는 실행되지 않습니다") // 여기에 도달하지 않음
}

// Unit을 명시적으로 반환 (생략가능)
fun hello(name: String): Unit {
    println(name)
    return Unit
}

fun main() {
    retFunc()
}

//inline fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
//    out(a, b)
//}
//
//fun retFunc() {
//    println("start of retFunc")
//    inlineLambda(13, 3) { a, b ->
//        val result = a + b
//        if (result > 10) return // 비지역반환이 일어남 retFunc()함수를 빠져나감
//        println("result: $result")
//    }
//    println("end of retFunc")
//}

fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) { // inline 제거
    out(a, b)
}

fun retFunc() {
    println("start of retFunc")
    inlineLambda(13, 3) lit@{ a, b ->  // 람다식 블록의 시작 부분에 라벨을 지정함
        val result = a + b
        if(result > 10) return@lit // 라벨을 사용한 블록의 끝부분으로 반환
        println("result: $result")
    } // 이 부분으로 빠져나간다
    println("end of retFunc") //  이 부분이 실행됨
}