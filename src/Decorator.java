import java.io.Serializable;

public class Decorator extends Product implements Serializable{
    public static final long serialVersionUID = 1L;   
    private Materials material;

    public Decorator(String Name, int Qty, double price, String material) throws Exception{
        super(Name, Qty, price);
        setMaterial(material);
    }

    public Materials getMaterial(){
        return material;
    }
    private void setMaterial(String material) throws Exception{
        try{
            this.material = Materials.valueOf(material);
        }catch(IllegalArgumentException ex){
            throw new Exception("Values are not correct");
        }
    }

    public String getAllInfo(){
        return getProductName() + "\n--Stock=>" + getStock() + "\n--Price: " + getPrice() + " \n--Material: " + getMaterial();  
    }    

    private enum Materials{
        Fusta,Plastic;
    }
    
}
