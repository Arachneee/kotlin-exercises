import java.util.*
import kotlin.collections.ArrayList

fun add(arr: ArrayList<Int>): ArrayList<Int> {
    arr.add(3)
    return arr
}

fun main() {
    var arr: ArrayList<Int> = arrayListOf(1, 2)
    println(add(arr))
    println(arr);
}

