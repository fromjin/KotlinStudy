package ch05

import java.io.File

/** apply()
 * also()와 마찬가지로 호출하는 객체 T를 이어지는 block으로 전달하고 객체 자체인 this를 반환
 * T.()와 같은 표현에서 람다식이 확장 함수로서 처리
 * */

public inline fun <T> T.apply(block: T.() -> Unit): T {
    block(); return this
}

fun main() {
    data class Person(var name: String, var skills: String)

    var person = Person("Jin", "Kotlin")

    // 여기서 this는 person 객체를 가리킴
    person.apply { this.skills = "Java" } // person 자체를 반환
    println(person)

    // 할당문을 통해 할당
    val retrunObj = person.apply {
        name = "Jang" // this는 생략할 수 있음
        skills = "Android" // this 없이 객체의 멤버에 여러 번 접근 ( 멤버 많을 시 )
    }
    // apply는 확장함수로서 person은 this로 받아오는데 클로저 사용하는 방식과 같음
    // 객체 변경 시 원본 갹체에 반영되고 또한 이 객체는 this로 반환
    println(person)
    println(retrunObj)
}

fun makeDir3(path: String) {
    File(path).apply { mkdirs() }
}