package chap05

fun printProblemCounts(responses: Collection<String>){
    var clientErrors = 0
    var serverErrors = 0
    responses.forEach{
        if(it.startsWith("4")){
            // 람다 안에서 사용하는 외부변수를 람다가 포획한 변수
            clientErrors++
        }else if(it.startsWith("5")){
            serverErrors++
        }
        println("$clientErrors client errrors, $serverErrors server errors")
    }
}

fun main() {
    val responses = listOf("200 OK", "418 I'm a teapot", "500 Internal Server Error")
    printProblemCounts(responses)
}