package chap04

fun getFacebookName(facebookAccountId: Int): String {
    return ""
}

class User1{
    val nickname:String
    constructor(email:String){
        nickname = email.substringBefore('@')
    }
    constructor(facebookAccountId:Int){ // 부생성자
        nickname = getFacebookName(facebookAccountId)
    }
}

class User9 private constructor(val nickname: String){
    companion object{
        fun newSubscribingUser(email: String) = User(email.substringBefore('@'))
        fun newFacebookUser(accountId: Int) = User(getFacebookName(accountId))
    }
}