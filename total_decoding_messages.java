import java.util.Scanner;

public class total_decoding_messages {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int i, t, T, n, count = 0,j;
        String p;
        T = ob.nextInt();
        for (t = 1; t <= T; t++) {
            p = "";
            count = 0;
            n = ob.nextInt();
            String s[] = new String[n];
            for (i = 0; i < n; i++)
            {
                s[i] = ob.next();
                if((Integer.parseInt(s[i])+65)<=90 && (Integer.parseInt(s[i])+65)>=65 )
                    count++;
                p = p + s[i];
            }
           for(i=0;i<n;i++)
           {
               for(j=n-1;j>=0;j--)
               {
                 if((Integer.parseInt(p.substring(i,j+1))+65)<=90 && (Integer.parseInt(p.substring(i,j+1))+65)>=65 && (Integer.parseInt(p.substring(j+1))+65)>=65 && (Integer.parseInt(p.substring(j+1))+65)<=90)
                     count++;

               }
           }


        }
    }
}
