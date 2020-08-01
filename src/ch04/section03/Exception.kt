package ch04.section03

/** 예외
 *
 *  try { 예외 발생 가능성이 있는 문장 }
 *  catch (e : 예외처리 클래스명) { 예외 터리하기 위한 문장 }
 *  finally { 반드시 실행되어야 하는 문장 }
 *
 *  반드시 실행되어야 할 작업 없으면 finally 블록 생략 가능능
 *
 *  산술 연산에 대한 예외를 따로 특정해서 잡을 때
 *  catch ( e: ArithmeticException ) { println (e.message) }
 *
 *  스택의 추적
 *  e.printStackTrace() 사용 시 임시 메모리 영역인 스택 추적 가능
 *
 *  특정 조건에 따른 예외 발생시키기 - 의도적으로 발생
 *  throww Exception(message: String)
 **/

fun main() {
    val a = 6
    val b = 0
    val c : Int

    try {
        c = a/b // 0으로 나눔
        println("After") // 위에서 예외 발생해서 해당 실행 안됨
    } catch (e : Exception){
        println("Exception is handled.")
    } finally {
        println("finally 블록은 반드시 항상 실행됨")
    }

    var amount = 600
    try {
        amount -= 100
        checkAmount(amount)
    } catch (e: Exception) {
        println(e.message)
    }
    println("amount: $amount")
}

fun checkAmount(amount: Int) {
    if (amount<1000) {
        throw Exception("잔고가 $amount 으로 1000이하 입니다")
    }
}