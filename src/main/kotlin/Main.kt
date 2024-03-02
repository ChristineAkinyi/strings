fun main() {
    printCharacters("akirachix")
    printNameAge("Benta",45)
    printString("Christine")
    checkName("Christine")
}

fun printCharacters(name:String){
    println(name[0])
    println(name[2])
    println(name[3])
}

fun printNameAge(name:String, age:Int){
    var name = "Benta"
    var age =45
    var statement = "Hi, my name is $name and I am $age years old."
    println(statement)
}

fun printString(word:String): Int{
    var length = word.length
    return length
}

fun checkName(name:String) {
    if (name == "Christine") {
        println("That's me!")
    } else {
        println("I don't know who that is")
    }
}

