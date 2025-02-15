import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {4,8,2,9,3,6,7};
        int[] r = new int[a.length];
        int temp ;

        for(int i= 0; i<a.length; i++){
            for(int j= i; j<a.length; j++){
                if(a[i]>a[j]){
                    temp= a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    
                   
                }System.out.println("i : " +i + +a[i]+ "   "+"j :  "+j+   +a[j]+"   Array : "+Arrays.toString(a));
               
            }
        }
       // System.out.println(Arrays.toString(a));
       
    }
}
