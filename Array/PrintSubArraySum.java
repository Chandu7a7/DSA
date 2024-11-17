public class PrintSubArraySum {

    public static void print_sub_arraySum(int number[]){
        int CurrSum=0;
        int MaxSum=Integer.MIN_VALUE;

        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                CurrSum=0;
                for(int k=start;k<=end;k++){
                    CurrSum += number[k];
                }
                System.out.println(CurrSum);
                if(MaxSum < CurrSum){
                    MaxSum = CurrSum;
                }
            }
        }
        System.out.println("Max sum is ="+MaxSum);
    }

    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        print_sub_arraySum(number);
    }

}
