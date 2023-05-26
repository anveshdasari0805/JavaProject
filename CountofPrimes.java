import java.util.*;
public class CountofPrimes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int primecount=0;
        for(int i=1;i<N;i++)
        {
            int count = 0;
            for(int j=1;j<=i/2;j++)
            {
                if (i % j == 0) {
                    count++;
                }
            }
            if(count==1)
            {
                primecount++;
                System.out.print(i+" ");
                System.out.println();
                System.out.println(primecount);
            }
        }
    }
}
