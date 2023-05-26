import java.util.*;
public class RangeSumQueryMatrix {
    public static int Result(int A[],int B[][],int i)
    {
        int ans=0;
        int N = B.length;
        int M = B[0].length;
        int start = B[i][0];
        int end = B[i][1];
        for(int j=start;j<=end;j++)
        {
            ans=ans+A[j];
            System.out.println(ans);
        }
        return ans;
    }



    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0;i<N;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("Enter the second matrix B");
        int M=sc.nextInt();
        int B[][] = new int[M][2];
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<2;j++)
            {
                B[i][j]=sc.nextInt();
            }
        }

        int Answer[]=new int[M];
        for(int i=0;i<M;i++)
        {
            Answer[i]= Result(A,B,i);
        }
System.out.println("Printing the output matrix");

        for(int i=0;i<M;i++)
        {
            System.out.println(Answer[i]);
        }

    }}
