import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int s=Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                if(a[i]<s)
                s=a[i];
            }

            // Your code goes here
            int q=0;
            for(int i=0;i<n;i++){
                if(a[i]>s)
                q++;
            }
            System.out.println(q);
        }
    }
}
