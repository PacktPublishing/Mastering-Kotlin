import java.util.Comparator;
import java.util.List;

public class StudentPresenter {

    private List<Student> students;

    public StudentPresenter(List<Student> students) {
        students.sort(Comparator.comparing(Student::getLastName));

        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
}
