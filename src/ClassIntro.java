
import java.util.*;
class Car{
    String name;
    int year;
    Car(String n, int a){
        name=n;
        year=a;

    }
    void display(){

        System.out.println("Car "+name+" manufactured in year "+year);
    }
}
public class ClassIntro {
    public static void main(String [] agrs){
        Scanner scc=new Scanner(System.in);
        String name=scc.nextLine();
        //scc.nextLine();
        int a=scc.nextInt();
        Car obj=new Car(name,a);
        obj.display();
    }
}
