class sup
{
int a;

void show()
{
System.out.println(a);
}
}


class sub extends sup
{

void show()
{
System.out.println(a);
}
}

class My
{
public static void main(String args[])
{
sub sb=new sub();
sb.a=10;
sb.show();
}
}