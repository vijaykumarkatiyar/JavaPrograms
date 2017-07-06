class Check
{
  protected void m1()
  {
    System.out.println("this is m1 method of class check");
  }
}
class ModifierTest
{
  public static void main(String s[])
  {
    Check c1=new Check();
    c1.m1();

  }
}
