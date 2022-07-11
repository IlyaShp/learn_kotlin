fun main() {
    //fun -- это те же методы, что и в Java

    println(testSimple())
    println(testSimple2(10, 20))
    println(testSimple3(158))

    println(testNamedArguments(z = 3, y = 9, x = 1))

    println(testDefaultArguments(y = 20))

    println("")
    printEven(1, 2, 3, 4, 5, 6, 7, 8)

    //можем передавать массив элементов
    printEven(*intArrayOf(1, 2, 3, 4, 5, 6), 9, 5, 2, 6)
}

//функция без аргументов
fun testSimple(): Int {
    return 5 + 5
}

//функция с аргументами
//можно не указывать тип возвращаемого значения функции и писать "=" если у функции один return
fun testSimple2(x: Int, y: Int) = x + y

//функция принимает целое число, а возвращает строку
fun testSimple3(x: Int): String {
    return "String is $x"
}

//именнованные аргументы
//когда будем передавать аргументы, то можем чётко указывать какое значение в какой аргумент передаём
fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

//аргументы по-умолчанию -- мы указываем в методе аргументы и в дальнейшем можем их передать или не передать
fun testDefaultArguments(x: Int = 1, y: Int = 4) {
    println(x + y)
}

//альтернатива перегрузки методов (т.е. перегрузка методов не нужна, потому что есть аргументы по-умолчанию)
fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) {
    (if (toUpperCase) name.toUpperCase() else name) + number
}

//vararg -- это когда мы в функцию передаём любое количество элементов
fun printEven(vararg numbers: Int) {
    numbers.forEach { e -> if (e % 2 == 0) println(e) }
}
