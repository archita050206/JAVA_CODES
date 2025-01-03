import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
class LL{
    Node head;
    public void insert(int val){
        Node n=new Node(val);
        if(head==null){
            head=n;
            return;
        }
        else{
            Node t=head;
            while(t.next!=null){
                t=t.next;
            }
            t.next=n;
        }
    }
    public void display(){
        Node t=head;
        while(t!=null){
            System.out.print(t.data+"->");
            t=t.next;
        }
    }
}
public class linkedList {
    public static void main(String[] agrs){
        LL obj=new LL();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of values: ");
        int num=sc.nextInt();
        int arr[];
        for(int i=0;i<num;i++){
            int v=sc.nextInt();
            obj.insert(v);
        }
        obj.display();
    }
}
