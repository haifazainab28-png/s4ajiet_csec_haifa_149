import java.util.Scanner;
public class rank{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Number of Visiting N in their first line");
        int n=s.nextInt();
        int i=0,cut=0,reg=0;
        int rank[]=new int[n];
        System.out.println("N space separated ranks the HOD gets each time:");
        for(i=0;i<n;i++){
            rank[i]=s.nextInt();
        }
        for(i=1;i<n;i++){
            if(rank[i]<rank[i-1]){
                cut=cut+1;
                if(reg>rank[i]){
                    reg=rank[i];
                }
            }
        }
        System.out.println("Number of ranks cut in the list:"+cut);
    }
}
