package chap04

// 코틀린에서는 인터페이스에 추상 프로퍼티 선언을 넣을 수 있다
interface User6{
    val nickname: String
}

class PrivateUser(override val nickname: String): User6

// 매번 계산하는 형태
class SubscribingUser(val email:String): User6{
    override val nickname: String
        get() = email.substringBefore('@')
}

// 필드에 저장하는 형태
class FaceBookUser(val accountId: Int): User6{
    override val nickname = getFacebookName(accountId)
    private fun getFacebookName(accountId: Int): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}


interface User7{
    val email:String
    val nickname: String
        get() = email.substringBefore('@')
}