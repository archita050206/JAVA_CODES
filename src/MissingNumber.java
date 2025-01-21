import java.util.Scanner;
public class MissingNumber {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int range=sc.nextInt();
    int arr[]=new int[range];
    for(int i=0;i<range;i++){
        int x=sc.nextInt();
        arr[i]=x;
    }
    boolean b=false;
    for(int j=0;j<range;j++){
        if(arr[j]!=j+1){
            b=true;
            System.out.println(j+1);
            break;
        }
    }
    if(!b)System.out.println("No missing element");
    
    sc.close();
}
}
