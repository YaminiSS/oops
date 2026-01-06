public abstract class shape
{
abstract void calculatearea();
abstract void display();
}

class circle extends shape
{
double r=5;

void calculatearea()
{
System.out.println("Area of circle is: "+(3.14*r*r));
}

void display()
{
System.out.println("this is circle");
}
}

class rectangle extends shape
{
int l=4,b=6;

void calculatearea()
{
System.out.println("Area of rectangle is: "+(l*b));
}

void display()
{
System.out.println("this is rectangle");
}
}

class main
{
public static void main(String args[])
{
shape s;

s=new circle();
s.calculatearea();
s.display();

s=new rectangle();
s.calculatearea();
s.display();
}
}
 