class Exception
{
 public static void main(String args[])
 {
  int a=10,b=0,c;
  try
  {
   c=a/b;
  }
  catch(ArithmeticException e)
  {
   System.out.println("Please do not divide a number with zero");
  }
 }
} 
  