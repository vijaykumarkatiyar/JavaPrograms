class ArithmeticError
{
public static void main(String s[])
{
  int age=18;
  ArithmeticError a1=new ArithmeticError();
  System.out.println("before exception");
  a1.checkAge(age);
  System.out.println("there is no exception");

}
public void checkAge(int age)
{
  if(age<=18)
  {

    throw new NullPointerException("Invalid age for voting");
  }
}
}
