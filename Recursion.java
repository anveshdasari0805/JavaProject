import java.util.*;
public class Recursion {
    int i=1;
    public static void print1toA(int N)
    {
        if(N==11)
        {
            System.out.println();
        }
        else
        {
            System.out.print(N+" ");
            print1toA(N+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print1toA(1);
        /**int N = sc.nextInt();*/
        /**public void solve(int A)
        {
            if(A==1)
            {
                System.out.print(1+" ");
                System.out.println();
            }
            else {
                System.out.print(A+" ");
                solve(A-1);
            }
        }
        solve(N);*/
        /**public void printAto1(int A){
            if(A == 0){
                return;
            }
            System.out.print(A + " ");
            printAto1(A - 1);
        }
        public void solve(int A) {
            printAto1(A);
            System.out.print("\n");
        }*/

    }
}
