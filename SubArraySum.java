import java.util.*;
public class SubArraySum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0;i<N;i++)
        {
            A[i]=sc.nextInt();
        }
        /**Max SubArray Sum
        long ans=0;
            for(int s=0;s<N;s++)
            {
                long sum=0;
                    for(int e=s;e<N;e++)
                {
                    sum=sum+A[e];
                    System.out.println(sum);
                    if(sum>ans)
                    {
                        ans=sum;
                    }
                }

            }
            System.out.println("Max sub array sum is"+ans);*/
        int sum=0;
        for(int i=0;i<N;i++)
        {
            sum=sum+(((i+1)*(N-i)*A[i]));
        }
        System.out.println("Sum is "+sum);


        }

    }

