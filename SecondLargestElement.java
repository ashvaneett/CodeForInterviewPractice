public class SecondLargestElement {

    private static int secLargestEff(int[] arr){
        int largest=Integer.MIN_VALUE,secLargestElement=Integer.MIN_VALUE;
        if(arr.length<=1){
            return arr[0];
        }
        if(arr[0]>=arr[1]){
            largest=arr[0];
            secLargestElement=arr[1];
        }
        else{
            largest=arr[1];
            secLargestElement=arr[0];
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]>largest){
                secLargestElement=largest;
                largest=arr[i];
            }
            else if(arr[i]>secLargestElement){
                secLargestElement=arr[i];
            }
        }
        return secLargestElement;
    }

    public static void main(String[] args) {
        int[] arr={5,20,12,20,10};
        System.out.println(secLargestEff(arr));
    }


    
}
