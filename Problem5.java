import java.util.Arrays;

public class Problem5 {
    public static int findFirstOccurrence(String[] logs, String target) {
        int low = 0, high = logs.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (logs[mid].equals(target)) {
                result = mid;
                high = mid - 1; // Look for earlier occurrences
            } else if (logs[mid].compareTo(target) < 0) low = mid + 1;
            else high = mid - 1;
        }
        return result;
    }

    public static int countOccurrences(String[] logs, String target) {
        int count = 0;
        for (String log : logs) {
            if (log.equals(target)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String[] logs = {"accA", "accB", "accB", "accC"}; // Must be sorted
        String target = "accB";
        int index = findFirstOccurrence(logs, target);
        int count = countOccurrences(logs, target);

        System.out.println("First occurrence of " + target + " at index: " + index);
        System.out.println("Total occurrences: " + count);
    }
}