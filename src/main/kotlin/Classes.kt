fun main() {
    val p1 = Person("Tom", "Peterson", 28)
    println(p1.lastName)

    val child = Person("Eric", "Jones", 4)
    val p2 = Person("Amanda", "Jones", 31, child)

    val rectangle1 = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle1.perimeter}")

    val rectangle2 = Rectangle(5.0, 2.0)
    println(rectangle1 == rectangle2)
}

//создаём class вместе с конструктором
//такое создание называется Первичным конструктором (Primary Constructor)
class Person(val firstName: String, val lastName: String, var age: Int) {
    var children: MutableList<Person> = mutableListOf() // ArrayList

    //можно добавить блоки, которые будут выполняться при создании объекта -- init-блоки
    init {
        println("Person $firstName is created")
    }

    //есть Вторичный конструктор
    //он всегда должен вызывать в себе Первичный конструктор
    //создаётся с помощью ключевого слова -- constructor
    //похоже на перегрузку конструкторов в Java
    constructor(firstName: String, lastName: String, age: Int, child: Person) : this(firstName, lastName, age) {
        children.add(child)
    }

    //создание конструктора без аргументов
    constructor() : this("Tom", "Reynold", 19)
}

//---------------------------__Ключевое слово data__-----------------------------------
//если пометить класс ключевым словом data, то автоматически будут создаваться
//методы toString(), equals(), hashCode(), copy()

data class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2

    //можем создать свой getter или свой setter для какого-нибудь поля
    var test = 1
        get() = field + 1
        set(value) {
            if (value < 0) println("Negative value")
            field = value
        }

    //вот так выглядит метод внутри класса
    fun area() = height * length
}