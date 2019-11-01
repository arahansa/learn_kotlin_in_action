package chap06

fun sendEmailTo(email: String){
    println("Sending Email to $email")
}

fun main() {
    var email: String? = "yole@example.com"
    email?.let{ sendEmailTo(it)}
    email = null
    // null 이므로 let 이 실행되지 않는다
    email?.let{ sendEmailTo(it)}
}