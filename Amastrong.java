

public class Amastrong {
    public static void main(String[] args) {
        int no = 9474;
        int n1 =no;
        int temp= no;
        int c=0;
        int sum=0;
        while(temp>0){
            temp= temp/10;
            c=c+1;
        }
        System.out.println(c);
        while(no>0){
            sum+= Math.pow(no%10, c);
            no=no/10;  
        }
        if(sum==n1){
            System.out.println("Amastrong"); 
        }else{
            System.out.println(" Not Amastrong"); 
        }
    }
    
}
