
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.asserter
import kotlin.test.elementAtShouldBe
import kotlin.test.expect

class StudentPresenterTest {

    @Test
    fun `test students are sorted correctly`() {
        val presenter = StudentPresenter(
                listOf(
                        Student("Nate", "Ebel"),
                        Student("Jane", "Doe"),
                        Student("John", "Smith")
                )
        )

        val sortedStudents = presenter.students

        assertEquals(sortedStudents[0], Student("Jane", "Doe"))
    }
}