import java.util.Scanner;
public class armstrong{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        int temp=n,sum=0,digits=0;
        while(temp>0){
            digits++;
            temp=temp/10;
        }
        temp=n;
        while(temp>0){
            int digit=temp%10;
            sum+=Math.pow(digit,digits);
            temp=temp/10;
        }
        System.out.println("sum:"+sum);
        if(n==sum){
            System.out.println("It is armstrong!");
        }
        else{
            System.out.println("It is not armstrong.");
        }
    }
}
