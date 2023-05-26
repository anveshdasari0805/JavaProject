import java.util.*;
public class SubArrayIntoA2DArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();

        /**for(int i=0;i<N;i++)
        {
            for(int start=i;start<N;start++)
            {
                for(int end=i;end<=start;end++)
                {
                    System.out.print(A[end]+"  ");
                }
                System.out.println();
            }

        }*/
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0;i<N;i++)
        {
            A.add(sc.nextInt());
        }
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        for(int i=0;i<N;i++)
        {

            for(int start=i;start<N;start++)
            {
                ArrayList<Integer> temp = new ArrayList<>();
                for(int end=i;end<=start;end++)
                {
                    temp.add(A.get(end));
                    System.out.print(A.get(end));
                }
                System.out.println();
                B.add(temp);
            }
        }
        for(int i=0;i<B.size();i++)
        {
            System.out.println(B.get(i));
        }
    }
}
