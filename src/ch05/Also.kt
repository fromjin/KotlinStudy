package ch05

import java.io.File

/** also()
 * 함수를 호출하는 객체 T를 이어지는 block에 전달하고 객체 T 자체를 반환
 * also는 블록 안의 코드 수행 결과와 상관없이 'T인 바로 객체 this' 반환
 * let은 마지막 수행된 코드 블록의 결과를 반환
 *
 * it은 매개변수 하나일 때 -> 아닌 = 랑 씀
 * */
public inline fun <T> T.also(block: (T) -> Unit): T {
    block(this); return this
}

fun main() {
    var m = 1
    m = m.also { it + 3 } // it에 m값 1 복사되어 전달
    // 연산 결과는 4지만 반환하지는 못함
    println(m) // 원본 값 1


    // property : name, skills
    data class Person(var name: String, var skills: String)

    var person = Person("Jin", "Kotlin")

    val a = person.let {
        it.skills = "Android" // person의 skills에 Android로 변경
        "Success" // a에 Success를 넣음
    }

    val b = person.also {
        it.skills = "Java" //person의 skills를 Java로 변경
        "success" // 마지막 문장은 사용되지않음 ( 반환은 person )
    } // b Person(name="Jin", skills="Java")
}

// 기존 디렉터리 생성 함수
fun makeDir (path: String): File {
    val result = File(path)
    result.mkdirs()
    return result
}

// let과 also를 통해 개선된 함수
fun makeDir2(path: String) = path.let{ File(it)}.also{it.mkdirs()}
// let은 식의 결과를 반환하고 그 결과를 also를 통해 넘겨짐
// 이때 중간 결과가 아니라 넘어온 결과만 반환