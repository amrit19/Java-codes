import java.util.Scanner;
import java.lang.String;
public class Picking_Numbers {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n,i,c=0,max=0,j,k,f=0,l,g=0;
        n=ob.nextInt();
        String s="";String ch="";char ch1,ch2;
        int a[]=new int[n];
         for(i=0;i<n;i++)
          a[i]=ob.nextInt();
         for(i=0;i<n;i++)
         {
             c=0;
             for(j=i;j<n;j++)
             {
                 if((Math.abs(a[j]-a[i])<=1)&& i!=j)
                 {
                     s=s+s.valueOf(a[j]);
                     c++;
             }
             }
             for(k=0;k<s.length();k++)
             {   ch="";
                 ch1=s.charAt(k);
                 ch=ch+ch1;
                 if(ch.equals(s.valueOf(a[i])))
                 {c++;break;}
             }
             if(c>max)
                 max=c;
         }
        System.out.println(max);




    }
}
