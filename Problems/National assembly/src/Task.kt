import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val input = scanner.nextInt()
    val cbrtRes = (Math.cbrt(input.toDouble())).toInt()
    println(cbrtRes)
}