import java.util.*;
public class PrimeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        int count=0;
        for(int i=1;i*i<=N;i++)
        {
            if(N%i==0)
            {
                count++;
            }
        }
        if(count==1)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
    }
}
