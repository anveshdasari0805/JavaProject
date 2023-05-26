import java.util.*;
public class PrefixSumEvenRangeIndices {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0;i<N;i++)
        {
            A[i]= sc.nextInt();
        }
        int B[][]={{1,2},{3,4}};
        System.out.println(B[0][1]);
        for(int i=0;i<N;i++)
        {
            A[i] = (i%2!=0) ? 0: A[i]*1;
        }
       for(int i=0;i<N;i++)
       {
           System.out.print(A[i]+" ");
       }
       int pf[] = new int[N];
       pf[0]=A[0];
       for(int i=1;i<N;i++)
       {
           pf[i]=pf[i-1]+A[i];
       }
       System.out.println();
        for(int i=0;i<N;i++)
        {
            System.out.print(pf[i]+" ");
        }
        int start = sc.nextInt();
        int end = sc.nextInt();
        int count = (start==0)?pf[end]:pf[end]-pf[(start-1)];
        System.out.println(count);

    }
}
