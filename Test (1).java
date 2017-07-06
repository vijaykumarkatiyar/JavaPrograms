import  java.io.*;
class Test   //class Test is declared
{
  static int val; //this is a static variable    all instance(object) used the same copy of the variable
  public static void main(String s[])   //this is main method  main method is called by the JVM when program started execution--- after invoking the main method test class loaded into the memory  at method area by the classloader and the static variable created in the class test
  {
    val = Integer.parseInt(s[0]);//it takes the value from command line and set static variable val
    boolean result=Armstrong.check();// it calls the check method(boolean type) from class Armstrong-- static method call by the classname followed by method name we did not create object or instance to call static method-- after that it store the value in boolean result
    if(result)  // check whether result is true or false
    {
      System.out.println(val+"is armstrong");
    }
    else
    {
      System.out.println(val+"is not armstrong");
    }
  }

static class Armstrong //child class of test and is defined static
{
  static Boolean check()
  {
    int temp=Test.val; // static variable always be access in the class name with the .(dot) operator. they are declared without the need of creating a  object(instance)  normally we made object with the class name and then we access the method or data members.
    int sum=0;
    int a;
    while(temp > 0)
     {
       a=temp%10;
       sum=sum+a*a*a;
       temp=temp/10;
      }
    if(sum==Test.val)
      {
        return true;
       }
  else
        {
          return false;
         }
  }
}
}
