import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UniqueOccurrenceTest {

    private final UniqueOccurrence uniqueOccurrence;

    public UniqueOccurrenceTest() {
        this.uniqueOccurrence = new UniqueOccurrence();
    }

    @Test
    public void emptyArray(){
        int[] arr = {};
        assertFalse(uniqueOccurrence.isEmpty(arr));
    }

    @Test
    public void singleElement() {
        int[] arr = {8};
        assertTrue(uniqueOccurrence.singleElement(arr));
    }

    @Test
    public void uniqueOccurrences(){
        int[] arr = {2, 4, 7, 9};
        assertTrue(uniqueOccurrence.isUnique(arr));
    }

    @Test
    public void uniqueRepeatedOccurrences() {
        int[] arr = {2, 2, 3, 3, 3, 4};
        assertTrue(uniqueOccurrence.repeatedAndUnique(arr));
    }

    @Test
    public void notUniqueRepeatedOccurrences() {
        int[] arr = {2, 2, 3, 3, 4};
        assertFalse(uniqueOccurrence.repeatedAndUnique(arr));
    }
}
