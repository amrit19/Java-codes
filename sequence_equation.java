import java.util.Scanner;

public class sequence_equation {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n,i,j,k,m;
        n=ob.nextInt();
        int a[]=new int[n+1];
        a[0]=0;
        for(i=1;i<=n;i++)
        {
            a[i]=ob.nextInt();
        }
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(a[j]==i)
                {
                    m=j;
                    for(k=1;k<=n;k++)
                    {
                        if(a[k]==m)
                         System.out.println(k);

                    }
                }

            }
        }

    }
}
