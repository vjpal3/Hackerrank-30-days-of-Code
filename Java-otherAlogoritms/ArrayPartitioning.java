import java.util.Arrays;

public class ArrayPartitioning {

    public static void moveZerosToEnd(int[] arr) {
        int boundary = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                swap(arr, i, boundary);
                boundary--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZerosToEndPreservingOrder(int[] arr) {
        int snowballSize = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                snowballSize++;
            } else if (snowballSize > 0) {
                int temp = arr[i];
                arr[i] = 0;
                arr[i - snowballSize] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZerosToBegining(int[] arr) {
        int boundary = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                swap(arr, i, boundary);
                boundary++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void dutchNationalFlag(int[] arr, int pivot) {
        int lowBoundary = 0, highBoundary = arr.length - 1;
        int i = 0;
        while (i <= highBoundary) {
            if (arr[i] < pivot) {
                swap(arr, i, lowBoundary);
                lowBoundary++;
                i++;
            } else if (arr[i] > pivot) {
                swap(arr, i, highBoundary);
                highBoundary--;
            } else {
                i++;
            }
        }
        System.out.println("Preserving Order: " + Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int boundary) {
        int temp = arr[i];
        arr[i] = arr[boundary];
        arr[boundary] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 0, 5, 0, 3, 8, 0, 1 };
        // ArrayPartitioning.moveZerosToBegining(arr);
        ArrayPartitioning.moveZerosToEnd(arr);
        arr = new int[] { 2, 4, 0, 5, 0, 3, 8, 0, 1 };
        ArrayPartitioning.moveZerosToEndPreservingOrder(arr);
        // int[] arr1 = { 2, 4, 7, 5, 4, 9, 8, 5, 1 };
        // dutchNationalFlag(arr1, 5);
    }
}