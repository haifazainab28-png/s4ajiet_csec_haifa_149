public class revstr{
    public static void main(String[] args){
        String a="Hello";
        char[] d=a.toCharArray();
        System.out.println("Reverse is");
        int n=a.length();
        for(int i=n-1;i>=0;i--){
            System.out.print(d[i]);
        }
    }
}
