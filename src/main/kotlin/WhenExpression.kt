fun main() {
    //похоже на switch case в Java, но позволяет делать некоторые вещи удобнее
    testWhen(2)
    testWhen(18)
    testWhen("Hello World")
    testWhen(true)
}

//Any -- означает любой тип данных
fun testWhen(input: Any) {
    when (input) {
        1 -> println("Единица")
        2 -> println("Двойка")
        3 -> println("Тройка")
        in 10..20 -> println("от 10 до 20")
        is String -> println("была введена строка длиной ${input.length}")
        else -> println("что-то ещё")
    }
}