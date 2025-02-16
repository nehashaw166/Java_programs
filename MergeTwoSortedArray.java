import java.util.Arrays;

public class MergeTwoSortedArray {
  
   
    public static void main(String[] args) {
        int[] a1 = {1,5,8};
        int[] a2 = {2,5,6,7,10,11};
        int length = a1.length + a2.length;
        int[] r= new int[length];
        int i=0; 
        int j=0;
        int k=0;
        while(i<a1.length && j<a2.length){
            if(a1[i]<a2[j]){
                r[k++]=a1[i++];
            } else{
                r[k++]=a2[j++];
            }
        }
        while (i<a1.length) {
            r[k++]=a1[i++];
        }
        while (j<a2.length) {
            r[k++]=a2[j++];
        }

        System.out.println("Array after merge"+Arrays.toString(r));
    }
    
}
