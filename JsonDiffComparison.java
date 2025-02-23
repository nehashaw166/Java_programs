import java.util.*;

public class JsonDiffComparison {
    private static void jsonDifference(String json1 ,String json2) {

        Map<String, String> map1 = json1.jsonParse(json1);
        
       
    }


    public static void main(String[] args) {
        String json1 = "{\"1\":\"one\",\"2\":\"two\",\"3\":\"three\"}";
        String json2 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";

        jsonDifference(json1,json2);
            
        
     }
    
}
