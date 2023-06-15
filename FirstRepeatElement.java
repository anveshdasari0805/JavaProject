import java.util.*;
public class FirstRepeatElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0;i<N;i++)
        {
            A[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> hs = new HashMap<>();
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
        System.out.println(hs);
        int ans=0;
        for(int i=0;i<N;i++)
        {
            if(hs.containsKey(A[i]) && hs.get(A[i])>1)
            {
                ans=A[i];
                break;
            }
        }
        if(ans==0)
        {
            System.out.println(ans);
        }
        else {
            System.out.println("Answer"+ans);
        }
    }
}
