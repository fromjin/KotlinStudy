package ch06.section03

/** 인터페이스는 '구현'한다 */
open class A {
    open fun f() = println("A class f()")
    fun a() = println("A class a()")
}

interface B { // 인터페이스는 기본적으로 open
    fun f() = println("B interface f()")
    fun b() = println("B interface b()")
}

class C: A(), B { // 콤마 이용해 클래스와 인터페이스 지정
    override fun f() = println("C class f()") // 컴파일 되려면 f() 오버라이딩 되야함
    fun test() {
        f() // 현재 클래스의 f()
        b() // 인터페이스 B의 b()
        super<A>.f() // A클래스의 f()
        super<B>.f() // 인터페이스B의 f()
    }
}

fun main() {
    var c = C()
    c.test()
}