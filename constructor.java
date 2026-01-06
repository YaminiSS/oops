class bankaccount
{
int accno;
int balance;

bankaccount(int a,int b)
{
accno=a;
balance=b;
}

void display()
{
System.out.println("Account:"+accno);
System.out.println("Balance:"+balance);
}
}

class main
{
public static void main(String args[])
{
bankaccount b=new bankaccount(101,5000);
b.display();
}
}

