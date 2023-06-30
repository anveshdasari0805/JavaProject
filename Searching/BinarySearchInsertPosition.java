package Searching;
import java.util.*;

public class BinarySearchInsertPosition {
    public static int solve(int A[],int target)
    {
        int low=0;
        int high=A.length-1;
        int mid=(low+high)/2;
        while(low<=high)
        {
            mid=(low+high)/2;
            if (target == A[mid]) {
                return 1;
            } else if (target < A[mid]) {
                high = mid - 1;
            } else if(target>A[mid]) {
                low = mid + 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the array size");
        int N = sc.nextInt();
        int A[] = new int[N];
        System.out.println("Please enter the array elements");
        for(int i=0;i<N;i++)
        {
            A[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int val =(solve(A,target));
        if(val==0)
        {
            System.out.println("Values is present");
        }
        else
        {
            System.out.println("Not present");
        }

    }
}
