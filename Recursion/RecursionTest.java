package Recursion;
import java.util.*;
public class RecursionTest {
    public static int recursive(String str,int start,int end) {

            if(start!=end && start<=end) {
                if (str.charAt(start) == str.charAt(end)) {
                    return recursive(str, start + 1, end - 1);
                } else {
                    return 0;
                }
            }

            return 1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int end = str.length();
        System.out.println(recursive(str,0,end-1));
    }
}

