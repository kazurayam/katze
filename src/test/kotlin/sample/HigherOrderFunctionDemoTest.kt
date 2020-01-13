package sample

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions

class HigherOrderFunctionTest {
    @Test
    fun `firstK("JFK") returns 2`() {
        Assertions.assertEquals(2, firstK("JFK"))
    }

    @Test
    fun `firstUpperCase("jfK") returns 2`() {
        Assertions.assertEquals(2, firstUpperCase("jfK"))
    }

    @Test
    fun `highterFirstK("JFK") returns 2`() {
        Assertions.assertEquals(2, higherFirstK("JFK"))
    }

    @Test
    fun `higherFistUpperCase("jfK") returns 2`() {
        Assertions.assertEquals(2, higherFirstUpperCase("jfK"))
    }
}