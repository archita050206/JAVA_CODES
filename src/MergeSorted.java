public class MergeSorted {
    public static void main(String args[]){
        int arr1[]={1,3,5};
        int arr2[]={2,4,6};
        
        int l1=arr1.length;
        int l2=arr2.length;
        int arr[]=new int[l1+l2];
        int i=0;
        int j=0;
        int k=0;
        while(i<l1 && j<l2){
            if(arr1[i]<=arr2[j]){
                arr[k++]=arr1[i++];
            }
            else{
                arr[k++]=arr2[j++];
            }
        }
        while(i<l1){
            arr[k++]=arr1[i++];
        }
        while(j<l2){
            arr[k++]=arr2[j++];
        }
        for(int v=0;v<k;v++){
            System.out.println(arr[v]+" ");
        }
    } 
}
