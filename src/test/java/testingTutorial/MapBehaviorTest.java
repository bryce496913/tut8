package testingTutorial;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class MapBehaviorTest {

    @Test
    public void testIdentityHashMapBehavior() {
        Map<String, String> identityMap = new IdentityHashMap<>();
        String key1 = new String("key");
        String key2 = new String("key");

        identityMap.put(key1, "value1");
        identityMap.put(key2, "value2");

        assertEquals("value1", identityMap.get(key1)); // Passes
        assertNull(identityMap.get(key2)); // Passes, as IdentityHashMap uses reference equality
    }

    @Test
    public void testHashMapBehavior() {
        Map<String, String> hashMap = new HashMap<>();
        String key1 = new String("key");
        String key2 = new String("key");

        hashMap.put(key1, "value1");
        hashMap.put(key2, "value2");

        assertEquals("value1", hashMap.get(key1)); // Passes, as HashMap uses equals() for key comparison
        assertEquals("value2", hashMap.get(key2)); // Passes
    }
}
