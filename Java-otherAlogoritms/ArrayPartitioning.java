import java.util.Arrays;

public class ArrayPartitioning {

    public static void moveZerosToEnd(int[] arr) {

        int boundary = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] == 0) {
                // swap(boundary, i)
                int temp = arr[i];
                arr[i] = arr[boundary];
                arr[boundary] = temp;

                boundary--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZerosToBegining(int[] arr) {

        int boundary = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                // swap(boundary, i)
                int temp = arr[i];
                arr[i] = arr[boundary];
                arr[boundary] = temp;

                boundary++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 0, 5, 0, 3, 8, 0, 1 };
        // ArrayPartitioning.moveZerosToBegining(arr);
        ArrayPartitioning.moveZerosToEnd(arr);

    }
}