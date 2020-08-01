package ch04.section02

/**
 * While문 - 데몬 프로그램에 주로 사용 while(true)
while (조건식) {
본문
...
}

 * do while문
do {
본문
} while (조건식)
 * */

fun main() {

    print("Enter the number: ")
    var number = readLine()!!.toInt()
    // !!.난널단정기호 널값이 아닐거라고 단정하는 기호


    var factorial: Long = 1

    while (number > 0) {
        factorial *= number
        number--
    }
    println("factorila: $factorial")

    // 5-> 12345, 23451, 34512, ..

    do {
        print("Enter the number: ")
        val input = readLine()!!.toInt()

        for (i in 0 until input) { // 0..input-1
            for (j in 0 until input) { // 0..input-1
                print((i + j) % input + 1)
            }
            println()
        }
    } while (input != 0) // 0 입력 전까지 계속
}