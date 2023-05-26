import java.util.*;
public class CarryForwardSpecialSequences {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int N = name.length();
        char ch[] = new char[N];
        for(int i=0;i<N;i++)
        {
            ch[i]=name.charAt(i);
        }
        /**int p=0,cg=0;
        for(int i=N-1;i>=0;i--)
        {
            if(ch[i]=='g')
            {
                cg++;
            }
            else if(ch[i]=='a')
            {
                p=p+cg;
            }
        }
        System.out.println(p);*/

        int ca=0,p=0;
        for(int i=0;i<N;i++)
        {
            if(ch[i]=='a')
            {
                ca++;
            }
            else if(ch[i]=='g')
            {
                p=p+ca;
            }
        }
        System.out.println(p);
    }
}
