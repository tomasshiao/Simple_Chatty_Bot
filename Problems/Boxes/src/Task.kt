import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val z1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()
    val z2 = scanner.nextInt()
    val max1 = if (x1 > z1) {
        // put your code here
        if(y1>x1){y1}else{x1}
    } else {
        // and here
        if(x1 == z1){
            if (x1>y1){x1} else {y1}
        } else {z1}
    }
    val max2 = if (x2 > z2) {
        // put your code here
        if(y2>x2){y2}else{x2}
    } else {
        // and here
        if(x2 == z2){
            if (x2>=y2){x2} else {y2}
        } else {z2}
    }
    val min1 = if (x1 < z1) {
        // put your code here
        if(y1<=x1){y1}else{x1}
    } else {
        // and here
        if(x1 == z1){
            if (x1<y1){x1} else {y1}
        } else {z1}
    }
    val min2 = if (x2 < z2) {
        // put your code here
        if(y2<=x2){y2}else{x2}
    } else {
        // and here
        if(x2 == z2){
            if (x2<=y2){x2} else {y2}
        } else {z2}
    }
    val vol1 = x1 * y1 * z1
    val vol2 = x2 * y2 * z2
    if((min1 != max1 || min2 != max2) && (max2 < max1 && min1 < min2 || max1 < max2 && min2 < min1)){
        println("Incomparable")
    } else if(vol1 == vol2){
        println("Box 1 = Box 2")
    } else if(vol1 > vol2){
        println("Box 1 > Box 2")
    } else {
        println("Box 1 < Box 2")
    }
}