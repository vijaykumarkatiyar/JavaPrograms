import java.io.*;
class Student
{          
  String name;
  int rollno,marks;
  Student(String nm,int rno,int marks)
  {
    name =nm;
    rollno=rno;
    marks=marks;
  }
public static void main(String s[])
{
  Student st=new Student("vijay",01,50);
  System.out.println(st);
}
}
