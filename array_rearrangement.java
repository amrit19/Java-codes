import java.util.*;
public class array_rearrangement {
    public static void main(String[] args){
               int n,i,d=0,pivot,l,r;
                Scanner ob= new Scanner(System.in);
                System.out.println("Enter the size of array \n");
                n=ob.nextInt();
                int a[]= new int[n+1];
                //creating the array
                System.out.println("Enter the elements of the array");
                for(i=0;i<n;i++)
                    a[i]=ob.nextInt();
                a[n]=0;
                pivot=n;
                l=0;
                r=n-1;

                while(l<=r) {
                    if (a[l] < a[pivot])
                        l++;
                    else if (a[r] > a[pivot])
                        r--;
                    else {
                        d = a[l];
                        a[l] = a[r];
                        a[r] = d;
                    }

                }
                for(i=0;i<n;i++)
                    if(a[i]>0) {
                        d = i;
                        break;
                    }
                 l=1;r=d;
                while(l<d && r<n)
                {
                    pivot=a[l];
                    a[l]=a[r];
                    a[r]=pivot;
                    l=l+2;r++;
                }
                 for(i=0;i<n;i++)
                     System.out.print(a[i]+" ");


    }

}
