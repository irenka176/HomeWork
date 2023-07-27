import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionLesson {
    /**
     * @param array int array
     * @return list of array elements
     */
    public List<Integer> toList(int[] array) {
        if (array == null) {
            throw new NullPointerException("Array is null");
        }
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }
        return list;
    }

    /**
     * @param array array of strings
     * @return list of array elements
     */
    public List<String> toList(String[] array) {
        if (array == null) {
            throw new NullPointerException("Array is null");
        }
        List<String> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }

    /**
     * @param request  list of strings
     * @param template string to count
     */
    public int countOccurrence(List<String> request, String template) {
        if (request == null) {
            throw new NullPointerException("Request is null");
        }
        int count = 0;
        for (String s : request) {
            if (s.equalsIgnoreCase(template)) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param list list of integers
     * @return list of unique integers
     */
    public List<Integer> findUnique(List<Integer> list) {
        if (list == null) {
            throw new NullPointerException("List is null");
        }
        List<Integer> unique = new ArrayList<>();
        for (Integer i : list) {
            if (!unique.contains(i)) {
                unique.add(i);
            }
        }
        return unique;
    }
}
