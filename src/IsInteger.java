import java.util.*;
public class IsInteger {
    public static void main(String [] args ){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        boolean a=sc.hasNextInt();
        if(a==true){
            System.out.println("True: is an integer");
        }
        else{
            System.out.println("False: not an integer");
        }
    }
}
