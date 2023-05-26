
import java.util.*;
public class ArrayRotation {

    public static int[] reverse(int B[],int start,int end)
    {
        while(start<end)
        {
            int temp=B[end];
            B[end]=B[start];
            B[start]=temp;
            start++;
            end--;
        }
        return B;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0;i<N;i++)
        {
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        B=B%N;
        reverse(A,0,N-1);
        reverse(A,0,B-1);
        reverse(A,B,N-1);
        for(int i=0;i<N;i++)
        {
            System.out.println(A[i]);
        }

    }
}
