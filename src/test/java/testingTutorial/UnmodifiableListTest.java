package testingTutorial;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UnmodifiableListTest {

    @Test
    public void testUnmodifiableListAddMethod() {
        List<String> mutableList = new ArrayList<>();
        mutableList.add("Item 1");

        List<String> unmodifiableList = Collections.unmodifiableList(mutableList);

        assertThrows(UnsupportedOperationException.class, () -> unmodifiableList.add("Item 2"));
    }

    @Test
    public void testUnmodifiableListIteration() {
        List<String> mutableList = new ArrayList<>();
        mutableList.add("Item 1");

        List<String> unmodifiableList = Collections.unmodifiableList(mutableList);

        // Verify that iteration is still possible
        for (String item : unmodifiableList) {
            assertEquals("Item 1", item);
        }
    }
}
