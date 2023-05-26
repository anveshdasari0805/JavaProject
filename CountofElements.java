import java.util.*;
public class CountofElements {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0;i<N;i++)
        {
            A[i]=sc.nextInt();
        }
        int ans=0;
        /**for(int i=0;i<N;i++)
        {
            int count=0;
            for(int j=0;j<N;j++)
            {
                if(i==j)
                {
                    continue;
                }
                if(A[i]<A[j])
                {
                    count+=1;
                }
            }
            if(count>=1)
            {
                ans++;
            }
        }*/
        int max=A[0];
        for(int i=1;i<N;i++)
        {
            if(max<A[i])
            {
                max=A[i];
                ans=1;
            }
            else if(max==A[i])
                {
                   ans++;
                }
            }
        System.out.println(ans);
System.out.println(N-ans);
}

}
