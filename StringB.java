class StringB{
    public static void main(String[] args){
        StringBuilder q=new StringBuilder();
        q.append("Hello");
        q.reverse();
        String f=q.toString();
        int l=q.length();
        System.out.println(q);
    }
}
