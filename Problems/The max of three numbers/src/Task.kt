import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    println(if (a > c) {
        // put your code here
        if(b>a){
            b
        }else{a}
    } else {
        // and here
        if(a == c){
            if (a>b){a} else {b}
        } else {c}
    })
}