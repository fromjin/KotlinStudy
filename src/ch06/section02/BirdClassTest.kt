package ch06.section02

class Bird {

    constructor(name: String, wing: Int, beak: String) {
        this.name = name
        this.wing = wing
        this.beak = beak
    } // 부 생성자

    constructor(name:String, beak:String) {
        this.name = name
        this.wing = 1
        this.beak = beak
    } // 부 생성자자

   // 프로퍼티
    var name: String
    val wing: Int
    var beak: String

    // 메서드
    fun fly() {
        println("Fly")
    }

    init {
        println("-----init start-----")
        // 객체 생성시 자동 실행
        // 간단한 코드 넣기
        println("-----init end-----")
    }
}

class Bird2(var name:String, var wing:Int) {

    // 메서드
    fun fly() {
        println("Fly")
    }
}

fun main() {
    val coco = Bird("coco",2,"short")
    coco.fly()
    println("name: ${coco.name}")
    val coco2 = Bird("coco2","long")
    println("name: ${coco2.name}, wing: ${coco2.wing}, beak: ${coco2.beak}")

    val nana = Bird2("nana",2)
}