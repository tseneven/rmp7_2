import kotlin.math.max
import kotlin.math.min

fun main(){
    try{
        println("Введите a")
        var a = readln()!!.toInt()
        println("Введите b")
        var b = readln()!!.toInt()
        println("Введите c")
        var c = readln()!!.toInt()

        var maxab = max(a, b)
        var maxac = max(a, c)
        var maxab_ac = max(maxab, maxac)
        var minab = min(a, b)
        var minac = min(a, c)
        var minab_ac = min(minab, minac)
        var p = 0

        when{
            (maxab_ac + minab_ac != 0) ->
                p = (maxab_ac+ minab_ac) / 2
            else -> println("Нельзя делить на ноль")
        }
        println("Результат вычислений $p")
    }catch(e:Exception){
        println("Некорректные данные")
    }
}