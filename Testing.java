import java.util.*;
public class Testing {
    public  static int[][] copyMatrix(int[][] A)
    {
        int N = A.length;
        int M = A[0].length;
        int a1[][] = new int[N][M];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                a1[i][j]=A[i][j];
            }
        }
        return a1;
    }
    public static int[][] sortMatrix(int[][] B)
    {
        int N = B.length;
        int M = B[0].length;
        int a2[][] = new int[N][M];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                for(int k=0;k<M;k++)
                {
                    int temp = 0;
                    if (k == M - 1) {
                        break;
                    }
                    if (B[i][k] > B[i][k + 1]) {
                        temp = B[i][k + 1];
                        B[i][k + 1] = B[i][k];
                        B[i][k] = temp;
                    }
                }
            }
        }
        return B;
    }

    public static void main(String[] args) {
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
        // Print the matrix taken from the input
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        //Copy the matrix into a new one
        int copyA[][] = copyMatrix(A);
        int sortA[][] = sortMatrix(A);
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                System.out.print(sortA[i][j]+" ");
            }
            System.out.println();
        }
    }
}
