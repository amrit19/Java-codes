import java.util.Scanner;
public class equality_in_an_array {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n,i,j,c=0,max=0;
        n=ob.nextInt();
        int a[]=new int[n];
        int b[][]=new int[n][2];
        for(i=0;i<n;i++)
            b[i][0]=-1;
        for(i=0;i<n;i++)
            a[i]=ob.nextInt();
        for(i=0;i<n;i++) {
            for (j = 0; j < n; j++) {
                if (a[i] == a[j])
                    c++;
            }
            if (a[i] != b[i][0]) {
                b[i][0] = a[i];
                b[i][1] = c;
            }
        }

        for(i=0;i<n;i++)
        {
          if(b[i][0]>max)
              max=i;
        }
        c=0;
for(i=0;i<n;i++)
{
    if(i!=max)
        c=c+b[i][1];
}
        System.out.println(c);

    }
}
