import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    // write your code here
    val char1 = scanner.next().first().isDigit()
    val char2 = scanner.next().first().isDigit()
    val char3 = scanner.next().first().isDigit()
    val char4 = scanner.next().first().isDigit()
    print("$char1\\$char2\\$char3\\$char4")
}