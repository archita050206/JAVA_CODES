import java.util.*;
public class TempConcerter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Temperature in F or C");
        String s=sc.nextLine();
        char c=s.charAt(0);
        if(c=='C'){
            System.out.println("Enter temperatue in Celcius: ");
            double temp=sc.nextDouble();
            double conv=((temp-32)*5)/9;
            System.out.println("Temperature in Celcius is: "+String.format("%.2f",conv));
            
        }
        else{
            System.out.println("Enter temperatue in Fahrenheit: ");
            double temp=sc.nextDouble();
            double conv=(5*c)/9 +32;
            System.out.println("Temperature in Fahrenheit is: "+String.format("%.2fc",conv));
        }
    }
}
