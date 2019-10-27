package chap06

fun <T> printHashCode(t: T){
    println(t?.hashCode())
}

fun <T:Any> printHashCode2(t:T){
    println(t.hashCode())
}

fun main() {
    printHashCode(null)
    printHashCode2(null)
}