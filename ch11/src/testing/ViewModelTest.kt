package testing

import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify
import org.junit.Assert.*
import org.junit.Test

class ViewModelTest {

    @Test
    fun `test greeting updates properly on name change`() {
        // Setup
        val mockGreetingProvider = mock<GreetingProvider> {
            on { greeting } doReturn "Hello"
            on { friendlyGreeting } doReturn "Hi! How are you?"
        }
        val classUnderTest = ViewModel("Nate", mockGreetingProvider)

        // When
        classUnderTest.greeting

        // Then
        verify(mockGreetingProvider, times(1)).greeting
    }
}