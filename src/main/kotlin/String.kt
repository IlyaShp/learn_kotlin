import java.util.*

fun main() {

    val s = "Hello World"

    //можем обратиться к любому элементу строки
    println(s[6])

    //первая буква строки
    println(s.first())
    //последняя буква строки
    println(s.last())

    //мы можем сравнить начало строки в булевом формате
    //например, номер номер карты начинается на определённые цифры
    val cardNumber = "1234 8437 3284 2342"
    println(cardNumber.startsWith("1234"))

    //сделать имя с большой буквы или с маленькой
    val name = "Ilya"
    val newName = "diana"
    println(name.replaceFirstChar { it.lowercase(Locale.getDefault()) })
    println(newName.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })

    //обрезать первые пробелы
    var word = "   vot tak"
    println(word.trimStart())

    //можем заменить слово в строке
    var newWord = word.replace("vot", "budet")
    println(newWord)

    //можем разделять список другими разделителями
    val list = "Milk,Bread,Oranges,Kiwi"
    println(list.split(","))

    //чтение из консоли
    val input = readLine()

}