package ch06.section03

/** 다형성
 * 같은 이름이나 구현내용 혹은 매개변수가 달라 하나의 이름으로 다양한 기능을 수행
 *
 * static : 컴파일타임에 결정됨 - 오버로딩
 * dynamic : 런타임 - 오버라이딩
 *
 * 오버라이딩
 * 기반클래스 메소드에 open
 * 하위클래스 메소드에 override 키워드 붙히기
 *
 * 오버라이딩 금지 final 키워드 - 하위클래스에서 재정의 금지
 *
 * super 상위 클래스
 * this 현재 클래스
 */
open class Bird (var name: String, var wing: Int, var beak: String) {
    open fun fly() { println("Fly") } // 오버라이딩 가능하게 하려면 open 키워드 붙혀야함
}


class Lark (name: String, wing: Int, beak: String, var tone: String) : Bird(name, wing, beak) {
    // 주 생성자는 프로퍼티와 같이 직접 선언 가능
    fun singLowtone() { println("sing Lowtone") }
    override fun fly() {
        super.fly() //  상위 클래스의 fly() 먼저 수행
        println("I'm a Lark. I fly.")
        singLowtone()
    }

}

 open class Parrot : Bird {
    var color: String

    // 부생성자에서는 프로퍼티와 같이 직접 선언할 수 없으므로 상위에 선언
    // 부생성자에서 super로 전달 super은 기반클래스의 Bird로 전달 ( 상위의 프로퍼티가 초기화 )
    constructor(name: String, wing: Int, beak: String, color: String) : super(name, wing, beak){
        this.color = color
    }
    fun singHightone() { println("sing Hightone") }

    final override fun fly() { // 하위 클래스에서 재정의 금지
        println("slow fly")
    }
}

open class Person {
    constructor(firstName: String) {
        println("[Person] firstName: $firstName")
    }
    constructor(firstName: String, age: Int) { // 3
        println("[Person] firstName: $firstName, $age")
    } // 4 빠져져나감
}

class Developer: Person {

    constructor(firstName: String): this(firstName, 10) { // 1 인자 두개짜리 생성자 참조
        println("[Developer] $firstName")
    } // 6 빠져나감
    constructor(firstName: String, age: Int): super(firstName, age) { // 2 super로 상위 클래스의 생성자 참조
        println("[Developer] $firstName, $age")
    } // 5 빠져나감
}



fun main() {
    val lark = Lark("lark",2,"short","low")
    val parrot2: Bird = Parrot ("lark2",2,"short","red")
    val parrot = Parrot("parrot",2,"long","yellow")
    parrot.singHightone()
    parrot.fly() // 오버라이드된 slow fly
    lark.singLowtone()
    lark.fly() // 기반클래스의 메소드도 가능

    parrot2.fly() // 하위 타입에 맞춰진 slow fly가 실행
//    lark2.singLowtone() 하위에 있는 메소드 사용 못함

    val jin = Developer("Jin") // 인자 하나짜리 생성자 호출
}