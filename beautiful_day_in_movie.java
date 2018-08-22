import java.util.Scanner;

public class beautiful_day_in_movie {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        long i,j,k,c=0,a;double x;int p;
        i=ob.nextLong();
        j=ob.nextLong();
        k=ob.nextLong();
        for(a=i;a<=j;a++) {
          //  System.out.println(reverse(a));
            x =Math.abs(a - reverse(a))/(k*1.0);
            //System.out.println("x="+x);
            p=(int)((Math.abs(a - reverse(a))) / k);
            //System.out.println("p="+p);
            if (x==p)
                c++;
        }
        System.out.println(c);
    }
    public static long reverse(long a)
    {
        long d,s=0;
        while(a>0)
        {
            d=a%10;
            s=s*10+d;
            a/=10;
        }
        return s;
    }

}
