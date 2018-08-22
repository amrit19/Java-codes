import java.util.Scanner;

public class save_the_prisoner {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int t,i;
        long j,m,n,s;
        t=ob.nextInt();
        for(i=1;i<=t;i++)
        {
            n=ob.nextInt();
            m=ob.nextInt();
            s=ob.nextInt();
            for(j=s;j<=n;j++)
            {
                if(m==0)
                    break;
                m--;
                if(j==n)
                    j=1;
            }
            if(j==1)
            System.out.println(n);
            else
                System.out.println(j-1);

        }
    }
}
