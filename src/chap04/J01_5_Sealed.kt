package chap04

import java.lang.IllegalArgumentException

interface Expr
class Num(val value:Int): Expr
class Sum(val left:Expr, val right: Expr): Expr

fun eval(e: Expr) : Int =
        when(e){
            is Num -> e.value
            is Sum -> eval(e.right) + eval(e.left)
            else -> throw IllegalArgumentException("Unknown expression")
        }


sealed class SExpr{
    class Num(val value:Int): SExpr()
    class Sum(val left:SExpr, val right: SExpr): SExpr()
}

fun eval2(e:SExpr): Int =
    when(e){
        is SExpr.Num -> e.value
        is SExpr.Sum -> eval2(e.right) + eval2(e.right)
    }
