package chap02

import java.lang.IllegalArgumentException

interface Expr
class Num(val value:Int):Expr
class Sum(val left:Expr, val right:Expr):Expr


/**
 * 스마트 캐스트 : is 로 검사하고 나면 굳이 변수를 원하는 타입으로
 * 캐스팅 하지 않아도 마치 처음부터 그 변수가 원하는 타입으로 선언된 것처럼 사용할 수 있다.
 */
fun eval(e:Expr): Int{
    if(e is Num){
        return e.value
    }
    if(e is Sum){
        return eval(e.right) + eval(e.left) // 변수 e 에 대해서 스마트 캐스트를 사용한다
    }
    throw IllegalArgumentException("Unknown expression")
}

fun eval2(e: Expr) : Int =
        if(e is Num){
            e.value
        }else if (e is Sum){
            eval(e.right) + eval(e.left)
        }else{
            throw IllegalArgumentException("Unknown Expression")
        }


fun eval3(e:Expr): Int =
        when(e){
            is Num -> e.value
            is Sum -> eval(e.right) + eval(e.left)
            else -> throw IllegalArgumentException("Unknown Expression")
        }

fun evalWithLogging(e: Expr) : Int =
        when(e){
            is Num -> {
                println("num : ${e.value}")
                e.value
            }
            is Sum -> {
                val left = evalWithLogging(e.left)
                val right = evalWithLogging(e.right)
                left + right
            }

            else -> throw IllegalArgumentException("Unknown Expression")
        }

fun main() {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(eval2(Sum( Num(1), Num(2))))

    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
}