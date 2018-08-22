import java.util.Scanner;
public class arr_rot {
    public static void main(String[] args)
    {
       int n,i,d;
        Scanner ob= new Scanner(System.in);
        System.out.println("Enter the size of array \n");
        n=ob.nextInt();
        System.out.println("Enter the location till which you want to rotate the array \n");
        d=ob.nextInt();
        int a[]=new int[n];
        int b[]=new int[d];
        //creating the array
        System.out.println("Enter the elements of the array");
        for(i=0;i<n;i++)
            a[i]=ob.nextInt();
        //rotating the array
        for(i=0;i<n;i++)
        {
            if(i<=d-1)
                b[i]=a[i];
            else
                a[i-d]=a[i];
        }
        //storing the auxiliary array elements in the main array
        for(i=0;i<d;i++)
            a[n-d+i]=b[i];
        //printing the rotated array
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");


    }
}
