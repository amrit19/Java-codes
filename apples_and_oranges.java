import java.util.Scanner;
public class apples_and_oranges {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int s,t,a,b,m,n,i,apple,orange;apple=0;orange=0;
      //  System.out.println("Enter the value of s");
        s=ob.nextInt();
      //  System.out.println("Enter the value of t");
        t=ob.nextInt();
      //  System.out.println("Enter the value of a");
        a=ob.nextInt();
     //   System.out.println("Enter the value of b");
        b=ob.nextInt();
     //   System.out.println("Enter the value of m");
        m=ob.nextInt();
     //   System.out.println("Enter the value of n");
        n=ob.nextInt();
        int x[]= new int[m];
        int y[]= new int[n];
     //   System.out.println("ENTER THE ELEMENTS OF ARRAY FOR APPLE TREE");
        for(i=0;i<m;i++)
            x[i]=ob.nextInt();
        System.out.println("ENTER THE ELEMENTS OF ARRAY FOR ORANGE TREE");
        for(i=0;i<n;i++)
            y[i]=ob.nextInt();
        for(i=0;i<m;i++) {
            if ((x[i] >=(s - a)) && (x[i] > 0 )&& (x[i] <= (t - a)))
                apple++;
        }
        for(i=0;i<n;i++) {
            if (y[i]<0 && (Math.abs(y[i]) >= Math.abs(t - b)) && (Math.abs(y[i]) > 0 )&& (Math.abs(y[i]) <= Math.abs(s - b)))
                orange++;
        }
        System.out.println(apple);
        System.out.println(orange);



    }
}
