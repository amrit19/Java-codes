import java.util.Scanner;

public class angry_professor {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int t,i,n,k,j,c;
        t=ob.nextInt();
        for(i=1;i<=t;i++)
        {
            c=0;
            n=ob.nextInt();
            k=ob.nextInt();
            int a[]=new int[n];
            for(j=0;j<n;j++)
            {
                a[j]=ob.nextInt();
            }
            for(j=0;j<n;j++)
                if(a[j]<=0)
                    c++;
            if(c>=k)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
