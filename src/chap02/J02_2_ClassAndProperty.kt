package chap02

class Person(
    val name: String,  // 읽기 전용 프로퍼티로 코틀린은 (비공개) 필드와 필드를 읽는 단순한 (공개) 게터를 만들어냄
    var isMarried: Boolean // 쓸 수 있는 프로퍼티로 코틀린은 (비공개) 필드와 단순한 (공개) 게터를 만들어냄
)

class Rectangle(val height:Int, val width: Int){
    val isSquare : Boolean
        get() { // 프로퍼티 게터 선언
            return height == width
        }
}

fun main() {
    val rectangle = Rectangle(41,43)
    println(rectangle.isSquare)
}