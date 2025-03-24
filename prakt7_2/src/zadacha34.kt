import kotlin.math.sqrt

fun main() {
    try {
        println("Введите k:")
        val k = readln()!!.toDouble()
        println("Введите a:")
        val a = readln()!!.toDouble()
        println("Введите b:")
        val b = readln()!!.toDouble()

        // Преобразуем уравнение kx + b = a / x в квадратное: kx^2 + bx - a = 0
        val A = k
        val B = b
        val C = -a

        val D = B * B - 4 * A * C // Дискриминант

        when {
            D > 0 -> {
                val x1 = (-B + sqrt(D)) / (2 * A)
                val x2 = (-B - sqrt(D)) / (2 * A)
                val y1 = k * x1 + b
                val y2 = k * x2 + b
                println("Две точки пересечения:")
                println("(${x1}, ${y1})")
                println("(${x2}, ${y2})")
            }
            D == 0.0 -> {
                val x = -B / (2 * A)
                val y = k * x + b
                println("Одна точка пересечения:")
                println("(${x}, ${y})")
            }
            else -> println("Точек пересечения нет")
        }
    } catch (e: Exception) {
        println("Некорректные данные")
    }
}