class student
{
String name;
int rollno;
int marks;

void setDetails(String n,int r,int m)
{
name=n;
rollno=r;
marks=m;
}

void displayDetails()
{
System.out.println("Name:"+name);
System.out.println("Roll No:"+rollno);
System.out.println("Marks:"+marks);
}

void result()
{
if(marks>=40)
System.out.println("Result: Pass");
else
System.out.println("Result: Fail");
}
}

class main
{
public static void main(String args[])
{
student s=new student();
s.setDetails("Yams",10,75);
s.displayDetails();
s.result();
}
}
