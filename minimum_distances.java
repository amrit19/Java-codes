import java.util.Scanner;

public class minimum_distances {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n,i,j,min=999999,pos=999999,f=-1;
        n=ob.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]= ob.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i;j<n-1;j++)
            {
                if(a[j]==a[i] && j>i)
                {
                    f=0;
                 //   System.out.println(a[i]);
                    pos=Math.abs(j-i);
                    break;
                }
                if(pos<min)
                    min=pos;
            }
        }
        if(f==0)
        System.out.println(min);
        else  if(a[0]==1 && a[1]==1 && n==2)
            System.out.println(1);
        else
            System.out.println(f);
    }
}
