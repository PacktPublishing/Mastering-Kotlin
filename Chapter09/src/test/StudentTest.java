import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    @Test
    public void testCreateDefaultStudent() {
        Student defaultStudent = Student.Factory.createDefaultStudent();

        assertEquals(defaultStudent.getLastName(), "Doe");
        assertEquals(defaultStudent.getFirstName(), "Jane");
    }
}
