import kotlin.math.max
import kotlin.math.min

fun main(){
    try{
        println("Введите a")
        var x = readln()!!.toInt()
        println("Введите b")
        var y = readln()!!.toInt()
        println("Введите c")
        var m = readln()!!.toInt()
        println("Введите c")
        var n = readln()!!.toInt()

        when{
            ((x-y) < (m%n)) -> x++
            else -> println("x остался прежним")
        }
        println("Результат вычислений $x")
    }catch(e:Exception){
        println("Некорректные данные")
    }
}