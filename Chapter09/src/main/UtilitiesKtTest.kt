import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify
import org.junit.Assert.*
import org.junit.Test
import org.mockito.Mockito
import kotlin.test.BeforeTest

class UtilitiesKtTest {

    @BeforeTest
    fun runBeforeAnyTest() {
        println("before test")
    }

    @org.junit.Test
    fun `test the formatGreeting function`() {
        val formattedName = formatGreeting("Nate")
        assertEquals("Hello Nate", formattedName)
    }

    @org.junit.Test
    fun `test foo`() {
        val mockProvider = Mockito.mock(SimpleGreeter::class.java)

        val formattedName = formatGreeting(mockProvider, "Nate")

        assertEquals("Hello Nate", formattedName)
    }

    @Test
    fun `test with mockito-kotlin`() {
        val mockGreeter = mock<SimpleGreeter> {
            on { getGreeting() } doReturn "Hey there!"
            on { getMessage() } doReturn  "You're great!"
        }

        mockGreeter.getGreeting()

        verify(mockGreeter, times(1)).getGreeting()
    }
}