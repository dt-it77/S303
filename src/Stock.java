import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Stock implements Serializable{
    
    public static final long serialVersionUID = 1L;
    private List<Product> stockProduct = new ArrayList<Product>();

    public void addProduct(Product product){
        stockProduct.add(product);
        
        System.out.println("Product "+product.getProductName()+" added");
    }

    public void deleteProduct(Product product){
        if(stockProduct.remove(product)){
            System.out.println("Deleted "+product.getProductName());
        }else{
            System.out.println("Product "+ product.getProductName()+ " not exist");
        }
    }

    public void PrintStock(){
        System.out.println("------Current Stock ------");
        for (Product product : stockProduct) {
            System.out.println(product.getProductName() + " => Stock: " + product.getStock()); 
        }
        System.out.println("-------------------------");
    }

    public void stockValue(){
        double value=0;
        for (Product product : stockProduct) {
            value = value + product.getPrice();
        }
        System.out.println("Stock value: " + value);
    }
}
