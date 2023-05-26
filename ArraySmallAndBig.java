import java.util.*;
public class ArraySmallAndBig {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[]= new int[N];
        for(int i=0;i<N;i++)
        {
            A[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<N;i++)
        {
            if(min>A[i])
            {
                min=A[i];
            }
            if(max<A[i])
            {
                max=A[i];
            }
        }

        System.out.println(max-min);
    }
}
