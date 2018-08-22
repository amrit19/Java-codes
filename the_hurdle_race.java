import java.util.Scanner;

public class the_hurdle_race {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n,i,k,max=0,f=0;
        n=ob.nextInt();
        k=ob.nextInt();
        int a[]= new int[10];
        for(i=0;i<n;i++) {
            a[i] = ob.nextInt();
            if (a[i] > max) {
                f = 1;
                max = a[i];
            }
        }            if (max>k)
                System.out.println((max - k));
            else
                System.out.println(0);


        }
}
