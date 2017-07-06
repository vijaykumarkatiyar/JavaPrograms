abstract class Parent1//because it contain one method abstract
{
abstract  void m1();
void m2()
{
System.out.println("m2 in abstarct class Parent1 ");
}
}
class Child1 extends Parent1
{
void m1()
{
System.out.println("child1");
}
}
class AbstractTest
{
public static void main(String s[])
{
Child1 c1=new Child1();
c1.m1();
c1.m2();
}
}
