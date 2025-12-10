public class Task9 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, -1, 7};
        int min = arr[0], max = arr[0];
        for (int x : arr) {
            if (x < min) min = x;
            if (x > max) max = x;
        }
        System.out.println("Difference: " + (max - min));
    }
}
