package Pointers2;
import java.util.*;
public class sumofIJpair {
    public static int solve(int A[],int target)
    {
        int N = A.length;
        int p1=0;
        int p2=N-1;
        int ans=0;
        while(p1<p2)
        {
            if(A[p1]+A[p2]==target)
            {
                
            }
            else if((A[p1]+A[p2])>target)
            {
                p2--;
            }
            else if((A[p1]+A[p2])<target)
            {
                p1++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the array size");
        int N = sc.nextInt();
        int A[] = new int[N];
        System.out.println("Please enter the array elements");
        for(int i=0;i<N;i++)
        {
            A[i] = sc.nextInt();
        }
        System.out.println("Please enter the target element");
        int target = sc.nextInt();
        int ans = solve(A,target);
        System.out.println(ans);
    }
}
