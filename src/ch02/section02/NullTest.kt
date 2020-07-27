package ch02.section02



fun main() {
    /** null을 허용한 변수 검사
     * 코틀린의 변수 선언은 기본적으로 null 불가능(NotNull)
     * */
    val a: Int = 22
    var b: String = "Jin"
    // var str: String - compile error

    /** null 가능한 선언(Nullable) - 데이터형?
     * 널 가능성을 검사해주는 것이 좋음
     * NPE (NullPointExeption) , 사용할 수 없는 null인 변수에 접근하면서 발생하는 예외
     * 단순 출력은 상관없으나 null인 상태에서 연산되는 멤버에 접근 시 NPE (악명높음)

     * String? 형식에는 세이프콜(?.)이나 넌널 단정 기호(!!.)가 허용

     * 세이프콜 : null이 할당되어 있을 가능성 있을 변수를 검사해 안전히 호출하도록 도와주는 연산자 - 변수이름?.
     * non-null 단정기호 : null이 아님을 단정하므로 컴파일러가 null검사 없이 무시 - 변수이름!!.
     * 따라서 null이 할당되어 있어도 컴파일러 잘 진행되나 실행 중 NPE발생 -> 되도록 사용 X, 반드시 널이 아님이 보장될 때만
    */
    val c: Int? = null
    var d: String? = null
    var e: String?
    e = null

    // println("e: $e, length: ${e?.length}")
    // e?.length 세이프콜 : e가 null이면 뒷부분 실행X

    /** 엘비스 연산자 ?:
     * null을 허용한 변수를 안전하고 간단하게 사용하기 위해 세이브콜과 엘비스 연산자 함께 사용
     * 엘비스 연산자로 변수가 null인지 아닌지 검사하여
     * null이 아니라면 왼쪽의 식을 그대로 실행하고
     * null이라면 오른쪽의 식을 실행
     * */
    val len = e?.length ?: -1 // val len = if(e!=null) e.length else -1 - if문
    println("e: $e, length: $len")
}