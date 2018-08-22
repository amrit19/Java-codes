public class bank_account {
  public  int acc_no; String name; double balance; long ph_no; String mail;

    public  int getAcc_no() {
        return acc_no;
    }

    public  void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public  String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public  void setBalance(double balance) {
        this.balance = balance;
    }

    public long getPh_no() {
        return ph_no;
    }

    public void setPh_no(long ph_no) {
        this.ph_no = ph_no;
    }

    public  String getMail() {
        return mail;
    }

    public  void setMail(String mail) {
        this.mail = mail;
    }

    public  void Deposit(double a) {


        balance = balance + a;
        System.out.println("balance is =" + balance);
    }
    public void Withdraw(double a)
    {
        if((balance-a)>=0)
        balance=balance-a;
        System.out.println("balance is =" + balance);
    }

    public static void main(String[] args) {
        bank_account ob=new bank_account();
        ob.setAcc_no(12343231);
        ob.setName("Amrit");
        ob.setBalance(49000);
        ob.setPh_no(94388);
        ob.setMail("amritpuhan07@gmail.com");
        ob.Deposit(3421);
        ob.Withdraw(9000);


    }
}
