import java.util.*;
public class Fibonnaci {
    public static void main(String args[]){
        System.out.println("Enter the limit: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int start=0;
        int second=1;
        for(int i=0;i<n;i++){
            System.out.print(second+" ");
            int t=start;
            start=second;
            second=second+t;

        }
    }
}
