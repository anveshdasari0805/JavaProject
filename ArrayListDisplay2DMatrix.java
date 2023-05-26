import java.util.*;
public class ArrayListDisplay2DMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
            for(int i=0;i<N;i++)
                {
                    A.add(new ArrayList<>());
                    for(int j=0;j<M;j++)
                    {
                        A.get(i).add(sc.nextInt());
                    }
                }
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                System.out.print(A.get(j).get(i)+" ");
            }
            System.out.println();
        }

    }
}







