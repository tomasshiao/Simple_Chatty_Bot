import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val numReeses = scanner.nextInt()
    val isWeekend = scanner.nextBoolean()
    val successful = (!isWeekend && numReeses <= 20 && numReeses >= 10) || (isWeekend && numReeses <= 25 && numReeses >= 15)
    println(successful)
}