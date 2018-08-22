import java.util.Scanner;

public class intro_to_tutorial_challenges {
    public static void main(String[] args) {
        int V,n,i;
        Scanner ob = new Scanner(System.in);
        V=ob.nextInt();
        n=ob.nextInt();
        int a[]= new int[n];
        for(i=0;i<n;i++)
            a[i]=ob.nextInt();
        for(i=0;i<n;i++)
            if(a[i]==V)
            { System.out.println(i);break;}

    }
}
