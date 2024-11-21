import java.util.Arrays;

public class MergeSortedArraysNoDuplicates {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        
        int[] mergedArray = mergeArraysNoDuplicates(arr1, arr2);
        
        System.out.println("Merged Array (No Duplicates): " + Arrays.toString(mergedArray));
    }


    public static int[] mergeArraysNoDuplicates(int[] arr1, int[] arr2) {
        int[] temp = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                temp[k++] = arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                temp[k++] = arr2[j++];
            } else {
                temp[k++] = arr1[i++];
                j++; // Skip duplicate
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
