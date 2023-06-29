package Sorting;
import java.util.*;
public class BubbleSort {
    public static int[] sort(int A[])
    {
        int N = A.length;
        int count=0;
        for(int i=0;i<N-1;i++)
        {
            for(int j=0;j<N-1;j++)
            {
                count++;
                if(A[j]>A[j+1])
                {
                    A[j]=A[j]+A[j+1];
                    A[j+1]=A[j]-A[j+1];
                    A[j]=A[j]-A[j+1];
                }
            }
        }


        return A;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Array Size");
        int N = sc.nextInt();
        int A[] = new int[N];
        System.out.println("Enter the values for the Array");
        for(int i=0;i<N;i++)
        {
            A[i]=sc.nextInt();
        }
        //Sorting the array by using the function
        int B[] = sort(A);
        for(int i=0;i<N;i++)
        {
            System.out.print(B[i]+" ");
        }


    }
}
