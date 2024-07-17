package BinarySearch;

public class BinarySearch {

    private static int binSearch(int[] arr, int target){
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr={10,20,30,45,68,71,95};
        int target=95;
        System.out.println(binSearch(arr, target));
        
    }
    
}
