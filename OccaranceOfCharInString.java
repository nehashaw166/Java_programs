import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OccaranceOfCharInString{
  
    public static void main(String[] args) {
    String s= "neha shaw";  
    Set<Character> uniqueItem = new HashSet<>();
    int counter = 0;
    String s1= s.replaceAll("\\s", "").toLowerCase();
    char[] s2= s1.toCharArray();
    for(int i= 0; i<s2.length; i++){
        uniqueItem.add(s2[i]);
    }

    for (char u : uniqueItem) {
        counter=0;
        for(int i= 0; i<s2.length; i++){
        if(u==s2[i]){
            counter += 1;
        }
    }
    System.err.println("found "+ u + " "+counter +" "+ "timess");
 }  
}
}