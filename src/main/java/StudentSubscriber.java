
import logic.Student;

public interface StudentSubscriber {
    void updateState(Student who, Student.State newState);
}