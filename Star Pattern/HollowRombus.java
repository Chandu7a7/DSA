//     *****
//    *   *
//   *   *
//  *   *
// *****
public class HollowRombus {
    
     public static void Hollow_rombus_pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
               System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1|| i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
     }
    public static void main(String[] args) {
        Hollow_rombus_pattern(5);
    }


}
