import java.util.Arrays;

public class TranformationRequired {

    private static  void ptintTransformedElement(int[] arr, int n) {
        for(int i= 0; i<n; i++){
            for(int j= 0; j<arr.length; j++){
                if(arr[j]%2!=0){
                    arr[j]=arr[j]+3;
                }else{
                    arr[j]=arr[j]-3;
                }
            }
            
        }
        System.err.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int n = 1;
        int[] arr = {3,0,0,0,3,3};
        ptintTransformedElement(arr,n);
        System.out.println(arr.length);

        }
         
}
