class PalStringB{
    public static void main(String[] args){
        String s="hello";
        StringBuilder m=new StringBuilder(s);
        m.reverse();
        String f=m.toString();
        if(s.equals(f)){
            System.out.println("pallindrome");
        }
        else{
            System.out.println("Not a pallindrome");
        }
    }
}
