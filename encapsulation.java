class bankaccount
{
private int balance;

void deposit(int amt)
{
if(amt>0)
balance=balance+amt;
}

void withdraw(int amt)
{
if(amt<=balance)
balance=balance-amt;
else
System.out.println("Insufficient balance");
}

int getBalance()
{
return balance;
}
}

class main
{
public static void main(String args[])
{
bankaccount b=new bankaccount();
b.deposit(1000);
b.withdraw(300);
System.out.println("Balance:"+b.getBalance());
}
}
