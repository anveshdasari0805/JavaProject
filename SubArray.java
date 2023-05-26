import java.util.*;
public class SubArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean name = N>10? true : false;
        System.out.println(name);
        int A[] = new int[N];
        for(int i=0;i<N;i++)
        {
            A[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++) {
            for (int start = i; start < N; start++) {
                int sum=0;
                for (int end = i; end <= start; end++) {
                    //System.out.print(A[end] + " ");
                    sum=sum+A[end];
                }
                System.out.print(sum+" ");

            }
        }


    }
}

