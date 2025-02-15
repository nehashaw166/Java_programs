import java.util.Arrays;

public class InsersionSort {
    public static void main(String[] args) {
       int [] a = {2,8,4,9,3,6 , 8, 9, 6, 12, 23, 47,6} ;
       int temp;
       //int f; 
       for(int i = 1; i<a.length; i++){
        System.out.println(i);
            for(int j=i-1;j>=0; j--){
                if(a[j+1]<a[j]){
                    temp= a[j];
                    a[j]= a[j+1];
                    a[j+1]=temp;
                }
            
       }
    }
       System.out.println(Arrays.toString(a));

    }
    
}

