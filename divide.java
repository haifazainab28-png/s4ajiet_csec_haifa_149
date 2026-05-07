import java.util.Scanner;
public class divide{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter 1st number:");
    int a=s.nextInt();
    System.out.println("Enter the 2nd number");
    int b=s.nextInt();
    int q=a/b;
    int r=a%b;
    System.out.println("Quotient="+q);
    System.out.println("Remainder="+r);
  }
}

  
