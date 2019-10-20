package chap06


// null safe 하게 만들기하려면 마지막에 ? 붙여야
fun strLenSafe(s: String?) {
    if (s != null) {
        s.length
    } else 0
}

// ?. 연산자
fun printAllCaps(s: String?){
    // null 일 경우는 null 표현
    val allCaps: String? = s?.toUpperCase()
    println(allCaps)
}

fun main() {
    printAllCaps("abc")
    printAllCaps(null)
}