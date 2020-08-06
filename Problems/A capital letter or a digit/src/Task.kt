import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val input = scanner.next().first()
    val capOrDigit = (input.isDigit() && input != '0') || input.isUpperCase()
    print(capOrDigit)
}