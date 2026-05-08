import java.util.Scanner;
public class candy{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("N:");
        int n=s.nextInt();
        int total=n;
        int sold=0;;
        System.out.println("k:");
        int k=s.nextInt();
        System.out.println("number candies customer ordered:");
        int c=s.nextInt();
        if(c<total){
            sold=c;
            total=total-c;
            if(total<k){
                total=n;
            }
            System.out.println("Number of Candies Sold:"+sold);
         System.out.println("Number of Candies available"+total);
        }
        else{
            System.out.println("Invalid input");
        }
        
    }
}
