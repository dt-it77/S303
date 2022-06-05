import java.io.Serializable;

public class Product implements Serializable {
    public static final long serialVersionUID = 1L;
    private String name;
    private int qty;
    private double price;

    public Product(String Name,int Qty, double Price) throws Exception{
        setProductName(Name);
        setStock(Qty);
        setPrice(Price);
    }

    public String getProductName(){
        return name;
    }

    private void setProductName(String Name) throws Exception{
        if(Name.isEmpty() || Name == null) throw new Exception("Name cannot be empty, it is a key value");
        name = Name;
    }

    public int getStock(){
        return qty;
    }

    private void setStock(int Qty) throws Exception{
        if(qty < 0) throw new Exception("Cannot add stock lees than zero");
        qty = qty+Qty;
    }

    public double getPrice(){
        return price;
    }

    private void setPrice(double Price) throws Exception{
        if(price < 0) throw new Exception("Price must be grather than 0");
        price = Price;
    }

}
