import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()
    val num3 = scanner.nextInt()
    val aux1 = num1%2
    val aux2 = num2%2
    val aux3 = num3%2
    val desks = num1/2 + aux1 + num2/2 + aux2 + num3/2 + aux3
    println(desks)
}