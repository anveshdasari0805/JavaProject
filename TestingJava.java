import java.util.*;
public class TestingJava {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int A[] = new int[N];
    for(int i=0;i<N;i++)
    {
        A[i]=sc.nextInt();
    }
    int B[] = new int[M];
    HashMap<Integer,Integer> hs = new HashMap<>();
    for(int i=0;i<M;i++)
    {
        B[i]=sc.nextInt();
    }
        for(int i=0;i<N;i++)
        {
            if(hs.containsKey(A[i]))
            {
                hs.put(A[i],hs.get(A[i])+1);
            }
            else
            {
                hs.put(A[i],1);
            }
        }
        for(int i=0;i<M;i++)
        {
            if(hs.containsKey(B[i]))
            {
                hs.put(B[i],hs.get(B[i])+1);
            }
            else
            {
                hs.put(B[i],1);
            }
        }
        System.out.println(hs);

        }
    }

