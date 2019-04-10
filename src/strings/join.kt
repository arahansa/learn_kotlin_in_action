package strings

fun <T> joinToStringFromJoinKt(
    collection: Collection<T>,
    separator:String,
    prefix:String,
    postfix:String
): String{
    val result = StringBuffer(prefix)
    for((index, element) in collection.withIndex()){
        if(index > 0 ) result.append(     separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}


fun <T> Collection<T>.joinToString(
    separator: String=",",
    prefix: String="",
    postfix: String=""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}


// 확장 함수를 만들려면 함수 이름앞에 그 함수가 확장할 클래스의 이름을 붙이면 된다.
fun String.lastChar() :Char = this.get(this.length - 1)

fun main() {
    println("Kotlin".lastChar())

    val list = listOf(1,2,3)
    println(list.joinToString(separator = ";", prefix = "(", postfix = ")"))
}