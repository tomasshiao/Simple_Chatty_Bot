import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()
    val num3 = scanner.nextInt()
    val onePositive = ((num1>0) xor (num2>0) && num3>0)||(num3<0)
    println(onePositive)
    //val youreREALLYaskingmetodothisshit = (num1>0 && num2<=0 && num3 <=0) || (num2>0 && num1<=0 && num3 <=0) || (num3>0 && num2<=0 && num1 <=0)
    //println(youreREALLYaskingmetodothisshit)
}