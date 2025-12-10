public class Task39 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, -1, 7};

        int max = arr[0];
        for (int x : arr) if (x > max) max = x;

        if (arr.length < 2) {
            System.out.println("Array too small");
            return;
        }
        int secondLast = arr[arr.length - 2];

        System.out.println("Difference: " + (max - secondLast));
    }
}
