import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Class for file navigator
 */
public class FileNavigator {
    /**
     * Files
     */
    public HashMap<String, HashSet<FileData>> Files = new HashMap<>();

    /**
     * Add file data
     *
     * @param fileData file data
     */
    public void add(FileData fileData) {
        if (fileData == null)
            throw new NullPointerException("File data is null");
        if (fileData.Name == null)
            throw new NullPointerException("File name is null");
        if (fileData.Path == null)
            throw new NullPointerException("File path is null");
        if (fileData.Size <= 0)
            throw new IllegalArgumentException("File size is less or equal to zero");
        if (Files.containsKey(fileData.Path)) {
            Set<FileData> fileDataSet = Files.get(fileData.Path);
            if (fileDataSet.contains(fileData))
                throw new IllegalArgumentException("File already exists");
            fileDataSet.add(fileData);
        } else {
            Files.put(fileData.Path, new HashSet<>(Set.of(fileData)));
        }
    }

    public ArrayList<FileData> find(String path, int size) {
        if (path == null)
            throw new NullPointerException("Path is null");
        if (!Files.containsKey(path))
            throw new IllegalArgumentException("Path not found");
        ArrayList<FileData> result = new ArrayList<>();
        Set<FileData> fileDataSet = Files.get(path);
        for (FileData fileData : fileDataSet) {
            if (fileData.Size <= size)
                result.add(fileData);
        }
        return result;
    }

    /**
     * Remove file data
     *
     * @param path path
     */
    public void remove(String path) {
        if (path == null)
            throw new NullPointerException("Path is null");
        if (!Files.containsKey(path))
            throw new IllegalArgumentException("Path not found");
        Files.remove(path);
    }
}
