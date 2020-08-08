import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val num = scanner.nextInt()
    if (num%2==0){
        print("EVEN")
    } else {
        print("ODD")
    }
}