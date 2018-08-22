import java.util.*;
public class Merge_Sort
{
    int a[]={9,8,7,6,5,4,3,2,1,0};
    int low=0,high=0;
    public static void main(String[] args)
    {
        mergesort (low,high);
    }

    public static void mergesort(int low,int high) {
        int mid;
        if (low < high) {
            mid = (low + high) / 2;
            mergesort(low, mid);
            mergesort(mid + 1, high);
            merge(low, high);
        }
    }
    public static void merge(int low,int high)
    {   int b[]=new int[10];
        int x=low,y=mid+1,i=low;
                while(x<=mid && y<=high)
                {
                    if(a[x]>a[y]) {
                        b[i] = a[x];
                        x = x + 1;
                    }
                    else {
                        b[i] = a[y];
                        y = y + 1;
                    }
                    if(x>mid)

                }
    }
}
