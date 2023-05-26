import java.util.*;
public class CarryForwardLeaderArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Array Length");
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0;i<N;i++)
        {
            System.out.println("Enter the element for the array");
            A[i]=sc.nextInt();
        }
        int max=A[N-1];
        int leader=1;
        for(int i=N-2;i>=0;i--)
        {
            if(A[i]>max)
            {
                max=A[i];
                leader=leader+1;
            }
        }
        System.out.println(leader);

        ArrayList<Integer> B = new ArrayList();
    }
}
