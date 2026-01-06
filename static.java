class employee
{
static int count=0;
String name;

employee(String n)
{
name=n;
count++;
}

static void showCount()
{
System.out.println("Total Employees:"+count);
}
}

class main
{
public static void main(String args[])
{
employee e1=new employee("A");
employee e2=new employee("B");
employee.showCount();
}
}
