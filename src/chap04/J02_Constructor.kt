package chap04

class User(val nickname: String)

// 초기화 블록은 클래스의 객체가 만들어질 때 실행될 초기화 코드가 들어감
class User2 constructor(_nickname: String){
    val nickname: String
    // 초기화 블록은 주 생성자와 함께 사용됨
    init{
        nickname = _nickname
    }
}

class User3(_nickname: String){
    val nickname = _nickname
}

class Secrective private constructor(){

}

fun main() {
    User("hi")
    // Secrective()
}