import java.io.*;
class Swap
{
  public static void main(String s[])
  {
    int a=3;
    int b=4;
    a=a+b;  //a=7
    b=a-b; //b=7-4=3
    a=a-b;//a=7-3=4
    System.out.println(a);
    System.out.println(b);
  }
}
