import java.util.*;
public class Testing1 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i=0;i<T;i++)
        {
            int N = sc.nextInt();
            int evencount = 0, oddcount = 0;
            int A[] = new int[N];
            for (int j= 0;j<N;j++) {
                A[j] = sc.nextInt();
                if (A[j] % 2 == 0) {
                    evencount += 1;
                } else {
                    oddcount += 1;
                }
            }
            int evenA[] = new int[evencount];
            int oddA[] = new int[oddcount];
            int k = 0, m = 0;
            for (int l= 0;l< N;l++) {
                if (A[l] % 2 == 0) {
                    evenA[k] = A[l];
                    k += 1;
                } else {
                    oddA[m] = A[l];
                    m += 1;
                }
            }
            for (int o= 0;o< oddcount; o++)
            {
                if(o==(oddcount-1))
                {
                    System.out.print(oddA[o]+" ");
                }
                else{
                    System.out.print(oddA[o]+" ");
                }
            }
            System.out.println();
            for (int p=0;p< evencount; p++)
            {
                if(p==(evencount-1))
                {
                    System.out.print(evenA[p]+" ");
                }
                else{
                    System.out.print(evenA[p]+" ");
                }
            }
            System.out.println();
        }
    }
}
