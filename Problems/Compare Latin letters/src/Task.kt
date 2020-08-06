import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val difference = 'a' - 'A'
    val letter1 = scanner.next().toCharArray()
    val letter2 = scanner.next().toCharArray()
    val isSameLetter = (letter1[0] - letter2[0] == difference) || (letter2[0] - letter1[0] == difference)
    println(isSameLetter)
}