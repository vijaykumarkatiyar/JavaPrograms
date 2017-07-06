class InterfaceTest implements  i1,i2//multiple inheritance
{
  public void m1()
  {
    System.out.println("m1 is overide method of interface i1");
    System.out.println("value of i"+i1.i);
    System.out.println("value of i"+i2.i);
  }
  public static void main (String s[])
  {
    InterfaceTest t1=new InterfaceTest();
    t1.m1();
    System.out.println("sucessfully implemented");
}
  }
