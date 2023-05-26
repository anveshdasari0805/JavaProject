import java.util.*;
public class MaxNumberOfOnes2DMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int A[][] = new int[N][M];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        int pf[][]= new int[N][M];
        pf[0][0]=A[0][0];
        for(int i=0;i<N;i++)
        {
            pf[i][0] = A[i][0];
            for (int j = 1; j < N; j++) {
                pf[i][j] = pf[i][j - 1] + A[i][j];
            }
        }

        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                System.out.print(pf[i][j]+" ");
            }
            System.out.println();
        }
        int ans=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<N;i++)
        {
            if(pf[i][M-1]>max)
            {
                max=pf[i][M-1];
                ans=i;
            }
            else if(pf[i][M-1]==max)
            {
                if(i>ans)
                {
                    ans=ans+0;
                }
            }
        }
        System.out.println(ans+" Answer row");


    }
}
