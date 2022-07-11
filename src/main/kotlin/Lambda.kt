fun main() {
    val a = listOf(1, 2, 3, 4, 5)

    //пройтись по каждому элементу и напечатать каждый элемент
    a.forEach { e -> println(e) }

    //каждый элемент умножить на два
    println(a.map { e -> e * 2 })

    //пройтись по каждому элементу и оставить только чётные
    println(a.filter { e -> e % 2 == 0 })

    //сложить все значения
    println(a.reduce { sum, e -> sum + e })

    //-----------__Функции на коллекциях__---------------

    //отсортировать по убыванию
    println(a.sortedByDescending { it })

    //пробежаться по коллекции и вернуть true, если есть хотя бы один элемент, удовлетворяющий условию
    println(a.any { it > 10 })

    //пробежаться по коллекции и вернуть true, если все элементы удовлетворяют условию
    println(a.all { it < 10 })

    //суммировать все элементы коллекции
    println(a.sum())

    //partition -- может разделить коллекцию на две коллекции
    val numbers = listOf(1, 3, -4, 2, -11)
    val (positive, negative) = numbers.partition { it > 0 }
    println(positive)
    println(negative)

    //группировка
    //в данном примере получится HashMap
    val result = listOf("a", "b", "ba", "ccc", "ad").groupBy { it.length }
    println(result)



}