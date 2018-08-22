import java.util.Scanner;
public class kangaroo {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int x1,v1,x2,v2,t,c=0,d=0;
         System.out.println("enter the values ");
        x1=ob.nextInt();
        v1=ob.nextInt();
        x2=ob.nextInt();
        v2=ob.nextInt();

        if(x1>x2)
        {
            t=x1;
            x1=x2;
            x2=t;
            c=1;
            t=v1;
            v1=v2;
            v2=t;
        }
        d=x2-x1;
        while(c>=0) {
            x1 = x1 + v1;
            x2 = x2 + v2;
            c++;
            if ((x1 == x2) && ( x1<=10000 || x2<=10000||v1<=10000||v2<=10000||x1>=0||x2>=0||v1>=1||v2>=1) )
            {
                System.out.println("YES");
                break;
            }else
            if (x1 > x2 && (x2 - x1) > d || x1>10000 || x2>10000||v1>10000||v2>10000||x1<0||x2<0||v1<1||v2<1)
            {
                System.out.println("NO");
                break;
            }
        }
    }
}
