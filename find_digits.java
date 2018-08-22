import java.util.Scanner;

public class find_digits {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int i,t;
        long n,c,m,d;
        t=ob.nextInt();
        for(i=1;i<=t;i++)
         {
            c=0;
            n=ob.nextInt();
            m=n;
            while(m>0) {
                d = m % 10;
                if (d != 0) {
                    if (m % d == 0)
                        c++;}
                    m = m / 10;

            }
             System.out.println(c);
        }
    }
}
