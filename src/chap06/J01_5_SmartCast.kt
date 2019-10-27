package chap06

class Person2(val firstName:String, val lastName: String){
    override fun equals(other: Any?): Boolean {
        // 타입이 서로 일치하지 않으면 fasle를 반환한다
        val otherPerson  = other as? Person2 ?: return false
        return otherPerson.firstName ==  firstName &&
                otherPerson.lastName == lastName
    }

    override fun hashCode(): Int = firstName.hashCode() * 37 + lastName.hashCode()
}

fun ignoreNulls(s: String?){
    val sNotNull: String = s!! // 에러발생라인
    println(sNotNull.length)
}

fun main() {
    ignoreNulls(null)
}