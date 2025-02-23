import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {
        int [] a= {2,5,9,6};
        for(int i=1; i<a.length;i++){
            for(int j=i;j>0;j--){
                if(a[j]<a[j-1]){
                    int temp = a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    } 
    
}
