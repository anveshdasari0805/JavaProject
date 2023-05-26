import java.lang.*;
import java.util.*;

public class Main {
    public static ArrayList<Integer> solve(ArrayList<Integer> A)
    {
        int len = A.size();
        for(int i=0;i<len;i++)
        {
            System.out.println(A.get(i));
        }
        ArrayList<Integer> a3 = new ArrayList<Integer>();
        for(int i=0;i<len;i++)
        {
            int count=0;
            for(int j=0;j<len;j++)
            {
                System.out.print(A.get(i)+"----"+ A.get(j));
            }
            a3.add(count);
        }

        return a3;
    }
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int A[][] = {{12,65,89,74},{22,44,12,30},{10,12,97,19}};
        int max=0;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                if(A[i][j]>A[i][j+1])
                {
                    max=A[i][j];
                }
                else
                {
                    max=A[i][j+1];
                }
            }
        }
        System.out.println(max);

}}