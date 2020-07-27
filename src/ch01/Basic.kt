package ch01

// fun ch01.ch02.ch02.section01.main() {
//    println("Hello Kotlin!")
// }

// Decompile된 소스
// public final class HelloKotlinKt {
//    public static final void ch01.ch02.ch02.section01.main() {
//        String var0 = "Hello Kotlin!";
//        System.out.println(var0);
//    }
//
//    public static void ch01.ch02.ch02.section01.main(String[] var0) {
//        ch01.ch02.ch02.section01.main();
//    }
// }

/**
* 실행 단축키 ctrl + shifht + f10
* ch01.ch02.ch02.section01.main 메소드는 파일명을 기준으로 자동으로 클래스 생성
* (Tools-Kotlin-Show...-Decompile로 확인)
*
* ch01.ch02.ch02.section01.main()은 최상위 함수로 '실행 진입점'
* 자바는 프로그램 실행위해 클래스와 그 안의 ch01.ch02.ch02.section01.main() 필요
* 코틀린은 클래스 없이 ch01.ch02.ch02.section01.main()함수 하나로 실행 가능
 */

fun main(args: Array<String>) {
    /**
    * args : 프로그램 외부에서 인자를 받아들임
    * Edit Configurations에 들어가서
    * Programs arguments에 공백기준으로 넣기
    */
    println("args[0] = ${args[0]}") // ${식} : 문자열 내 변수 표현
    println(args[1]) // '외부의' 두번째 인자 실행
    println(args[2]) // ctrl+D 줄복사
    println(args[3]) // 네번째 인자 실행
}