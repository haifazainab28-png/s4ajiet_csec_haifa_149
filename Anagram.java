import java.util.Arrays;
class Anagram{
    public static void main(String[] args){
        String s1="listeN";
        String s2="silent";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char[] a1=s1.toCharArray();
        Arrays.sort(a1);
        s1= new String(a1);
        char[] a2=s2.toCharArray();
        Arrays.sort(a2);
        s2= new String(a2);
        if((s1.length())!=(s2.length())){
            System.out.println("Not an anagram");
        }
        else{
            if(s1.equals(s2)){
                System.out.println("It is an anagram");
            }
            else{
                System.out.println("Not an anagram");
            }
        }
    }
}
