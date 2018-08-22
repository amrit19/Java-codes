import java.util.Scanner;

public class Breaking_the_records {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n,i,max=0,min=0,maxcount=0,mincount=0;
        n=ob.nextInt();
        int a[]=new int[n];

        for(i=0;i<n;i++){
            a[i]=ob.nextInt();
        }
        max=a[0];min=a[0];
        for(i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
                maxcount++;
            }
            if(a[i]<min)
            {
                min=a[i];
                mincount++;
            }
        }
        System.out.println(maxcount+" "+mincount);
    }
}
