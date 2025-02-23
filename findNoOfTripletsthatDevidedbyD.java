

public class findNoOfTripletsthatDevidedbyD {

    public static int findNoOfTripletsthatDevidedbyD(int[] arr,int d ){
        int count=0;
        for(int i=0; i<arr.length-2;i++){
            for(int j=i+1; j<arr.length-1;j++){
                for(int k=j+1; k<arr.length;k++){
                if (((arr[i]+arr[j]+arr[k])%d==0)){
                    count+=1;                       
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {3,3,4,7,8};
        int d=5;
        int result= findNoOfTripletsthatDevidedbyD(a,d);
        System.out.println(result);

        
    }
    
}
