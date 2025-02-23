
import java.util.*;
public class errorFindingForPriceVaries {

    private static int priceChaeck(String[] product, float[] productPrice, String[] soldProduct,
    float[] soldProductPrice) {
        int errorCount = 0;
        Map<String, Float> mapPrice = new HashMap<>();
        for(int i= 0; i<product.length; i++){
            mapPrice.put(product[i], productPrice[i]) ;      
        } 

        for(int j=0; j<soldProduct.length;j++){

            if((mapPrice.get(soldProduct[j])!=soldProductPrice[j]))
            {
                errorCount+=1;
            }
        }

        return errorCount;
    }
    public static void main(String[] args) {

        String[] product = {"eggs","milk","cheese"};
        float[] productPrice = {2.0f, 5.2f,9.2f};

        String[] soldProduct = {"eggs","eggs","milk","cheese"};
        float[] soldProductPrice = {2.0f,2.5f, 5.3f,9.2f};

        int error = priceChaeck(product,productPrice,soldProduct,soldProductPrice);
            System.out.println(error);    
                
        }
                 
    
}
