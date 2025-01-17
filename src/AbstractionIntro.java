import java.util.*;
abstract class Animal{
    Animal(){
        System.out.println("This is animal class");
    }
    abstract void sound();

};
class Dog extends Animal{
    Dog(){
        System.out.println("I am Dog class");
    }
    void sound(){
        System.out.println("I am a dog! Bow!");
    }
};
public class AbstractionIntro {
    public static void main(String args[]){
        Dog obj=new Dog();
        obj.sound();
        

    }
}
