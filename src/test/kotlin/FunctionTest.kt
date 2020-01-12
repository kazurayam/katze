import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions
import java.lang.IllegalArgumentException

fun helloWorld(name: String = "World"): String {
    return "Hello, ${name}!"
}

class FunctionTest {
    
    @Test
    fun `helloWorld returns personalized message`() {
        Assertions.assertEquals("Hello, Molly!", helloWorld("Molly"))
    }
}