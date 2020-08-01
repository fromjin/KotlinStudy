package ch04.section01

fun main() {
    print("Enter the Score: ")
    // 코틀린 io의 표준함수인 readline()은 콘솔로부터 한 줄 입력을 받아들임
    val score = readLine()!!.toDouble()

    var grade: Char = 'F'

    /** 비교 연산자와 논리 연산자의 복합
     * -> 범위 연산자
     * 변수명 in 시작값..마지막값
     * score in 80..89 - score 범위에 80부터 89까지 포함
     */

    if(score>=90.0) grade = 'A'
    else if(score in 80.0..89.9) grade = 'B' // score>=80.0 && score<=89.9
    else if(score in 70.0..79.9) grade = 'C' // score>=70.0 && score<=79.9

    when(score) {
        in 90.0..100.0 -> grade= 'A'
        in 80.0..89.9 -> grade= 'B'
        in 70.0..79.9 -> grade= 'C'
        else -> grade = 'F'
    }

    println("score: $score, grade: $grade")
}