import java.util.Arrays;

public class Task62 {
    public static void main(String[] args) {
        int[] arr = {5, 0, 10, -5, 20};

        int min = arr[0];
        for (int x : arr) if (x < min) min = x;

        int[] result = new int[arr.length];

        if (min == 0) {
            Arrays.fill(result, -10);
        } else {
            for (int i = 0; i < arr.length; i++) {
                result[i] = arr[i] / min;
            }
        }

        System.out.println("Result: " + Arrays.toString(result));
    }
}
