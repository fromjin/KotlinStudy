package ch06.section03

open class Bird (var name: String, var wing: Int, var beak: String) {
    fun fly() { println("Fly") }
}


class Lark (name: String, wing: Int, beak: String, var tone: String) : Bird(name, wing, beak) {
    // 주 생성자는 프로퍼티와 같이 직접 선언 가능
    fun singLowtone() { println("sing Lowtone") }
}

class Parrot : Bird {
    var color: String

    // 부생성자에서는 프로퍼티와 같이 직접 선언할 수 없으므로 상위에 선언
    // 부생성자에서 super로 전달 super은 기반클래스의 Bird로 전달 ( 상위의 프로퍼티가 초기화 )
    constructor(name: String, wing: Int, beak: String, color: String) : super(name, wing, beak){
        this.color = color
    }
    fun singHightone() { println("sing Hightone") }
}

fun main() {
    val lark = Lark("lark",2,"short","low")
    val parrot = Parrot("parrot",2,"long","yellow")
    parrot.singHightone()
    parrot.fly()
    lark.singLowtone()
    lark.fly() // 기반클래스의 메소드도 가능
}