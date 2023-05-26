
import java.util.*;
public class TestingStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**String A = "interviewbit";
        int len =A.length();
        char ch[] = new char[len];
        for(int i=0;i<len;i++)
        {
            ch[i]=A.charAt(i);
            int val = (int)ch[i];
            if(val>=65 && val<=90)
            {
                val=val+32;
            }
            else if(val>=97 && val<=132)
            {
                val = val-32;
            }
            ch[i]=(char)(val);
        }
        String ans = A.valueOf(ch);
        System.out.println(ans);*/
        int A[][]={{1,2},{4,5},{8,9}};
        int N = A.length;
        int M = A[0].length;
        int B[] = new int[N+M];
        for(int i=0;i<N;i++)
        {
            int sum=0;
            for(int j=0;j<M;j++)
            {
                sum=sum+A[i][j];
                System.out.println(A[i][j]);
            }
            B[i]=sum;
        }
        int k=N-1;
        for(int j=0;j<M;j++)
        {
            int sum=0;
            for(int i=0;i<N;i++)
            {
                B[k]=B[k]+A[i][j];
            }
            k++;
        }
        for(int i=0;i<B.length;i++)
        {
            System.out.println(B[i]);
        }


















        /**String s = "level";
        int len = s.length();
        char ch[] = new char[len];
        for(int i=0;i<len;i++)
        {
            ch[i]=s.charAt(i);
        }
        for(int i=0;i<(len/2);i++)
        {
            char temp=ch[i];
            temp=ch[len-1-i];
            ch[len-1-i]=ch[i];
            ch[i]=temp;
        }
        System.out.println(ch);
        String ans = s.valueOf(ch);
        System.out.println(ans);
        System.out.println(ans.equals(s));*/




















        /**int len = s.length();
        char start = s.charAt(0);
        char ch[] = new char[len];
        for(int i=0;i<len;i++)
        {
            ch[i] = s.charAt(i);
        }
        for(int i=1;i<len;i++)
        {
            if(start==ch[i])
            {
                ch[i]='$';
            }
        }
        String str = new String();
        String string = str.valueOf(ch);
        System.out.println(string);
        String ans = "";
        ans = ans + s.charAt(0);
        System.out.print(ans);*/










        /**String s1 = "M1234";
        char ch[] = new char[s1.length()];
        int alphacount=0,numbercount=0;
        for(int i=0;i<s1.length();i++)
        {
            ch[i] = s1.charAt(i);
            if((ch[i]>='A' && ch[i]<='Z') || (ch[i]>='a' && ch[i]<='z'))
            {
                alphacount++;
            }
            else{
                numbercount++;
            }
        }
        if(alphacount>numbercount)
        {
            System.out.println(alphacount);
        }
        else
        {
            System.out.println(numbercount);
        }*/






        /**String s1 = "interviewbit";
        int len = s1.length();
        char ch[] = new char[len];
        int vcount=0,ccount=0;
        for (int i = 0; i < len; i++)
        {
            ch[i]=s1.charAt(i);
            int val = ch[i];
            if(ch[i]=='i' || ch[i]=='a' || ch[i]=='e'||ch[i]=='o'||ch[i]=='u')
            {
                vcount++;
            }
            else {
                ccount++;
            }
        }
        System.out.println(vcount);
        System.out.println(ccount);*/


        /**int D[] = new int[3];
        String A = "Anvesh";
        int len = A.length();
        char ch[] = new char[len];
        for(int i=0;i<len;i++)
        {
            ch[i]=A.charAt(i);
            int val = (int)ch[i];
            if(val>=65 && val<=90)
            {
                val=val+32;
            }
            else if(val>=97 && val<=132)
            {
                val=val-32;
            }
            ch[i]=(char)val;

        }
        String st1 = new String(ch);
        System.out.println(st1.valueOf(ch));

        for(int i=0;i<len/2;i++)
        {
            for(int j=(len)/2;j>=0;j--)
            {
                if(i==j || i>j)
                {
                    break;
                }
                else {
                    char temp = ch[j];
                    ch[j] = ch[i];
                    ch[i] = temp;

            }
        }
        System.out.print((ch));
        System.out.print((D[0]));*/

    }
}
