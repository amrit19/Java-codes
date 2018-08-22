import java.util.Scanner;

public class utopian_tree {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int t,i,n,j,c=2;
        long h;
        t=ob.nextInt();
        for(i=1;i<=t;i++)
        {
            n=ob.nextInt();
            h=1;c=2;
           for(j=1;j<=n;j++)
           {
               if(c%2==0)
                   h=h*2;
               else
                   h=h+1;
               c++;
           }
                System.out.println(h);

        }

    }
}
