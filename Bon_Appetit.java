import java.util.Scanner;

public class Bon_Appetit {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n,k,i,b,s=0,m=0;
        n=ob.nextInt();
        k=ob.nextInt();
        int bill[]=new int[n];
        for(i=0;i<n;i++)
        bill[i]=ob.nextInt();
        b=ob.nextInt();
        for(i=0;i<n;i++)
        {
            if(i!=k)
                s=s+bill[i];
        }
        s=s/2;
        if(s==b)
            System.out.println("Bon Appetit");
        else
        {
            m=s*2-((s*2-bill[k]/2));
            System.out.println(m);
        }


    }
}
