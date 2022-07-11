//наследуем класс от Inheritance
class Inheritance2 (name: String, voice: String): Inheritance(name, voice){

    //переопределение родительской функции
    override fun sleep(){
        println("Переопределённый текст")
    }
}