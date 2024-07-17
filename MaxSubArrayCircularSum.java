public class MaxSubArrayCircularSum {
    
    private static int kadane(int[] arr){
        int max_sum=Integer.MIN_VALUE;
        int curr_sum=0;
        max_sum=Math.max(max_sum,curr_sum);
        for(int i=0;i<arr.length;i++){
            curr_sum+=arr[i];
            max_sum=Math.max(max_sum,curr_sum);
            if(curr_sum<0){
                curr_sum=0;
            }
            
        }
        return max_sum;
    }

    private static int maxCircular(int[] arr){
        int maxNormal=kadane(arr);
        if(maxNormal<0){
            return maxNormal;
        }
        int sumOfArray=0;
        for(int i=0;i<arr.length;i++){
            sumOfArray+=arr[i];
            arr[i]=-arr[i];
        }
        int maxCircularSum=sumOfArray+kadane(arr);
        return Math.max(maxNormal, maxCircularSum);
    }

    public static void main(String[] args) {
        int[] arr={8,-4,3,-5,4};
        System.out.println(maxCircular(arr));
    }
    
}
