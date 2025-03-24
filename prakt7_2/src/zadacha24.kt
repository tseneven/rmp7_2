import kotlin.math.max
import kotlin.math.min

fun main(){
    try{
        println("Введите x")
        var x = readln()!!.toInt()
        println("Введите y")
        var y = readln()!!.toInt()

        when{
            (x > 0 && y > 0) -> println("В I четверти")
            (x > 0 && y < 0) -> println("В II четверти")
            (x < 0 && y < 0) -> println("В III четверти")
            (x < 0 && y > 0) -> println("В VI четверти")
        }
    }catch(e:Exception){
        println("Некорректные данные")
    }
}