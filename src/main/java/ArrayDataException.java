/**
 * Custom java {@link  IllegalArgumentException} implementation, see <a href="https://highload.today/isklyucheniya-v-java/#:~:text=(fruits)%3B%20%7D%20%7D-,throws">source references</a>}.
 */
public class ArrayDataException extends IllegalArgumentException{
    public ArrayDataException(String message) {
        super(message);
        super.printStackTrace();
    }
}