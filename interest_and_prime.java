public class interest_and_prime {
    public static void CalculateInterest( int principle,int r)
    {
        double a;
        a=principle*r/100;
        System.out.println("Amount is = "+a);
    }
    public static int iSPrime(int p)
    {
        int i,c=0,d=0;
        for(i=1;i<=p;i++)
            if(p%i==0)
                c++;
        if(c==2) {
            System.out.println("the prime no is = " + p);
            return 1;
        }
        else
            return 0;
    }

    public static void main(String[] args) {
        int i,j,c=0;
        for(i=2;i<=8;i++)
            CalculateInterest(10000,i);
        for(i=8;i>=2;i--)
            CalculateInterest(10000,i);
        for(i=1;i<=50;i++) {
            j = iSPrime(i);
            if (j == 1)
                c++;
        }
        System.out.println("no of prime numbers are = "+c);

    }
}
