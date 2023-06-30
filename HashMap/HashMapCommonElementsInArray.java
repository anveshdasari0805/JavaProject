package HashMap;

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
        int B[] = new int[M];
        for(int i=0;i<M;i++)
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
        /**for(Integer key:hm.keySet())
        {
            System.out.println("Key is "+key+"  Value is "+hm.get(key));
        }
        for(Integer key:hmB.keySet())
        {
            System.out.println("B hashmap Key is "+key+"  Value is "+hmB.get(key));
        }*/
        ArrayList<Integer> C = new ArrayList<>();
        for(Integer key:hm.keySet())
        {
            boolean key1=hmB.containsKey(key);

            if(key1)
            {
                int hmvalue=hm.get(key);
                int hmBvalue=hmB.get(key);
                if(hmvalue<=hmBvalue)
                {
                    for(int i=0;i<hmvalue;i++) {
                        C.add(key);
                    }
                }
                else
                {
                    for(int i=0;i<hmBvalue;i++) {
                        C.add(key);
                    }

                }
            }
        }
        for(int i=0;i<C.size();i++)
        {
            System.out.println(C.get(i));
        }
    }
}
