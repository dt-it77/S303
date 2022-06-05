import java.io.Serializable;

public class Tree extends Product implements Serializable{
    public static final long serialVersionUID = 1L;   

    private Double hight;

    public Tree(String Name, int Qty, double price, Double hight) throws Exception{
        super(Name, Qty, price);
        setHight(hight);
    }

    public Double getHight(){
        return hight;
    }
    private void setHight(Double hight){
        this.hight = hight;
    }
    @Override
    public String toString(){
        return getProductName() + "\n--Stock:" + getStock() + "\n--Price: " + getPrice() + " \n--Hight: " + getHight();  
    }    
}
