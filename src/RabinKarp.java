import java.util.Scanner;

public class RabinKarp{
    static final int d=256;
    static final int q=10;
    static void stringMatch(String t, String p){
        int n=t.length();
        int m=p.length();
        int ht=0,hp=0,h=1;boolean match=false;
        for(int i=0;i<m-1;i++){
            h=(h*d)%q;
        }
        for(int i=0;i<m;i++){
            ht=(d*ht+t.charAt(i))%q;// hash value for first 3 char of text
            hp=(d*hp+p.charAt(i))%q;// hash value of the substring consisting of 3 characters
        }
        for(int i=0;i<=n-m;i++){
            if(ht==hp){
                match=true;
                for(int j=0;j<m;j++){
                    if(t.charAt(i+j)!=p.charAt(j)){
                        match=false;
                        break;
                    }
                }
                    if(match){
                        System.out.println("Match found!");
                    }
                }
                    if(i<n-m){
                        ht=(d*(ht-t.charAt(i)*h)+t.charAt(i+m))%q;
                        if(ht<0){
                            ht+=q;
                        }
                    
                
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String pattern=sc.nextLine();
        stringMatch(text,pattern);
        sc.close();
    }
}