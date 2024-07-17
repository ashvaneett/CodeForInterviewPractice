import java.util.Arrays;

public class MoveAllZerosToEnd {

    private static int[] moveZeros(int[] arr){
        int ind=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                ind+=1;
                int temp=arr[i];
                arr[i]=arr[ind];
                arr[ind]=temp;

            }
        }
        return arr;

    }

    public static void main(String[] args) {

        int[] arr={0,0,10,0,0,10,0};
        int[] arr2=moveZeros(arr);
        for(int i:arr2){
            System.out.print(i+" ");
        }
        //Arrays.asList(moveZeros(arr)).stream().forEach(System.out::println);        
    }
    
}
