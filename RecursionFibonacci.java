import java.util.*;
public class RecursionFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i=0;
        int j=1;
        int k=i+j;
        while(k<N){
            j=k;
            k=j+k;
            System.out.print(k+" ");}

    }
}
