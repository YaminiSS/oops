class student
{
public String name;
private int marks;
protected String grade;

void setMarks(int m)
{
if(m>=0 && m<=100)
{
marks=m;
calculateGrade();
}
}

private void calculateGrade()
{
if(marks>=40)
grade="Pass";
else
grade="Fail";
}

String getGrade()
{
return grade;
}
}

class main
{
public static void main(String args[])
{
student s=new student();
s.name="Yamini";
s.setMarks(82);
System.out.println("Name:"+s.name);
System.out.println("Grade:"+s.getGrade());
}
}
