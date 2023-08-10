
fun main(args: Array<String>) {
    val list = todoList("Happy" , "Mild")
    val temp = temp("Rainy")
    println("you should $list")
    println("temperature is $temp")
}
fun todoList(mood : String = "Happy" , weather : String = "Sunny") : String{
    return when {
        mood == "Happy" && weather == "Sunny" -> "Go to swimming"
        mood == "Happy" && weather == "Rainy" -> "Stay and watch your favorite film"
        mood == "Happy" && weather == "Mild" -> "Go to gym"
        mood == "Sad" && weather == "Sunny" -> "Go to club"
        mood == "Sad" && weather == "Rainy" -> "Play games on computer"
        mood == "Sad" && weather == "Mild" -> "Call your friend and enjoy"
        else -> "do what you want"
    }
}
fun temp(weather: String): String {
    return when (weather) {
        "Sunny" -> "Temperature in range of 35 to 50"
        "Rainy" -> "Temperature in range of 10 to 20"
        "Mild" -> "Temperature in range of 20 to 35"
        else -> "Unknown weather"
    }
}
/*solution of question 2
*  the output of val hello1="Hello" is -> it will bring the word of Hello
*  the output of val hello2={Hello()} is -> will be a string representation of the lambda expression hello2 */
