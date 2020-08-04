package ch06.section03
/** @(엣)기호 : 이너 클래스에서 바깥클래스의 상위 클래스 호출 시
 * super 키워드와 함께 @기호 옆에 바깥 클래스명 작성해 호출*/
open class Base{
    open val x: Int = 1
    open fun f() = println("Base f()")
}

class Child : Base() {
    override val x: Int = super.x +1
    override fun f() = println("Child f()")

    // 이너 클래스
    inner class Inside {
        fun f() = println("Inside f()")
        fun test() {
            f() // 현재 이너 클래스의 f() 접근
            Child().f() // 바로 바깥 클래스 Child f() 접근
            super@Child.f() // Child의 상위 클래스인 Base 클래스 f()접근
            println("[Inside] super@child.x:${super@Child.x}") // Child의 상위 클래스인 Base 클래스 x 접근
        }
    }
}

fun main() {
    val c = Child()
    c.Inside().test() // 이너 클래스 Inside의 메서드 test()실행
}