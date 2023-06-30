package HashMap;

import java.util.*;
public class HashMapSubArraySumZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0;i<N;i++)
        {
            A[i]=sc.nextInt();
        }
        int pf[] = new int[N];
        pf[0]=A[0];
        for(int i=1;i<N;i++)
        {
            pf[i]=pf[i-1]+A[i];
        }
        System.out.println();
        for(int i=0;i<N;i++)
        {
            System.out.print(pf[i]+" ");
        }
        System.out.println();
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<N;i++)
        {
            if(hs.contains(pf[i]))
            {
                System.out.println(1);
                break;
            }
            else
            {
                hs.add(pf[i]);
            }
        }
        System.out.println("Output is");
        for(int i=0;i<N;i++)
        {
            if(pf[i]==0)
            {
                System.out.println(1);
            }
        }

    }
}
