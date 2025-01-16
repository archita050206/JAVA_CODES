import java.util.*;
public class CurrencyConverter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the currency: usd, euro, yen, wan to convert to inr: ");
        String curr=sc.next();
        System.out.print("Enter value: ");
        double val=sc.nextDouble();
        if(curr.equals("usd")){
            System.out.println("Value in inr is: "+String.format("%.2f",(86.61 * val)));
        }
        else if(curr.equals("euro")){
            System.out.println("Value in inr is: "+String.format("%.2f",(89.21 * val)));
        }
        else if(curr.equals("yen")){
            System.out.println("Value in inr is: "+String.format("%.2f",(0.56 * val)));
        }
        else if(curr.equals("wan")){
            System.out.println("Value in inr is: "+String.format("%.2f",(0.059 * val)));
        }

    }
}
