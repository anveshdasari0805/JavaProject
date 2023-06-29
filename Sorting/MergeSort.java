package Sorting;
import java.util.*;
public class MergeSort {
    public static void mergesort(int A[],int start,int end)
    {
        int mid=(start+end)/2;
        mergesort(A,start,mid);
        mergesort(A,mid,end);
        MergeTwoSortedArrays ms = new MergeTwoSortedArrays();


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter array length");
        int N = sc.nextInt();
        int A[] = new int[N];
        System.out.println("Please enter the array elements");
        for(int i=0;i<N;i++)
        {
            A[i] = sc.nextInt();
        }
        int start=0,end=N,mid=((start+end)/2);
        int B[] = new int[mid];
        for(int i=0;i<mid;i++)
        {
            B[i]=A[i];
        }
        int C[] = new int[N-(mid)];
        int k=0;
        while(mid<N)
        {
            C[k]=A[mid];
            k++;
            mid++;
        }
        BubbleSort bs = new BubbleSort();
        int D[] = bs.sort(B);
        int E[] = bs.sort(C);
        MergeTwoSortedArrays ms = new MergeTwoSortedArrays();
        int F[] = ms.merge(D,E);
        for(int i=0;i<F.length;i++)
        {
            System.out.print(F[i]+" ");
        }
    }
}
