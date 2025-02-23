

public class Gcd {
    public static void main(String[] args) {
        int n1= 10;
        int n2 = 45;
        int gt;
        int sm;
    
        if(n1>n2){
             gt=n1;
             sm=n2;
         }else{
             gt=n2;
             sm =n1;
            }
        // int gdc = findGcd(gt, sm);
         System.out.println(findGcd(gt, sm));
        }
    
        private static int findGcd(int gt, int sm) {
            return ((sm==0) ? gt :findGcd(sm, gt%sm));
        }

}
