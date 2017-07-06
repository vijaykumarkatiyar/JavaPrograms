import java.io.*;
class Demo
{
static  int a=11;
 public static void main(String s[])
 {
  Demo obj=new Demo();
  Demo obj1=new Demo();
  Demo obj2=new Demo();
  Demo obj3=new Demo();
  obj.a=12;
  obj1.a=13;
  obj2.a=200;
  obj3.a=100;
   System.out.println(obj.a);
   System.out.println(obj1.a);
   System.out.println(obj2.a);
   System.out.println(obj3.a);
  }
}
