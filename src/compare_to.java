import java.io.*;
import java.util.*;

public class compare_to {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int n1=A.length();
        int n2=B.length();
        int len=n1+n2;
        System.out.println(len);
        int d=A.compareTo(B);
        if(d>0)System.out.println("Yes");
        else System.out.println("No");
        A=A.substring(0,1).toUpperCase()+A.substring(1);
        B=B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(A+" "+B);
    }
}



