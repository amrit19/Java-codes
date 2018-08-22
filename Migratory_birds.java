import java.util.Scanner;

public class Migratory_birds{
    public static void main(String[] args) {
        int n,i,c=0,k,j,type=0,typefinal=0,max=0;
        Scanner ob= new Scanner(System.in);
        System.out.println("enter");
        n=ob.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
            arr[i]=ob.nextInt();
        for(i=0;i<n;i++)
        {
            k=arr[i];
            c=0;
            for(j=0;j<n;j++)
            {
                if(arr[i]==arr[j]) {
                    c++;
                    type = arr[i];
                }

            }
            if(c>max)
            {
                max=c;typefinal=type;
            }
        }
        System.out.println(typefinal);
    }
}
