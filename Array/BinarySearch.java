import java.util.*;
public class BinarySearch {
     
    public static int BinarySearch(int number[],int key){
        int start=0,end=number.length-1;
        while (start<=end) {
            int mid = (start+end)/2;
            if (number[mid]== key) {
                return mid;
            }
            if(number[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

public static void main(String[] args) {
    int number[]={1,3,4,5,10,12,14,16};
    int key=10;
    System.out.println("Index of "+key+" is "+BinarySearch(number, key));
}

}
