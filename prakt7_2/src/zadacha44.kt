fun main() {
    try {
        println("Введите количество пропущенных часов для группы 1:")
        val N1 = readln()!!.toInt()
        println("Введите количество пропущенных часов для группы 2:")
        val N2 = readln()!!.toInt()
        println("Введите количество пропущенных часов для группы 3:")
        val N3 = readln()!!.toInt()

        when {
            minOf(N1, N2, N3) < 10 -> println("Есть хорошая группа")
            else -> println("Нет хорошей группы")
        }
    } catch (e: Exception) {
        println("Некорректные данные")
    }
}