

public class NumberOfCombination {

    public static double noOfCombination(int n, int needPersion){
        return factorial(n)/(factorial(needPersion)*factorial((n-needPersion)));
    }


    public static double factorial(int f){
        return f*factorial(f-1);
    }

    public static void main(String[] args) {

        int[] a = {1,3,5,6,20,10,4};
        int[] r = new int[a.length];

        for(int i=0; i<a.length-1;i++){
           if(a[i]<=5 && a[i]>=2) {
            r[i]=a[i];
           }
        }
        System.out.println("no of combination present :"+noOfCombination(r.length,3));

    }
    
}
