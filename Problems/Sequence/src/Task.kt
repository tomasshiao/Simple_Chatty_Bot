import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val char1 = scanner.next().first()
    val char2 = scanner.next().first()
    val char3 = scanner.next().first()
    val ordered = (char2 == char1+1 && char3 == char2+1)
    print(ordered)
}