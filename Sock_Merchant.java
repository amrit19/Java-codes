import java.util.Arrays;
import java.util.Scanner;

public class Sock_Merchant {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n,i,k=0,d=0,m=0,j;
        n=ob.nextInt();
        int c[]=new int[n];
        for(i=0;i<n;i++)
            c[i]=ob.nextInt();
        Arrays.sort(c);
        for(i=0;i<n;i++)
        {
            for(j=m;j<n;j++)
            {
                if(c[i]==c[j])
                {
                    d++;m=j;
                }
            }
            k=k+d/2;
            d=0;
        }
        System.out.println(k);
    }
}
