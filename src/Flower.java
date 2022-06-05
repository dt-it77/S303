import java.io.Serializable;

public class Flower extends Product implements Serializable{
    public static final long serialVersionUID = 1L;    
    private String color;
    public Flower(String Name, int Qty, double price, String color) throws Exception{
        super(Name, Qty, price);
        setColor(color);
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getAllInfo(){
        return getProductName() + "\n--Stock=>" + getStock() + "\n--Price: " + getPrice() + " \n--Color: " + getColor();
    }
    @Override 
    public String toString(){
        return getProductName() + "\n--Stock=>" + getStock() + "\n--Price: " + getPrice() + " \n--Color: " + getColor();
    }
}
