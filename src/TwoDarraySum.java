import java.util.*;
public class TwoDarraySum {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int [][]arr1=new int [3][3];
        int [][]arr2=new int[3][3];
        int [][]ans=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int n=sc.nextInt();
                arr1[i][j]=n;

            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int n=sc.nextInt();
                arr2[i][j]=n;
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                ans[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println("");
        }

    }
}

