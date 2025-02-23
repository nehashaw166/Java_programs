
import java.util.*;
public class EquilateralAndIsosells {
    public static List<String> triangleType(List<String> triangleToy) {
        List<String> list = Arrays.asList("2 2 1", "3 3 3", "3 4 5", "1 1 3");
        
       return list;
    }
    public static void main(String[] args) {
            List<String> triangleToy = Arrays.asList("2 2 1", "3 3 3", "3 4 5", "1 1 3");
    
            List<String> result = triangleType(triangleToy);
            
            System.out.println();
            for (String res : result) {
                System.out.print("\"" + res + "\", ");
            }
            System.out.println("\n");
        
    }
    
}
