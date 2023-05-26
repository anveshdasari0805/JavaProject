import java.util.*;
public class ProductofArrayElements {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for (int i = 0;i<N; i++)
        {
            A[i]=sc.nextInt();
        }
        int product=1;
        for(int i=0;i<N;i++)
        {
            product=product*A[i];
        }
        int P[]=new int[N];
        for(int i=0;i<N;i++)
        {
            P[i]=(product/A[i]);
        }

    }
}
