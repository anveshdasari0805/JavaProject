package Sorting;
import java.util.*;
public class MergeTwoSortedArrays {
    public static int[] merge(int[] A,int[] B)
    {
        int N = A.length;
        int M = B.length;
        int C[] = new int[N+M];
        int p1=0,p2=0,p3=0;
        while(p1<N && p2<M)
        {
            if(A[p1]<B[p2])
            {
                C[p3]=A[p1];
                p1++;
                p3++;
            }
            else
            {
                C[p3]=B[p2];
                p2++;
                p3++;
            }
        }
        if(p1==(N))
        {
            while(p2<M)
            {
                C[p3]=B[p2];
                p2++;
                p3++;
            }
        }
        if(p2==(M))
        {
            while(p1<N)
            {
                C[p3]=A[p1];
                p1++;
                p3++;
            }
        }
        return C;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter array length for first");
        int N = sc.nextInt();
        int A[] = new int[N];
        System.out.println("Please enter array length for second");
        int M = sc.nextInt();
        int B[] = new int[M];
        System.out.println("Please enter the first array elements");
        for(int i=0;i<N;i++)
        {
            A[i] = sc.nextInt();
        }
        System.out.println("Please enter the second array elements");
        for(int i=0;i<M;i++)
        {
            B[i] = sc.nextInt();
        }
        int C[] = merge(A,B);
        for(int i=0;i<(N+M);i++)
        {
            System.out.print(C[i]+" ");
        }


    }
}
