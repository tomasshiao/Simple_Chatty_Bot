import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val n = scanner.nextInt()
    var counter = 0
    var maxSeq = 0
    var num1 = 0
    for (i in 1..n){
        val num2 = scanner.nextInt()
        if (num1 <= num2){
            counter++
            if(maxSeq < counter){maxSeq = counter}
        } else {
            counter = 1
        }
        num1=num2
    }
    println(maxSeq)

}
