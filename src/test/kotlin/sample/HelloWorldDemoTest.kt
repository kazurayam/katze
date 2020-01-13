package sample

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions
import java.lang.IllegalArgumentException

class HelloWorldDemoTest {
    
    @Test
    fun `helloWorld returns personalized message`() {
        Assertions.assertEquals("Hello, Molly!", helloWorld("Molly"))
    }
}