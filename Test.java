import  java.io.*;
class Test
{
  static int val;
  public static void main(String s[])
  {
    val = Integer.parseInt(s[0]);
    boolean result=check();
    if(result)
    {
      System.out.println(val+"is armstrong");
    }
    else
    {
      System.out.println(val+"is not armstrong");
    }
  }
  static Boolean check()
  {
    int temp=val;
    int sum=0;
    int a;
    while(temp > 0)
     {
       a=temp%10;
       sum=sum+a*a*a;
       temp=temp/10;
      }
    if(sum==val)
      {
        return true;
       }
  else
        {
          return false;
         }
  }
}
