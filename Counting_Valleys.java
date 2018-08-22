import java.util.Scanner;

public class Counting_Valleys {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n,i,c=0,d=0,f=0;
        String s;char ch;
        n=ob.nextInt();
        s=ob.next();
        for(i=0;i<n;i++)
        {    f=c;
            ch=s.charAt(i);
            if(ch=='U')
                c++;
            if(ch=='D')
                c--;
            if(c==0 && f<0)
                d++;
        }
        System.out.println(d);
    }
}
