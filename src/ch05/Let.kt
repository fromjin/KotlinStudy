package ch05

/** let()
 * 함수를 호출하는 객체 T를 이어지는 block의 인자로 넘기고 block의 결과값 R을 반환
 * 매개변수 block은 T를 매개변수로 받아 R을 반환
 * let()함수 역시 R을 반환
 * 아래의 this는 객체 T를 가리키는데 람다식 결과 부분을 그대로 반환한다는 뜻
 * 다른 메서드를 실행하거나 연산을 수행해야 하는 경우 사용
 *
 * 체이닝
 * 여러 메서드 혹은 함수를 연속적으로 호출하는 기법법
 *
 * let과 세이프콜(?.) 함께 사용해 널 검사 */

public inline fun <T, R> T.let(block: (T) -> R): R {
    return block(this) // 객체 T를 가리키는 참조 형태 this
}

fun main() {
    val score: Int? = 32 // 널가능한 정수형 타입

    // 일반적인 null검사사
    fun checkScore() {
        if (score != null) println("Score: $score")
    }

    // let을 사용해 null 검사를 제거
    fun checkScoreLet() {
        score?.let { println("Score: $it") } // 스코어에 let() 세이프콜 형태로 호출 (자동 널검사)
        val str = score.let { it.toString() } // it은 score자체를 복사하는 개념
        println(str)
    }

    var a = 1
    var b = 2
    a = a.let { it + 2 }.let {
        println("a = $a") // 복사된 값(변경전) 1
        val i = it + b // it 3, i 5
        i // 5
    }
    println(a)

    var x ="kotlin!"
    x.let { outer ->
        outer.let { inner ->
            print("Inner is $inner and outer is $outer")
        } // 이때는 it을 사용하지 않고 명시적 이름 사용
    }

    x.let { outer ->
        outer.let { inner ->
            print("Inner is $inner and outer is $outer")
            "Inner String" // 이것은 반환되지 않음
        }
        "Outer String" // 이 문자열이 반한되어 x에 할당 (할당문과 가장 가까운 식)
    }

    val firstName: String? ="Jang"
    var lastName: String = "HyeJin"

    // else문을 포함한 문장은 엘비스연산자로 대체
    firstName?.let { print("$it $lastName") } ?: print(lastName)
}