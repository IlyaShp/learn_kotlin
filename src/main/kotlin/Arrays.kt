fun main() {
    //создание и инициализация массива
    val list: Array<Int> = arrayOf(3, 4, 5, 6, 7)
    var names: Array<String> = arrayOf("John", "Kelly", "Bob")
    //можно не указывать тип массива
    var names2 = arrayOf("Ilya", "Diana", "Kelvin")

    //обратиться к первому элементу массива
    println(list[0])
    println(names[1])
    println(names2[2])


    //изменение элемента массива
    names[0] = "Damir"
    //либо так
    names.set(0, "Miron")
    //получаем элемент массива
    println(names.get(0))

    //узнать размер массива
    println(names2.size)

    //пройтись по массиву в цикле
    for (i in names) {
        println(i)
    }
    //либо
    names2.forEach { el -> println(el) }



}