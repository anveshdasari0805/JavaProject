import java.util.*;
public class SmallestInArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0;i<N;i++)
        {
            A[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<N;i++)
        {
           min = A[i]<min ? A[i]:min;
        }
        System.out.println(min);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<N;i++)
        {
            max = A[i]>max ? A[i]:max;
        }
        System.out.println(max);
    }
}
