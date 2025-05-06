abstract class Demo
{
abstract void show();
}

class Demo1 extends Demo
{

void show()
{
System.out.println("This is abstract demo");
}
}


class Ab 
{

public static void main(String args[])
{
Demo1 d=new Demo1();

d.show();
}}