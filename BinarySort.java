import java.util.*;
public class BinarySort {
    public static int solve(int A[])
    {
        int N = A.length;
        int sum=0;
        for(int i=0;i<N;i++)
        {
            sum=sum+A[i];
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<N;i++)
        {
            if(max<A[i])
            {
                max=A[i];
            }
            if(A[i]<min)
            {
                min=A[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
        int val=0;
        val=N*(min+max)/2;
        if(sum==val)
        {
            return 1;
        }
        return 0;
        /**for(int i=0;i<N-1;i++)
        {
            for(int j=0;j<N-i-1;j++)
            {
                if(A[j]>A[j+1])
                {
                    A[j]=A[j]+A[j+1];
                    A[j+1]=A[j]-A[j+1];
                    A[j]=A[j]-A[j+1];
                }
            }
        }
        for(int i=0;i<N-1;i++)
        {
            if(A[i]+1!=A[i+1])
            {
                return 0;
            }
        }
        return 1;*/
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0;i<N;i++)
        {
            A[i]= sc.nextInt();
        }
        int a = solve(A);
        System.out.println(a);
        /**for(int i=0;i<N-1;i++)
        {
            for(int j=0;j<N-1;j++)
            {
                if(A[j]>A[j+1])
                {
                A[j]=A[j]+A[j+1];
                A[j+1]=A[j]-A[j+1];
                A[j]=A[j]-A[j+1];
                }
            }
        }
        int count=0;
        for(int i=0;i<N-1;i++)
        {
            if(A[i+1]-A[i]!=1)
            {
                System.out.println("Not");
            }
            else
            {
                count++;
            }
        }
        System.out.println(count);*/

    }
}
