import java.util.*;
public class PerfectNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum=0;
        for(int i=1;i<N;i++)
        {
            if(N%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==N)
        {
            System.out.println("Perfect");
        }
    }
}
