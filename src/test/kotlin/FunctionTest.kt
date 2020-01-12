import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions
import java.lang.IllegalArgumentException

fun succ(i: Int): Int = i + 1

class RationalTest {

    @Test
    fun `a simple fun`() {
        Assertions.assertEquals(999, succ(1))
    }
}