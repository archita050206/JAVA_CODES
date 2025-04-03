import java.util.*;
public class BoardExam {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Physics: ");
        float phy=sc.nextFloat();
        sc.nextLine();
        System.out.println("Chemistry: ");
        float chem=sc.nextFloat();
        sc.nextLine();
        System.out.println("Biology: ");
        float bio=sc.nextFloat();
        sc.nextLine();
        System.out.println("Mathematics: ");
        float maths=sc.nextFloat();
        sc.nextLine();
        float sum=(phy+chem+bio+maths)/4.0f;
        System.out.println("Percentage is: "+sum+"%");
        sc.close();
    }
}
