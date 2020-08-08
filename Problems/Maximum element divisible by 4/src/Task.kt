import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val numElements =  scanner.nextInt()
    var max = 0
    repeat(numElements){
        var num = scanner.nextInt()
        if(num > max && num%4 == 0){
            max = num
        }
    }
    println(max)
}