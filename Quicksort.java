import java.util.*;
public class Quicksort {
    public static void main(String[] args) {
        int[] arr={5,9,1,0,7,4,8,3,2,6};
        quickSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr,int n){
        partition(0,n-1,arr);
    }
    public static void partition(int start,int end,int[] arr){
        if(start<end){
            int pivot=start;
            int left=start+1;
            int right=end;
            while(left<right){
                while(left<=end && arr[left]<arr[pivot]) left++;
                while(right>=start && arr[right]>arr[pivot]) right--;
                if(left<right){
                    swap(left,right,arr);
                }
            }
            swap(pivot,right,arr);
            partition(start, right-1, arr);
            partition(right+1,end,arr);
        }
        
    }
    public static void swap(int i,int j,int[] arr){
        int v1=arr[i];
        int v2=arr[j];
        arr[j]=v1;
        arr[i]=v2;
    }
}
