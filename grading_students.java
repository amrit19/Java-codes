import java.util.Scanner;
public class grading_students {
    public static void main(String[] args) {
        int i,n,next_five;
      //  System.out.println("enter the value of n ");
        Scanner ob = new Scanner(System.in);
        n=ob.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=ob.nextInt();
        for(i=0;i<n;i++)
        {
            next_five=5-(a[i]%5)+a[i];
            if(a[i]-next_five<3&&a[i]>=38)
                a[i]=next_five;
            System.out.println(a[i]);

        }
    }
}
