import java.util.Scanner;

public class birthday_chocolate {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n,i,d,m,j,c=0,s=0,p=0;
        n=ob.nextInt();
        int a[]= new int[n];
        for(i=0;i<n;i++)
            a[i]= ob.nextInt();
        d=ob.nextInt();
        m=ob.nextInt();
        for(i=0;i<n-m;i++) {
             for (j = 0; j < m; j++)
                s=s+a[i+j];

            if (s == d)
                p++;
            s = 0;
        }
        if(n!=1)
        System.out.println(p);
        else
            System.out.println('1');
    }

}
