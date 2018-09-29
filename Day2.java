import java.util.Scanner;
class Day2
{ //scope
  public static void main(String [] args) //main method
  {
    String s ="Hi"; //= is assignment 
    System.out.println(s); //System is a class that grants acess to the system
    System.out.println("");
    System.out.println("");
    
    String j ="    J    A   V     V    A";
    String a ="J   J   A A   V   V    A A";
    String v ="JJJJJ  AAAAA   V V    AAAAA";
    String A =" JJJ  A     A   V    A     A";
      System.out.println(j);
      System.out.println(a);
      System.out.println(v);
      System.out.println(A);
      System.out.println("");
      System.out.println("");
      
int x = 10;
int y = 5;
    
  System.out.println("The value of x is:" + (x));
  
  System.out.println("The value of y is:" +(y));

  System.out.println("The value of x+y is:" + (x+y));

  System.out.println("The value of x-y is:" + (x-y));

  System.out.println("The value of x*y is:" +(x*y));
 
  System.out.println("The value of x/y is:");
  System.out.println(x/y);
  System.out.println("");
  System.out.println("");

    
    try{
      int c = 10;
      int d = 0;
      int div = c  /  d; 
      System.out.println(div);
      System.out.println("");
      System.out.println("");
     
     }
    catch(Exception e){
      System.out.println("You can't do this");
       System.out.println("");
       System.out.println("");
}
  
   Scanner input = new Scanner(System.in);
   System.out.println("enter the first number");
   int n1=input.nextInt();
   System.out.println("enter the second number");
   int n2=input.nextInt();
   System.out.println("This is a calculator!");
   System.out.println("The sum of your numbers is: "+ (n1+n2));
   System.out.println("The difference of your numbers is: " + (n1-n2));
   System.out.println("The product of your numbers is: " + (n1*n2));
   System.out.println("The quotient of your numbers is: " + (n1/n2));
  
 
    
  }
}