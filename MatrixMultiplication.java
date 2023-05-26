import java.util.*;
public class MatrixMultiplication {

    public static int valueOf(int[][] A,int[][] B)
    {
        int ans=0;
        int N = A.length;
        int M = A[0].length;
        for(int i=0;i<1;i++)
        {
            for(int j=0;j<M;j++)
            {
                ans=ans+A[i][j]*B[i][j];
            }
        }
        System.out.println(ans);

        return ans;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int A[][] = new int[N][M];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                A[i][j] = sc.nextInt();
            }
        }
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int B[][] = new int[P][Q];
        for(int i=0;i<P;i++)
        {
            for(int j=0;j<Q;j++)
            {
                B[i][j] = sc.nextInt();
            }
        }

        if(M==P)
        {
            int C[][] = new int[N][Q];
            for(int i=0;i<N;i++)
            {
                for(int j=0;j<Q;j++)
                {
                    C[i][j]=valueOf(A,B);
                }
            }
        }



    }
}
