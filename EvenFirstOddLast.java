public class EvenFirstOddLast {

    public static void main(String[] args) {
        int[] a = {2,3,2,6,9,8,4,7};
        int lastIndex = a.length-1;
        int evenIndex = 0;
        int[] r = new int[a.length];

        for(int i= 0; i<a.length; i++){
            if(a[i]%2==0){
                r[evenIndex++]=a[i];
            }else{
                r[lastIndex--]=a[i];
            }
        }
        for(int i= 0; i<a.length; i++){
            System.out.print(r[i]);
        }
       
    }
}