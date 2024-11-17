public class PrefixSumMax {
    
    public static void Prefixprint_sub_arraySum(int number[]){
        int CurrSum=0;
        int MaxSum=Integer.MIN_VALUE;
        int prefix[] = new int[number.length];

     prefix[0]=number[0];
     for(int i=1;i<prefix.length;i++)
     {
        prefix[i]=prefix[i-1]+number[i];
     }

        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                CurrSum=0;
                CurrSum = start == 0?prefix[end]:prefix[end]-prefix[start-1];
                if(MaxSum < CurrSum){
                    MaxSum = CurrSum;
                }
            }
        }
        System.out.println("Max sum is ="+MaxSum);
    }
    public static void main(String[] args) {
        int number[]={1,-2,6,-1,3};
        Prefixprint_sub_arraySum(number);
    }

}
