package practice

fun fib(n: Int): Int =
    if (n < 3) { n - 1 }
    else { fib(n - 2) + fib(n - 1)}

fun fib2(n:Int): Int = when(n){
    1,2 -> n-1
    else -> fib2(n-2) + fib2(n-1)
}

fun main() {
    for(i in 1..10){
        print("${fib2(i)}, ")
    }
}