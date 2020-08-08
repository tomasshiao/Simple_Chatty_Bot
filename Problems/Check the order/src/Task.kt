import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val n = scanner.nextInt()
    var output = "YES"
    var num1 = 0
    for (i in 1..n){
        val num2 = scanner.nextInt()
        if (num1 > num2){
            output = "NO"
        }
        num1=num2
    }
    println(output)
}
