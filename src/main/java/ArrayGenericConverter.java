import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayGenericConverter {
    public <T> List<T> fromArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }
}
