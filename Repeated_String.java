import java.util.Scanner;

public class Repeated_String {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        long n;
        int i,c=0,l,q;

        String s;
        s=ob.next();
        n=ob.nextLong();
        char ch;
        q=s.length();
        i=0;
        while(true)
        {
            if(c==n)
                break;
            s=s+s.charAt(i);
            c++;i++;

        }
        l=s.length();
        s=s.substring(0,(l-1)-(q-1));
        System.out.println(s);
            c=0;
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch=='a')
                c++;
        }
        System.out.println(c);

    }
}
