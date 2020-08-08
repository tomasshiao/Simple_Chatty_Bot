import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val limit = scanner.nextInt()
    var result = 0
    for (t in 1..limit){
        val num = scanner.nextInt()
        result+=num
    }
    println(result)
}