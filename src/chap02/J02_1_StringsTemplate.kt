package chap02

fun main(args: Array<String>) {
    val name = if (args.size > 0 ) args[0] else "Kotlin"
    println("Hello $name")

    if(args.size > 0){
        println("Hello ${args[0]}")
    }

    println("Hello, ${if (args.size > 0) args[0] else "someone"} ! ")


    fun max(a:Int, b:Int) : Int = if(a>b) a else b
    println(max(1,2))
}