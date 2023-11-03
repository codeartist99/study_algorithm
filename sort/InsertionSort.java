import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (key < arr[j]) {
                    arr[j + 1] = arr[j];
                    arr[j] = key;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
