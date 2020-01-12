package sample

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions
import java.lang.IllegalArgumentException

class RationalTest {
    private val half = Rational(1,2)

    @Test
    fun test_properites() {
        Assertions.assertEquals(1, half.numerator)
        Assertions.assertEquals(2, half.denominator)
    }

    @Test
    fun test_toString() {
        Assertions.assertEquals("1/2", half.toString())
    }

    @Test
    fun `demoninator must not be 0`() {
        val exception = Assertions.assertThrows(IllegalArgumentException::class.java) {
            val instance = Rational(1, 0)
        }
    }
}