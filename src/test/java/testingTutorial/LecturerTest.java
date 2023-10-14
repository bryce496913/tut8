package testingTutorial;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LecturerTest {

    @Test
    public void testEqualsHashCodeContract() {
        Lecturer lecturer1 = new Lecturer(1, "John Doe", "Math");
        Lecturer lecturer2 = new Lecturer(2, "John Doe", "Physics");

        assertNotEquals(lecturer1, lecturer2); // Objects are not equal
        assertNotEquals(lecturer1.hashCode(), lecturer2.hashCode()); // Hash codes should not be equal
    }
}
