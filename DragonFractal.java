import java.util.Scanner;
import java.lang.String;
public class DragonFractal
{
    public static String l(String s)
    {
        s = s.replace('R','l');
        s = s.replace('L','r');
        s = s.replace('l','L');
        s = s.replace('r','R');
        return s;
    }
    public static String r(String s)
    {
        char[] c = s.toCharArray();
        int n = s.length();
        for(int i=0;i<n/2;i++)
        {
            char t = c[i];
            c[i] = c[n-i-1];
            c[n-i-1] = t;
        }
        s = String.valueOf(c);
        return s;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] s = new String[N];
        s[0] = "F";
        for(int i=0;i<N-1;i++)
        {
            String temp=l(s[i]);
            String temp2=r(temp);
            s[i+1]=s[i]+"L"+temp2;
            System.out.println(s[i]);
        }
    }
}

