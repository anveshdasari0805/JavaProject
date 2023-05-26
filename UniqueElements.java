import java.util.*;
public class UniqueElements {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0;i<N;i++)
        {
            A[i]=sc.nextInt();
        }
        /** Sorting the Array*/
        for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                int temp=0;
                if(A[j]<A[i])
                {
                    temp=A[j];
                    A[j]=A[i];
                    A[i]=temp;
                }
            }
        }
        int max = A[N-1];
        int maxfreqcount=0;
        for(int i=N-1;i>=0;i--)
        {
            if(A[i]==max)
            {
                maxfreqcount++;
            }
        }
        System.out.println(N-maxfreqcount);

    }
}
