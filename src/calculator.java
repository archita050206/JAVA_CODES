import java.util.*;
class Operations{
    public int sum(int a,int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multi(int a, int b){
        return a*b;
    }
    public int divide(int a,int b){
        if(b==0){
            System.out.println("Division by 0: error");
            return -1;
        }
        return a/b;
    }
};
public class calculator {
    public static void main(String args[]){
        Boolean b=true;
        while(b){
            
            Operations obj=new Operations();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the operation: ");
            String str=sc.nextLine();
            if(str.equals("exit"))System.exit(0);
            System.out.println("Enter the two numbers: ");
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            
            switch(str){
                case "+": int x=obj.sum(n1,n2);
                System.out.println("Sum: "+x);
                break;
                case "-": int y=obj.subtract(n1,n2);
                System.out.println("Difference: "+y);
                break;
                case "*": int z=obj.multi(n1,n2);
                System.out.println("Product: "+z);
                break;
                case "/": int a=obj.divide(n1,n2);
                System.out.println("Division: "+a);
                break;
                default:
                System.out.println("Error: Choose a valid operation");
                
                break;
            }
            sc.close();

        }
    }
}
