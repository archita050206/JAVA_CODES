import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class endOfLine {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int num=1;
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String str=sc.nextLine();
            System.out.println(num+" "+str);
            num++;
        }
        sc.close();
    }
}