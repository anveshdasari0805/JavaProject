import java.util.*;
public class SpiralPringintgMatrix {
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
        int i=0,j=0;
        while(N>1 &M>1) {
            for (int k = 0; k < M - 1; k++) {
                System.out.print(A[i][k] + " ");
                j = j + 1;

            }
            for (int k = 0; k < N - 1; k++) {
                System.out.print(A[k][j] + " ");
                i = i + 1;
            }
            for (int k = M - 1; k > 0; k--) {
                System.out.print(A[i][k] + " ");
                j = j - 1;
            }
            for (int k = N - 1; k > 0; k--) {
                System.out.print(A[k][j] + " ");
                i = i - 1;
            }
            i = i + 1;
            j = j + 1;
            N = N - 1;
            M = M - 1;

        }
        if(N==1)
        {
            System.out.println(A[i][j]);
        }

    }
}
