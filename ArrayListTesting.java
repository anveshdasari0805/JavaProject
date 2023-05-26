import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;
public class ArrayListTesting {
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A)
    {
        ArrayList<ArrayList<Integer>> D = new ArrayList<>();
        ArrayList<ArrayList<Integer>> E = A;
        int N = A.size();
        for(int i=0;i<N;i++)
        {
            D.add(new ArrayList<Integer>());
        }
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<A.get(i).size();j++)
            {
               System.out.println(A.get(i).get(j));
            }
        }
        return D;
    }
    public static ArrayList<ArrayList<Integer>> AnveshDasari(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> D = new ArrayList<>();
        int Asize = A.size();
        int Bsize = B.size();
        for(int i=0;i<Bsize;i++)
        {
            D.add(new ArrayList<Integer>());
        }

        for(int k=0;k<Bsize;k++) {
            {
                for (int i = 0; i < Asize; i++) {
                    if (A.get(i) % B.get(k) == 0) {
                        D.get(k).add(A.get(i));
                    }
                }
            }
        }
        return D;
    }

    public static ArrayList<ArrayList<Integer>> solved(int A) {
        ArrayList<ArrayList<Integer>> D = new ArrayList<>();
        for(int i=0;i<A;i++)
        {
            D.add(new ArrayList<Integer>());
            for(int j=0;j<=i;j++)
            {
                D.get(i).add(j+1);
            }
        }
        return D;
    }
    /**public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> Duplicate = new ArrayList<>();
        int N = A.size();
        for(int i=0;i<N;i++) {
            Duplicate.add(new ArrayList<Integer>());
            int Ar_size=A.get(i).size();
            for(int k=0;k<Ar_size;k++)
            {
                if((A.get(i).get(k))%2==0)
                {
                    Duplicate.get(i).add(A.get(i).get(k));
                }
            }
        }

        return Duplicate;
    }*/
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();


        int N = sc.nextInt();
        for(int i=0;i<N;i++)
        {
            A.add(new ArrayList<>());
            int M = sc.nextInt();
            for(int j=0;j<M;j++)
            {
                A.get(i).add(sc.nextInt());
            }
        }
        ArrayList<ArrayList<Integer>> D = solve(A);


        /**for(int i=0;i<N;i++)
        {
            A.add(new ArrayList<Integer>());
            int M = sc.nextInt();
            for(int j=0;j<M;j++)
            {
                A.get(i).add(sc.nextInt());
            }
        }
        ArrayList<ArrayList<Integer>> Duplicate = solve(A);*/
        //ArrayList<ArrayList<Integer>> Duplicated = solved(N);

        for(int i=0;i<D.size();i++)
        {
            /**int Dr_size=Duplicate.get(i).size();
            for(int k=0;k<Dr_size;k++) {

                System.out.println(D.get(i).get(k));
            }*/
            System.out.println(D.get(i));
        }
    }
}
