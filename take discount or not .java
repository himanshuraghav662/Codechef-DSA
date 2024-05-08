import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            // Your code goes here
            int sum=0;
            for(int i=0;i<n;i++){
                if(a[i]>y)
                sum+=y;
                else
                sum+=a[i];
            }
            int sum2=y*n;
            if(x<Math.min(sum,sum2)){
                System.out.println("COUPON");
            }
            else{
                System.out.println("NO COUPON");
            }
        }
    }
}
