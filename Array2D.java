import java.util.*;
public class Array2D {

    public static ArrayList<ArrayList<Integer>> Frequency(ArrayList<ArrayList<Integer>> A)
    {
        ArrayList<ArrayList<Integer>> D = new ArrayList<>();
        int N = A.size();
        for(int i=0;i<N;i++)
        {
            D.add(new ArrayList<Integer>());
            int M = A.get(i).size();
            for(int j=0;j<M;j++)
            {
                int count=0;
                for(int k=0;k<M;k++)
                {
               if(j==k)
                    {
                        continue;
                    }
                    if(A.get(i).get(j)==A.get(i).get(k))
                    {
                        count+=1;
                    }
                }
                if(count==0)
                {
                    D.get(i).add(A.get(i).get(j));}
            }
        }
        return D;

    }
    public static ArrayList<Integer> sortMatrix(ArrayList<Integer> A)
    {
        int N = A.size();
        ArrayList<Integer> C = new ArrayList<>();
        for(int i=0;i<N;i++)
        {
            int key =C.get(i);
            int temp=0;
            for(int j=0;j<N;j++)
            {
                if(C.get(i)<C.get(i))
                {

                }
            }
        }

        return C;
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int N = A.size();
        ArrayList<Integer> C = new ArrayList<>();
        for(int i=0;i<N;i++)
        {
            int count=0;
            for(int j=0;j<N;j++)
            {
                if(A.get(i)==A.get(j))
                {
                    count++;
                }

            }
            if(count==1)
            {
                C.add(A.get(i));
            }
        }
        Collections.sort(C);
        return C;
    }
    public static int solved(int[] A, int B) {
        int N = A.length;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                if(i!=j)
                {
                    continue;
                }
                if(A[i]+A[j]==B)
                {
                    return 1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("Hello-----");
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++)
        {
            A.add(new ArrayList<>());
        }
        for(int j=0;j<N;j++)
        {
            int M = sc.nextInt();
            for(int k=0;k<M;k++)
            {
                A.get(j).add(sc.nextInt());
            }
        }

        ArrayList<ArrayList<Integer>> D = Frequency(A);
        for(int j=0;j<N;j++)
        {
            System.out.println(D.get(j));
        }
}}
