import java.util.Scanner;

public class cut_the_sticks
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n,i,min,j,c=0,f=0;
        n=ob.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        a[i]=ob.nextInt();
        min=a[0];
        while(true)
        {
            min=1001;
            for (j = 0; j < n; j++)
            {


                if (a[j] < min && a[j] != 0)
                    min = a[j];
            }
            c = 0;
            for (j = 0; j < n; j++)
            {
                if (a[j] != 0)
                {
                    a[j] = a[j] - min;
                    c++;
                }
            }
            if (c != 0)
                System.out.println(c);
            else
              break;

        }
    }
}
