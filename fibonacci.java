

public class fibonacci {
  
    public static void main(String[] args) {
        int n= 5;
        int a=0; 
        int b= 1; 
        int c=1;
    
        for(int i=0; i<n;i++){
            System.out.print(a +",");
            a=b;
            b=c; 
            c=a+b;
        } 
    }
}
