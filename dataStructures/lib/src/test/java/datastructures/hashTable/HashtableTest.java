package datastructures.hashTable;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class HashtableTest {
    @Test
    public void testSetKeyValue() {
        // Arrange
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Act
        hashtable.set("one", 1);
        int value = hashtable.get("one");

        // Assert
        System.out.println("Set key 'one' with value 1. Retrieved value: " + value);
        assertEquals(1, value);
    }

    @Test
    public void testRetrieveValueForKey() {
        // Arrange
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.set("one", 1);

        // Act & Assert
        System.out.println("Value for key 'one': " + hashtable.get("one"));
        assertEquals(Integer.valueOf(1), hashtable.get("one"));
    }

    @Test
    public void testNullForNonExistentKey() {
        // Arrange
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Act & Assert
        System.out.println("Value for non-existent key: " + hashtable.get("nonExistent"));
        assertNull(hashtable.get("nonExistent"));
    }

    @Test
    public void testReturnAllUniqueKeys() {
        // Arrange
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.set("one", 1);
        hashtable.set("two", 2);
        hashtable.set("three", 3);

        // Act
        List<String> keys = hashtable.keys();

        // Assert
        System.out.println("All unique keys in the hashtable: " + keys);
        assertTrue(keys.contains("one"));
        assertTrue(keys.contains("two"));
        assertTrue(keys.contains("three"));
    }

    @Test
    public void testHandleCollision() {
        // Arrange
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.set("one", 1);
        hashtable.set("one", 10);

        // Act
        int value = hashtable.get("one");

        // Assert
        System.out.println("Value for key 'one' after handling collision: " + value);
        assertEquals(10, value);
    }

    @Test
    public void testRetrieveValueFromCollisionBucket() {
        // Arrange
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.set("one", 50);
        hashtable.set("eleven", 55);

        // Act & Assert
        System.out.println("Values for keys 'one' and 'eleven' from collision bucket: " + hashtable.get("one") + ", " + hashtable.get("eleven"));
        assertEquals(Integer.valueOf(50), hashtable.get("one"));
        assertEquals(Integer.valueOf(55), hashtable.get("eleven"));
//        CHATGPT ASSISTED IN THIS TEST
    }

    @Test
    public void testHashInRange() {
        // Arrange
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        String key = "testKey";
        hashtable.set(key, 123);

        // Act
        int index = hashtable.getBucketIndexForKey(key);

        // Assert
        System.out.println("Hashed index for key 'testKey': " + index);
        assertTrue(index >= 0 && index < hashtable.size());
    }
}