import java.util.*;
class Main{
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,7,8,9,12,14,16,18,19,23,25,26};
        System.out.println(Search(arr,0,arr.length-1,29));
    }
    public static int Search(int[] arr,int low,int high,int val){
        if(low>high) return -1;
        if(low==high && arr[low]==val) return low;
        int mid=(low+high)/2;
        if(arr[mid]==val) return mid;
        if(val<arr[mid] ) return Search(arr,low,mid-1,val);
        if(val>arr[mid] ) return Search(arr,mid+1,high,val);
        return -1;
    }
}