import java.util.Arrays;

public class MergeSortedArraysWithDuplicates {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 3, 6, 7};

        int[] mergeArray = mergeArraysWithDuplicates(arr1, arr2);

        System.out.println("meged Array (With Duplicates): " + Arrays.toString(mergeArray));
    }

    public static int[] mergeArraysWithDuplicates(int[] arr1, int[] arr2) {
        int[] temp = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                temp[k++] = arr1[i++];
            } else {
                temp[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            temp[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            temp[k++] = arr2[j++];
        }

        return Arrays.copyOf(temp, k); // Remove unused extra space
    }
}
