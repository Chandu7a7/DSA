public class primenum {
    
    // check prime number
    public static boolean isPrime(int n){

        for (int i =2 ; i<=Math.sqrt(n);i++){
            if ( n % i == 0){
                return false;
            }
        }
        return true;
    }

   // Find prime number range 
   public static void primesInrange(int n){
   for (int i =2 ; i<=n; i++){
    if (isPrime(i)){
        System.out.print(i+" ");
    }
   }

  }

    public static void main(String[] args) {
    primesInrange(10);
    }
}
