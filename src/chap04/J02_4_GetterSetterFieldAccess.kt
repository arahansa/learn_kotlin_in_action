package chap04

class User8(val name:String){
    var address: String = "unspecified"
        set(value:String){
            println("""
                Address was changed for $name :
                "$field" -> "$value".""".trimIndent())
            field = value
        }
}

fun main(){
    val user = User8("Alice")
    user.address = "주안동"
    user.address = "주안동1"
}