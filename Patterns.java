import java.util.*;
public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++)
        {
            for(int k=1;k<=N-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }

        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=N;i++)
        {
            for(int k=1;k<=N-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("------");
        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=N-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<=N;i++)
        {
            for(int k=0;k<i-1;k++)
            {
                System.out.print(" ");
            }
            for(int j=N;j>=i;j--)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }

        for(int i=1;i<=N;i++)
        {
            for(int k=0;k<i-1;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=N-i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=N-1;i++)
        {
            for(int j=1;j<=N-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=N;i++)
        {
            for(int k=1;k<=N-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=N-1;i++)
        {
            for(int k=1;k<=i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=N-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        /**
         * Creating a SandGlass Pattern
         */
        for(int i=1;i<=N;i++)
        {
            for(int k=0;k<i-1;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=N-i+1;j++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=1;i<=N;i++)
        {
            for(int k=1;k<N-i+1;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=1;i<=N;i++)
        {
            for(int k=1;k<=N-i;k++)
            {
                System.out.print(" ");
            }
            System.out.print("A");

            System.out.println();
        }
    }
}
