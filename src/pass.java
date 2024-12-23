import java.util.*;
public class pass {
    public static void main(String [] args){
        float phy,chem,maths;
        Scanner sc=new Scanner(System.in);
        System.out.println("Physics: ");
        phy=sc.nextFloat();
        sc.nextLine();
        System.out.println("Chemistry: ");
        chem=sc.nextFloat();
        sc.nextLine();
        System.out.println("Maths: ");
        maths=sc.nextFloat();
        sc.nextLine();
        if(phy<33.0 || chem<33.0 || maths<33.0){
            System.out.println("Failed");
        }
        else{
            float sum=(phy+chem+maths)/3.0f;
            if(sum>=40){
                System.out.println("Passed");
            }
            else{
                System.out.println("Failed");
            }
        }
    }
}
