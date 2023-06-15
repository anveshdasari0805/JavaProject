import java.util.*;
public class HashMapCommonElementsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0;i<N;i++)
        {
            A[i]=sc.nextInt();
        }
        int M = sc.nextInt();
        int B[] = new int[N];
        for(int i=0;i<N;i++)
        {
            B[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<N;i++)
        {
            if(hm.containsKey(A[i]))
            {
                hm.put(A[i],hm.get(A[i])+1);
            }
            else
            {
                hm.put(A[i],1);
            }
        }
        HashMap<Integer,Integer> hmB = new HashMap<>();
        for(int i=0;i<M;i++)
        {
            if(hmB.containsKey(B[i]))
            {
                hmB.put(B[i],hmB.get(B[i])+1);
            }
            else
            {
                hmB.put(B[i],1);
            }
        }
        for(Integer key:hm.keySet())
        {
            System.out.println("Key is "+key+"  Value is "+hm.get(key));
        }
        for(Integer key:hmB.keySet())
        {
            System.out.println("Key is "+key+"  Value is "+hmB.get(key));
        }
        ArrayList<Integer> C = new ArrayList<>();
        for(Integer key:hm.keySet())
        {
            if(hmB.containsKey(key))
            {
                if(hm.get(key)<=hmB.get(key))
                {
                    for(int i=0;i<hm.get(key);i++) {
                        C.add(key);
                    }
                }
            }
        }
        System.out.println(C.size());

        for(int i=0;i<C.size();i++)
        {
            System.out.println(C.get(i));
        }
    }
}
