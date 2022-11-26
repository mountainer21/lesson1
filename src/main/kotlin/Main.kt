fun main() {
    println("Программа расчета объема параллелепипида:")
    println()
    println("Введите длину параллелепипида:")
    val lenght: Int = readln().toInt()
    println("Введите ширину параллелепипида:")
    val high: Int = readln().toInt()
    println("Введите высоту параллелепипида:")
    val widht: Int = readln().toInt()
    println(lenght*widht*high)
}