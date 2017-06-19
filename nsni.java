class Jp
{
int a;
Jp(int x)
{a=x;}
public static void main(String[]args)
{Jp obj=new Jp(69);
System.out.println("i know that the value of a is:"+obj.a+" and the address of object created is:"+obj.hashCode());}
}