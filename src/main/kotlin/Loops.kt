fun main() {
    //---------------------------___FOR EACH___-----------------------------------

    //создаём список из неизменяемых строк
    val items = listOf("apple", "banana", "orange")     // List.of() in Java 9

    //создать список с изменяемыми переменными
    var items2 = mutableListOf("apple", "banana", "orange")

    //вывести на экран каждую из строк коллекции
    for (item in items)
        println(item)

    //-----------------------------___WHILE___------------------------------------

    var index = 0
    while (index < items.size) {
        println("Item at $index is ${items[index]}")
        index++
    }

    //--------------------------___ДИАПАЗОНЫ___-----------------------------------

    println(5 in 3..10) //true

    for (i in 1..10)
        println(i)

    //пройтись по диапазону, но не учитывать последний элемент
    for (i in 1 until 10)
        println(i)

    //можно идти по диапазону в убывающем порядке
    for (i in 10 downTo 1)
        println(i)

    //в диапазоне можно указать шаг
    for (i in 0..100 step 10)
        println(i)


}