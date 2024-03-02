fun main() {
//    printCharacters("akirachix")
//    printNameAge("Christine",22)
////    printString("Christine")
//    printCharacters("akirachix")
//    printNameAge("Benta", 45)
// printString("Adalab")
    checkName("Christine")
}

//fun printCharacters(name:String){
//    println(name[0])
//    println(name[2])
//    println(name[3])
//}
//
//fun printNameAge(x:String, y:Int){
//    var x = "Christine"
//    var y = 22
//    var statement = "Hi, my name is $x and I am $y years old."
//    println(statement)
//}
//
//fun printString(word:String){
//    var length = word.length
//    println(length)
//}

fun printCharacters(name:String){
//    println(name[0])
//    println(name[2])
//    println(name[3])
    println(name[7])
}

fun printNameAge(name:String, age:Int){
    var name = "Benta"
    var age =45
    var statement = "Hi, my name is $name and I am $age years old."
    println(statement)

}

fun printString(name: String):Int{
    var length = name.length
    return length
}

fun checkName(name:String) {
    if (name == "Christine") {
        println("That's me!")
    } else {
        println("I don't know who that is")
    }
}

