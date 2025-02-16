import java.util.Arrays;

public class Anargom {
    public static void main(String[] args) {
        String s1= "silent";
        String s2 = "listen";
        s1=s1.replaceAll("\\s", "".toLowerCase());
        s2=s2.replaceAll("\\s", "".toLowerCase());
        char[] ch1 =s1.toCharArray() ;
        char[] ch2 =s2.toCharArray() ;
        bubbleSort(ch1);
        bubbleSort(ch2);
        System.out.print("heloo"+  Arrays.equals(ch1, ch2));    
    }
    public static char[] bubbleSort(char[] ch1){
        char temp;
        for(int i=0; i<ch1.length-1; i++ ){
            for(int j=i+1;j<ch1.length; j++){
                if(((int)ch1[i])>((int)ch1[j])){
                    temp = ch1[i];
                    ch1[i]=ch1[j];
                    ch1[j]=temp;
                } 
            }
        }
        System.out.println(Arrays.toString(ch1));
        return ch1;
    }  
}
