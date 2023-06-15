import java.util.*;
public class CarryForwardBuySellStocks {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[]=new int[N];
        for(int i=0;i<N;i++)
        {
            A[i]=sc.nextInt();
        }

        int small=A[0],big=Integer.MIN_VALUE;
        int ksmall=0,lbig=0;
        for(int i=0;i<N;i++)
        {
            small=Math.min(A[i],small);
            ksmall=Math.min(ksmall,i);
            big=Math.max(A[i],big);
            lbig=Math.max(lbig,i);
        }
        System.out.println(big);
        System.out.println(lbig);
        System.out.println(small);
        System.out.println(ksmall);


    }
}
