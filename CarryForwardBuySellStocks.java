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
        /**int ans=0;
        for(int i=0;i<N;i++)
        {
            int max=A[i];
            for(int j=i+1;j<N;j++)
            {
                if(A[j]>max)
                {
                    max=A[j];
                }
            }

            ans=(max-A[i])>ans?(max-A[i]):ans;
        }

        System.out.println(ans);*/
        int profit=0,max=A[N-1];
        for(int i=N-2;i>=0;i--)
        {
            if(A[i]>max)
            {

            }
        }


    }
}
