package essentials.conditions.prettytime

import org.junit.Test
import kotlin.test.assertEquals

fun secondsToPrettyTime(seconds: Int): String {
    if (seconds < 0) {
        return "Invalid input"
    }
    if (seconds == 0) {
        return "Now"
    }
    val hour = seconds / 3600;
    val min = (seconds / 60) - (hour * 60);
    val sec = seconds % 60;

    val hourString = if (hour == 0) "" else "$hour h ";
    val minString = if (min == 0) "" else "$min min ";
    val secString = if (sec == 0) "" else "$sec sec ";
    return (hourString + minString + secString).trim();
}

fun main() {
    println(secondsToPrettyTime(-1)) // Invalid input
    println(secondsToPrettyTime(0)) // Now
    println(secondsToPrettyTime(45)) // 45 sec
    println(secondsToPrettyTime(60)) // 1 min
    println(secondsToPrettyTime(150)) // 2 min 30 sec
    println(secondsToPrettyTime(1410)) // 23 min 30 sec
    println(secondsToPrettyTime(60 * 60)) // 1 h
    println(secondsToPrettyTime(3665)) // 1 h 1 min 5 sec
}
