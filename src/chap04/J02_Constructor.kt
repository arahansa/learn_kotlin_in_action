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
//  User3 의 축약형태
class User4(val nickname: String)

// 기반 클래스를 초기화하려면 기반 클래스 이름 뒤에 괄호를 치고 생성자 인자를 넘긴다
open class User5(val nickname:String)
class TwitterUser(nickname:String) : User5(nickname){
    override fun toString(): String {
        return nickname
    }
}

// 인자가 없는 디폴트 생성자가 만들어진다
open class Button1
// 하위클래스는 반드시 Button 클래스의 생성자를 호출
class RadioButton: Button1()


class Secrective private constructor(){

}

fun main() {
    User("hi")

    var tu = TwitterUser("난트위터유저다")
    println(tu)
    // Secrective()
}