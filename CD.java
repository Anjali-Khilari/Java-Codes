class ConstDemo
{
int a;
ConstDemo(int a)
{
this.a=a;
}

ConstDemo(ConstDemo cd1)
{
this.a=cd1.a;
}


public void show()
{
System.out.println("a="+a);
}
}

public class CD{
public static void main(String args[])
{
ConstDemo cd=new ConstDemo(10);
cd.show();
ConstDemo cd1=new ConstDemo(cd);
cd1.show();
}
}