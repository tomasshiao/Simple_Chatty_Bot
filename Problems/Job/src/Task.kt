import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val age = scanner.nextInt()
    val canGetJob = age in 18..59
    println(canGetJob)
}