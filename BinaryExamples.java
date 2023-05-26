import java.util.*;
public class BinaryExamples {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A);
        A=A>>B;
        A=A<<B;
        System.out.println(A);

    }

}
