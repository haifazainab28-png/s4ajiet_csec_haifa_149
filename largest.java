import java.util.Scanner;
public class largest{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        int max=0;
        while(n>0){
            int dig=n%10;
            if(dig>max){
                max=dig;
            }
            n=n/10;
        }
        System.out.println("Max="+max);
    }
}
