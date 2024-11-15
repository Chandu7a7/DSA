import java.util.*;

public class istfunction {

    
    public static void calculateSum(int n1, int n2) {
        int sum = n1 + n2;
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        calculateSum(a, b);

        sc.close();
    }
}