import java.io.Serializable;

public class Store implements Serializable{

    public static final long serialVersionUID = 1L;   

    public Tickets ticketsManager = new Tickets();
    public Stock stockManager = new Stock();
    
    private String floristName;
    
    public Store(String name)throws Exception{
        setFlorist(name);
    }

    public String getFlorist(){
        return floristName;
    }
    private void setFlorist(String florist) throws Exception{
        if(florist.isEmpty() || florist == null) throw new Exception("Name cannot be empty, it is a key value");
        
        this.floristName = florist;
    }
}
