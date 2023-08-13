class operators 
{

  public static void main(String args[]) 
  {
    // Relational operator
    // int a=10;
    // int b=10;
    // int c=20;
    // boolean result=a==b;
    // System.out.println(result);
    // System.out.println(a<b);
    // System.out.println(a>c);
    // System.out.println(a<=c);

    // Logic And Or operator

    // int a = 10;
    // int b = 20;
    // int c = 30;
    //
    // boolean result= a==b && a<b && a<c;
    // System.out.println(result);
    //
    // result= b<c && a<b && a<c;
    // System.out.println(result);

    // System.out.println(a != b);
    // System.out.println(a == b || b < c || b > c);
    // System.out.println(a == b || b > c || b > c);

    // int age = 16;
    // if(age>=18)
    // {
    // System.out.println("Legal adult");
    // }
    // else
    // {
    // System.out.println("Kid");
    // }

    // int age = 15;
    // if (age >= 18 && age < 60) {
    // System.out.println("You are an adult");
    // } else if (age >= 60) {
    // System.out.println("You are an old man");
    // } else {
    // System.out.println("You are a kid");
    // }

    int age = 63;
    if (age >= 18 && age <= 60) 
    {
      if (age > 20 && age < 30) {
        System.out.println("You're in 20's");
      } else if (age >= 30 && age <= 40) {
        System.out.println("You're in 30's");
      } else if (age > 40 && age <= 50) {
        System.out.println("You're in 40's");
      } else if (age > 50 && age <= 60) {
        System.out.println("You're in 50's");
      } else {
        System.out.println("You're a teen");
      }
    } 
    else if (age >= 60) 
    {
      System.out.println("You're an old man");
    } 
    else 
    {
      System.out.println("You're a kid");
    }
  }
}
