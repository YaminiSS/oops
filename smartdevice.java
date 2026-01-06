public interface smartdevice
{
void turnOn();
void turnOff();
}

class smartlight implements smartdevice
{
public void turnOn()
{
System.out.println("Light ON");
}

public void turnOff()
{
System.out.println("Light OFF");
}
}

class main
{
public static void main(String args[])
{
smartlight s=new smartlight();
s.turnOn();
s.turnOff();
}
}

