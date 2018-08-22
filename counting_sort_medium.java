import java.util.Scanner;

public class counting_sort_medium {
    public static void main(String[] args) {
        //elements for original work
        int n,i,j,k;
        String ts=""; //for adjusting string positions according to requirements
        Scanner ob = new Scanner(System.in);
        n=ob.nextInt();
        int x[]=new int[n];
        String s[]=new String[n];

        //additional array for counting sort and its counter variable
        int y[]=new int[n];
        int yc=0;
        ///////////////////////////////////////////////////////////////
        for(i=0;i<n;i++)
        {
            x[i]=ob.nextInt();
            s[i]=ob.nextLine();
        }
        int c[]=new int[101];
        for(i=0;i<n;i++)
        {
            c[x[i]]=c[x[i]]+1;

        }
        /////////////////////////////////counting sort/////////////////////////////
        for(i=0;i<101;i++)
        {
            if(c[i]!=0) {
                y[yc] = i;
                yc++;
            }

        }

        ///////////////////////////////////////////////////////////////////////////

        ////////////////////////////final algorithm////////////////////////////////
        for(i=0;i<yc;i++)//loop for sorted array
        {
            for(j=0;j<n;j++)//loop for original numerical array
            {
                if(y[i]==x[j])//checking original array element that matches with sorted array
                {
                    if(j<(n+1)/2)//if element no is less than mid so that i can replace with -
                    {
                        // for(k=0;k<s[j].length();k++) // calculating no of characters in string
                        //{
                        System.out.print(" -");//printing -- if element is less than half
                        //}
                        //System.out.print(" ");
                    }
                    else
                        System.out.print(s[j]); // printing the string if element is more than half

                }
            }
        }

    }
}
