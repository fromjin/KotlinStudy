package ch05

/** run()
 * 인자가 없는 익명함수처럼 동작하는 형태와
 * 각체에서 호출하는 형태 두 가지로 사용
 * */

public inline fun <R> run(block: () -> R): R  =  block()
public inline fun <T, R> T.run(block: T.() -> R): R =  block()

fun main() {
    var skills = "Kotlin"

    val a = 10
    skills = run {
        val level = "Kotlin Level:" + a
        level // 마지막 표현식이 반환됨
    } // Kotlin Level:10

    data class Person(var name: String, var skills: String)

    var person = Person("Jin", "Kotlin")

    val returnObj = person.apply {
        name = "Jang"
        skills = "Java"
        "success" // person변경되고 반환되지않음
    }
    println(person) // Person(name=Jang, skills=Kotlin)
    println(returnObj) // Person(name=Jang, skills=Kotlin)

    val returnObj2 = person.run {
        name = "Hye"
        skills = "C"
        "success" // person변경되고 반횐됨
    }

    println(person) // Person(name=Hye, skills=Kotlin)
    println(returnObj2) // success
}