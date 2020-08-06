import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val duration = scanner.nextInt()
    val foodCostPerDay = scanner.nextInt()
    val flightCost = scanner.nextInt()
    val hotelCost = scanner.nextInt()
    val sum = (duration - 1) * hotelCost + duration * foodCostPerDay + flightCost * 2
    println(sum)
}