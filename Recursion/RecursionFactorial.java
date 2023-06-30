package Recursion;

import java.util.*;
public class RecursionFactorial {
        public static long fact(int A)
        {
            if(A!=1)
            {
                long val = A*fact(A-1);
                return val;
            }
            else{
                return 1;
            }

        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(fact(N));

    }
}
