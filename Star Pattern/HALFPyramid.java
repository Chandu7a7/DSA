// 1
// 12
// 123
// 1234
public class HALFPyramid {
    public static void main(String[] args) {
        int n=4;
        for (int i = 1; i <=n; i++) {
            for (int number = 1; number <= i; number++) {
             System.out.print(number);
            }
            System.out.println();
        }
    }
}
