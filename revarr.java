import java.util.Scanner;
public class revarr{
    public static void main(String[] arr){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=s.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        System.out.println("Enter "+n+"Elements");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.println("Reverse of array");
        for(int i=n-1;i>=0;i--){
            System.out.print(a[i]+"\t");
        }
    }
}
