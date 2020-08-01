package ch04.section02

/** 반복문
 * for문 - 자바와 같은 세미콜론 표현식 사용하지 않음
 * for (요소 변수 in 컬렉션 혹은 범위) {
 *      반복할 본문
 * }
 *
 * 하행반복 - downTo
 * 필요한 단계 증가 - step
 *
 * */

fun main() {
    for (x in 1..5) { // 코틀린의 in과 범위 지정을 활용한 루프
        println(x) // 본문 (하나일 때 중괄호 생략 가능)
    }

    for (x in 1..5) println(x) // 한줄에 표현 가능

    var sum = 0
    for (x in 1..10) sum+=x
    println("sum:$sum")

    // 하행반복
    for (i in 5 downTo 1) print(i) // 54321
//  for (i in 5..1) print(i) // error!

    // 필요한 단계 증가
    for ( i in 1..5 step 2) print(i) // 135

    // 혼합 사용
    for (i in 5 downTo 1 step 2) print(i) // 531

    var total = 0

    for (num in 1..100 step 2) total+=num // 홀수합
    println("홀수합: $total")

    var total2 = 0

    for (num in 0..99 step 2) total2+= num // 짝수합
    println("짝수합: $total2")
}
