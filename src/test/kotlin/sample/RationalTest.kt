package sample

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions
import java.lang.IllegalArgumentException

class RationalTest {

    @Test
    fun test_properites() {
        val half = Rational(1,2)
        Assertions.assertEquals(1, half.numerator)
        Assertions.assertEquals(2, half.denominator)
    }

    @Test
    fun test_toString() {
        val half = Rational(1,2)
        Assertions.assertEquals("1/2", half.toString())
    }

    @Test
    fun `demoninator must not be 0`() {
        val exception = Assertions.assertThrows(IllegalArgumentException::class.java) {
            val instance = Rational(1, 0)
        }
    }

    @Test
    fun `16 over 24 is 2 over 3`() {
        Assertions.assertEquals("2/3", Rational(16, 24).toString())
        Assertions.assertEquals("11/20", Rational(55, 100).toString())
        Assertions.assertEquals("617/2839", Rational(1234, 5678).toString())
    }

    @Test
    fun `1 over 4 plus 1 over 2 makes 3 over 4`() {
        Assertions.assertEquals("3/4", Rational(1,4).plus(Rational(1,2)).toString())
    }

    @Test
    fun `3 plus 2 over 1 makes 5 over 1`() {
        Assertions.assertEquals("5/1", (3 + Rational(2, 1)).toString())
    }

    @Test
    fun `1 plus 1 over 2 plus 2 makes 7 over 2`() {
        Assertions.assertEquals("7/2", (1 + Rational(1, 2) + 2).toString())
    }
}