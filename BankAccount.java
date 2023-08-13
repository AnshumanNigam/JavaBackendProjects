package JAVA2;

public class BankAccount {
    private int account_number;
    private String account_holder_name;
    private double account_balance;

    public void Intilization(int account_number, String account_holder_name, double account_balance)
    {
        this.account_number=account_number;
        this.account_holder_name=account_holder_name;
        this.account_balance=account_balance;
    }
    public void Deposit(double amount)
    {
        account_balance=account_balance+amount;
    }

    public void Withdraw(double amount)
    {
        if(amount<=account_balance)
        {
            account_balance=account_balance-amount;
        }
    }
    public void Display()
    {
        System.out.println("Account Number--->"+account_number);
        System.out.println("Account Holder Name--->"+account_holder_name);
        System.out.println("Account Balance--->"+account_balance);
    }
    public static void main(String args[])
    {
        BankAccount account=new BankAccount();
        account.Intilization(472133445,"Anshuman",50000.0);
        account.Deposit(3400);
        account.Withdraw(4300);
        account.Display();
    }


}
