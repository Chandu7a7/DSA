import java.util.Scanner;

public class Matrix {

    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    return true;
                }
            }
        }
        return false; // Return false if the key is not found
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);

        // Input matrix
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output matrix
        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Search for a key
        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();
        sc.close();

        boolean found = search(matrix, key);
        if (found) {
            System.out.println("Key " + key + " found in the matrix.");
        } else {
            System.out.println("Key " + key + " not found in the matrix.");
        }
    }
}
