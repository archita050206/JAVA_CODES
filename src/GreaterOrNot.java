import java.util.*;
public class GreaterOrNot {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=50;
    int num=sc.nextInt();
    if(num>a){
        System.out.println("Number greater than 50");
    }
    else if(num==50){
        System.out.println("Number equal to 50");
    }
    else{
        System.out.println("Number less than 50");
    }
}
}
