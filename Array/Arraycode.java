import java.util.*;
public class Arraycode {

     public static void main(String[] args) {
        int marks[]=new int[10];
        Scanner sc = new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("physics = "+marks[0]);
        System.out.println("chemstry = "+marks[1]);
        System.out.println("Maths = "+marks[2]);
        sc.close();
     }
}