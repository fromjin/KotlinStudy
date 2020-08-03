package ch05

/** with()
 * 인자로 받는 객체를 이어지는 block의 receiver로 전달하며 결과값을 반환
 * run()과 기능 거의 동일하나 run은 receiver이 없지만
 * with()는 receiver로 전달할 객체를 처리
 * with는 세이프콜(?.) 지원하지 않기 때문에 let과 사용
 * 확장함수형태가 아닌 단독으로 사용되는 함수
 * */

public inline fun <T, R> with(receiver: T, block: T.() -> R): R  = receiver.block()

fun main() {
//    supportActionBar?.let {
//        with(it) { // 변수가 존재하므로 소괄호
//            setDisplayHomeAsUpEnabled(true) // this생략해 멤버 불러올 수 있음
//            setHomeAsUpIndicator(R.drawable.ic_clear_white)
//        }
//    }

    // null인 경우를 조사하려면 run을 확장함수형태로 사용하기
//    supportActionBar?.run {
//        setDisplayHomeAsUpEnabled(true)
//        setHomeAsUpIndicator(R.drawable.ic_clear_white)
//    }

    data class User(val name:String, var skill: String, var email: String? = null)
    val user = User("Jin", "default")
    val result = with(user) {
        skill = "Kotlin"
        email = "asd@asd.com"
        "success" // 필요하면 마지막 표현식 반환할 수 있음
    } // 기본적으로 unit반환
}