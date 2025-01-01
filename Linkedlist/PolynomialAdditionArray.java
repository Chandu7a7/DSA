import java.util.Scanner;

public class PolynomialAdditionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first polynomial
        System.out.print("Enter degree of first polynomial: ");
        int degree1 = sc.nextInt();
        int[] poly1 = new int[degree1 + 1];
        System.out.println("Enter coefficients of first polynomial (highest to lowest degree): ");
        for (int i = degree1; i >= 0; i--) poly1[i] = sc.nextInt();

        // Input second polynomial
        System.out.print("Enter degree of second polynomial: ");
        int degree2 = sc.nextInt();
        int[] poly2 = new int[degree2 + 1];
        System.out.println("Enter coefficients of second polynomial (highest to lowest degree): ");
        for (int i = degree2; i >= 0; i--) poly2[i] = sc.nextInt();

        // Determine the maximum degree for the result
        int maxDegree = Math.max(degree1, degree2);
        int[] result = new int[maxDegree + 1];

        // Add coefficients
        for (int i = 0; i <= maxDegree; i++) {
            int coeff1 = i <= degree1 ? poly1[i] : 0;
            int coeff2 = i <= degree2 ? poly2[i] : 0;
            result[i] = coeff1 + coeff2;
        }

        // Display result
        System.out.println("Resultant Polynomial:");
        for (int i = maxDegree; i >= 0; i--) {
            if (result[i] != 0) {
                System.out.print(result[i] + "x^" + i + (i > 0 ? " + " : ""));
            }
        }
        sc.close();
    }
}

