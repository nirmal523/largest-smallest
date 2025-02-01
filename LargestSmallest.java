import java.util.Arrays;

public class LargestSmallest {
    public static void main(String[] args) {
        
int[] arr = {3, 5, 7, 2, 8};
int max_value = Arrays.stream(arr).max().getAsInt();
System.out.println(max_value);

    }
}
