package chap03

// 여기서 to는 중위 호출
// 인자가 하나뿐인 일반 메소드나 인자가 하나뿐인 확장 함수에 중위호출을 사용할 수 있다.
val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

fun main() {
    println(map)
    println(1.to("one"))
    println(1 to "one")

    val (number, name) = 1 to "one"
    println(number) // 1
    println(name) // one
}