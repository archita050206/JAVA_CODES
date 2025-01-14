import java.util.*;
public class predict {
    public static void main(String args[]){
    int key=(int)(Math.random()*100)+1;
    boolean b=true;
    while(b){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x>key){
            System.out.println("Value is greater than the key ");
        }
        else if(x<key){
            System.out.println("Value is lesser than the key");
        }
        else{
            System.out.println("Eureka ! you won!");
            b=false;
        }
    }
}
}
