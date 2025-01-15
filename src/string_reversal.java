public class string_reversal {
    public static void main(String args[]){
        String A="archita";
        String B="";
        int length=A.length();
        for(int i=length-1;i>=0;i--){
            B+=A.charAt(i);
        }
        System.out.println(B);
    }
}
