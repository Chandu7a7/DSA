import java.util.*;
public class factorialexapmle {
  
    public static void factorial(int n){
        int f=1;
        for(int i=1; i<=n ; i++){

            f=f*i;
            
        }
        System.out.println( "Factorila of "+ n +" is = " + f);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n = ");
        int n = sc.nextInt();
        factorial(n);
        sc.close();
    }

}
