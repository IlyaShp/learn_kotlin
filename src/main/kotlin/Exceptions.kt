fun main() {
    val a = 10
    val b = 0

    //обрабатываем/отлавливаем исключение
    try {
        println(a / b)
    } catch (e: ArithmeticException) {
        e.printStackTrace() //посмотреть что же произошло в программе, что вызвало исключение
        println("Попытка деления на 0")
    } finally {
        println("Finally вызывается всегда")
    }

    println("Программа не остановилась, т.к. мы отловили исключение")

    //можем сами генерировать исключения
    throw ArrayIndexOutOfBoundsException()

}