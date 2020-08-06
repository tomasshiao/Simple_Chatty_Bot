import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val number = scanner.nextInt()
    val str = number.toString()
    val reverse = str.reversed()
    val reversedNum = reverse.toInt()
    println(reversedNum)
}