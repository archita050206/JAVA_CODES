import java.util.*;
public class ReplaceWith_ {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Original word is: "+str);
        String ans=str.replace(' ','_');
        System.out.println("Final word is: "+ans);
    }
}
