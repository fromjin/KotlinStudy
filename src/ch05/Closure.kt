package ch05

/** 클로저
 *
 *  람다식으로 표현된 내부 함수에서 외부 범위에 선언된 변수에 접근할 수 있는 개념
 *  람다식 안에 있는 외부 변수는 값을 유지하기 위해 람다가 포획한 변수
 *
 *  함수 안에 정의된 변수는 로컬 변수로 스택에 저장되어 잇다가 함수가 끝나면 같이 사라지지만
 *  클로저 개념에서 포획한 변수는 참조가 유지되어 종료되어도 사라지지않고 접근하거나 수정 가능
 *
 *  내부의 람다식 함수에서 외부 함수의 변수에 접근해 처리해서 효율성을 높힐수 있고 완전히 다른 함수에서 변수의 접근을 제한 할 수 있음
 * */

fun main() {

    val calc = Calc() // 객체 생성
    var result = 0 // 외부의 변수
    calc.addNum(2,3) { x, y -> result = x + y }  // 클로저
    println(result) // 값을 유지하여 5가 출력
    // result는 람다식 내부에서 재할당 되어 사용되는데 이때 할당된 값은 유지되 출력문에 사용 가능
    // 클로저에 의해 독립된 복사본을 가지고 사용용
    filteredNames(4)
}

// 길이가 일치하는 이름만 반환
fun filteredNames(length: Int) {
    val names = arrayListOf("Kim", "Hong", "Go", "Hwang", "Jeon")
    val filterResult = names.filter {
        it.length == length // 바깥의 length에 접근
    }
    println(filterResult)
} // 함수 자체를 같이 포획해 해당 매개변수에 접근

class Calc {
    fun addNum(a: Int, b: Int, add: (Int, Int) -> Unit) { // 람다식 add에는 반환값이 없음
        add(a, b)
    }
}