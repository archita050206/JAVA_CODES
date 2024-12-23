import java.util.*;
public class cgpa_of_three {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of subject with credit 4: ");
        int a=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter marks of subject with credit 3: ");
        int b=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter marks of subject with credit 2: ");
        int c=sc.nextInt();
        sc.nextLine();
        double cgpa=((10*4)+(10*3)+(10*2))/9.0;
        System.out.println("cgpa: "+cgpa);
    }
}
