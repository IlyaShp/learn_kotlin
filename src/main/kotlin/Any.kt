fun main() {
    //Any -- класс общий для всех (как в Java -- Object)
    //у него есть методы toString(), equals(), hashCode()

    val user1 = User("Ilya", "Shpachenko", 32)
    println(user1)      //User(firstName='Ilya', lastName='Shpachenko', age=32)

    val user2 = User("Ilya", "Shpachenko", 32)
    val user3 = User("Damir", "Shpachenko", 7)

    println(user1 == user2)     //true
    println(user2 == user3)     //false
}

class User (var firstName: String, var lastName: String, var age: Int) {
    override fun toString(): String {
        return "User(firstName='$firstName', lastName='$lastName', age=$age)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (firstName != other.firstName) return false
        if (lastName != other.lastName) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = firstName.hashCode()
        result = 31 * result + lastName.hashCode()
        result = 31 * result + age
        return result
    }

}