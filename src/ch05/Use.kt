package ch05

import java.io.FileOutputStream
import java.io.PrintWriter

/** use()
 * 객체를 사용한 후 close()등을 자동적으로 호출해 닫아준다
 * T의 제한된 자료형을 보면 Closeable?로 block은 닫힐 수 있는 객체를 지정해야함
 * */

// public inline fun <T : Closeable?, R> T.use(block: (T) -> R): R

fun main() {

    //PrintWriter은 파일을 열거나 새롭게 생성해 파일에 출력가능
    // use를 사용하고 있는데 println 사용 가능
    // 이후 use 열었던 파일을 닫아주는 작업 내부에서 진행
    PrintWriter(FileOutputStream("d:\\test\\output.txt")).use {
        it.println("hello") // hello가 output.txt에 기록
    }
}