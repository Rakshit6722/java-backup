import java.util.*;

public class mergeSort {
    public static void main(String[] args) {
        int arr[] = { 12, 3, 4, 1, 0, 9 };
        int[] result = mergeSort(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        // copyOfRange = last element is exclusive
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);

    }

    private static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i++];
            } else {
                mix[k] = right[j++];
            }
            k++;
        }
        while (i < left.length) {
            mix[k] = left[i++];
            k++;
        }
        while (j < right.length) {
            mix[k] = right[j++];
            k++;
        }
        return mix;

    }
}
