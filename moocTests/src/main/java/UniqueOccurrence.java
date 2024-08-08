import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurrence {
    public boolean isEmpty(int[] arr) {
        return arr.length != 0;
    }

    public boolean isUnique(int[] arr) {
        HashSet<Integer> unique = new HashSet<>();
        for(int i : arr) {
            unique.add(i);
        }
        return arr.length == unique.size();
    }

    public boolean repeatedAndUnique(int[] arr) {
        HashMap<Integer, Integer> countOccurrence = new HashMap<>();
        for(int i : arr) {
            countOccurrence.put(i, countOccurrence.getOrDefault(i, 0) + 1);
        }
        HashSet<Integer> unique = new HashSet<>(countOccurrence.values());

        return countOccurrence.size() == unique.size();
    }

    public boolean singleElement(int[] arr) {
        return arr.length == 1;
    }
}
