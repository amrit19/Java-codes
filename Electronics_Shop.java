import java.util.Scanner;

public class Electronics_Shop {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int b,n,m,max=-1,i,j;
        b=ob.nextInt();
        n=ob.nextInt();
        m=ob.nextInt();
        int keyboard[]=new int[n];
        int drives[] = new int[m];
        for(i=0;i<n;i++)
            keyboard[i]=ob.nextInt();
        for(i=0;i<m;i++)
            drives[i]=ob.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(drives[j]+keyboard[i]<=b && drives[j]+keyboard[i]>max )
                    max=drives[j]+keyboard[i];
            }
        }
        System.out.println(max);
    }
}
