import java.util.Scanner;

public class arrays_Ds {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n,i;
        n=ob.nextInt();
        int a[] = new int[n];
        for(i=0;i<n;i++)
        a[i]=ob.nextInt();
        for(i=n-1;i>=0;i--)
            System.out.print(a[i]+" ");

    }
}
