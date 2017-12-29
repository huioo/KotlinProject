package hello

class Person(var name: String){
    fun printName(){
        println(name)
    }
}

fun main(args: Array<String>) {
    println("hello world!")
    Person(name="HELLO").printName()
}
