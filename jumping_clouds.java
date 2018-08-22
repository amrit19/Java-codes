import java.util.Scanner;

public class jumping_clouds {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n,i,k,e=100;
        n=ob.nextInt();
        k=ob.nextInt();
        int c[] = new int[n];
        for(i=0;i<n;i++)
            c[i]=ob.nextInt();
          i=0;
       do
        {
         if(c[i]==0)
             e--;
         if(c[i]==1)
             e=e-3;
         i=(i+k)%n;
        }while(i!=0);
        System.out.println(e);
    }

}
