public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2}, {3, 4}};
        int[][] mat2 = {{5, 6}, {7, 8}};
        int[][] result = new int[2][2];

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat2[0].length; j++) {
                for (int k = 0; k < mat1[0].length; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        System.out.println("Matrix Multiplication Result:");
        for (int[] row : result) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
