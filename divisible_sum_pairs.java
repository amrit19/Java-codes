import java.util.Arrays;
import java.util.Scanner;
public class divisible_sum_pairs {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n,k,i,j,c=0;
        n=ob.nextInt();
        k=ob.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i] = ob.nextInt();
         Arrays.sort(a);

         for(i=0;i<n;i++)
             for(j=i+1;j<n;j++)
                 if((a[i]+a[j])%k==0)
                     c++;
        System.out.println(c);



    }
}
