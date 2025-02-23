

public class MinFlipRequired {
    
   public static int minFlip(String s){
    int flipCount = 0;
    char[] s2 = s.toCharArray();
    for(int i=0; i<s2.length-1;i=i+2){
        if(s2[i]!=s2[i+1]){
            flipCount+=1;
        }
    }

    return flipCount;  
   }
    public static void main(String[] args) {
        String s1 = "1001011";  

        System.out.println(minFlip(s1));
    }
    
}
