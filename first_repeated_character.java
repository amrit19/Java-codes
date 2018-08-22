import java.util.Scanner;

public class first_repeated_character {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int t,T,i,j,n,low,high,mid,f;
        String s;
         T=ob.nextInt();
         char ch;

        for(t=1;t<=T;t++)
        {
            s=ob.next();
            low=0;high=s.length();
            f=0;
            for(i=0;i<s.length();i++)
            {
                ch=s.charAt(i);
                for(j=i+1;j<s.length();j++)
                    if(s.charAt(j)==ch)
                    {
                        System.out.println(ch);
                        f=1;break;
                    }
                    if(f==1)
                        break;

            }
            if(f==0)
                System.out.println(-1);
        }
    }
}
