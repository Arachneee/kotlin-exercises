package essentials.objects.pizza

import org.junit.Test
import kotlin.test.assertEquals

class Pizza(
    val toppings: List<String>,
) {
    companion object {
        fun hawaiian() = Pizza(listOf("ham", "pineapple"))
        fun margherita() = Pizza(listOf("tomato", "mozzarella"))
    }
}

open class A (val name: String) {
//    abstract fun a(): String
    fun b(): String = name + "bb"
    fun c(): String = name + "cc"
}

class B {
    companion object : A("B") {
    }
}


fun main() {
    val hawaiian = Pizza.hawaiian()
    println(hawaiian.toppings) // [ham, pineapple]
    val margherita = Pizza.margherita()
    println(margherita.toppings) // [tomato, mozzarella]

    println(B.b())
    println(B.c())
}

class PizzaTest {
    @Test
    fun testHawaiian() {
        val expected = listOf("ham", "pineapple")
        assertEquals(expected, Pizza.hawaiian().toppings)
    }

    @Test
    fun testMargherita() {
        val expected = listOf("tomato", "mozzarella")
        assertEquals(expected, Pizza.margherita().toppings)
    }
}
