//open -- значит от этого класса можно наследоваться
open class Inheritance(val name: String, val voice: String) {
    //open -- показывает, что функцию можно переопределить в классе наследнике
    open fun sleep() {
        println("$name is sleeping!")
    }

    fun makeVoice() {
        println(voice)
    }
}