implicit conversion --- there is no chance for loosing the precision of value during this conversion it will be the implicit conversion
an implicit conversion is where the conversion happens without any syntax
byte->short->int->long->float->double (known as widening)
//int  x='a';
int i=99999;
float f=i; //implicit conversion

example coding //no casting is needed for below example
byte i=50;
short j=i;
int k=j;
long l=k;
float m=l;
double n=m;

explicit conversion ---if there is any chance for loosing precision of value during the conversion then it will be considered as the explicit conversion.
A programmer have to specify the extra statement for the explicit conversion.
double->float->long->int->short->byte(known as narrowing)

short st=65;  //there is chance for loosing precision
char ch=st;
example //explicit casting is needed for below conversion
double d=65.0;
float f=(float) d;
long l=(long)f;
int i=(int) l;
short s=(short) i;
byte b=(byte) s;

this keyword
access specifier
final keyword
to Strings
string handling

import java.io.*;
class Student
{
  String name;
  int rollno,marks;
  public String toString()
  {
    return(name+"    "+rollno+"    "+marks);
  }
  Student(String nm,int rno,int marks)
  {
    name =nm;
    rollno=rno;
    this.marks=marks;
  }
public static void main(String s[])
{
  Student st=new Student("vijay",01,50);
  System.out.println(st);
  System.out.println(st.toString());
}
}
