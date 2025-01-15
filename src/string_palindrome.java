import java.util.*;
public class string_palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int length=str.length();
        boolean flag=true;
        for(int i=0;i<length/2;i++){
            if(str.charAt(i)!=str.charAt(length-i-1)){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("Palindrome");
        }
        else System.out.println("Not Palindrome");
    }
}
