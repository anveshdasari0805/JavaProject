import java.util.*;
public class PrefixSumArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        int P[] = new int[N];
        for(int i=0;i<N;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("Enter the 2D Matrix");
        int M = sc.nextInt();
        int B[][] = new int[M][2];
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<2;j++)
            {
                B[i][j]=sc.nextInt();
            }
        }
        P[0]=A[0];
        for(int i=1;i<N;i++)
        {
            P[i]=P[i-1]+A[i];
        }
        for(int i=0;i<N;i++)
        {
          System.out.println(P[i]);
        }
        int Answer[]=new int[M];
        for(int i=0;i<M;i++)
        {
            int start = B[i][0];
            int end = B[i][1];
            if(start==0)
            {
                Answer[i]=P[end];
            }
            else {
                Answer[i]=P[end]-P[start-1];
            }
        }
System.out.println();
        for(int i=0;i<M;i++)
        {
            System.out.println(Answer[i]);
        }



    }
}
