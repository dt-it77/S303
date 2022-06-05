import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        
        String storeName = "Navarro";
        
        databaseFile dbtxtManager = databaseFile.getInstance();
        Store floristeria1;
        if(dbtxtManager.ExistDB(storeName)){
            System.out.println("Reading data from database for store " + storeName);
            floristeria1 = dbtxtManager.ReadFromFile(storeName);
        }else{
            //Crear Floristeria.
            System.out.println("Create new store " + storeName);            
            floristeria1 = new Store(storeName);
        }

        //Afegir Arbre.
        Tree t1 = new Tree("Palmera", 1, 145.98, 4.45);
        Tree t2 = new Tree("Roure", 1, 566.99, 3.10);

        //Afegir Flor.
        Flower f1 = new Flower("Ram Roses", 10, 4.20, "red");
        Flower f2 = new Flower("Ram margarita", 10, 1.44, "white");

        //Afegir Decoració.
        Decorator d1 = new Decorator("Balla", 1, 6.59, "Fusta");
        Decorator d2 = new Decorator("Balla2", 1, 9.88, "Plastic");

        //Stock: Imprimeix per pantalla tots els arbres, flors i decoració que té la floristeria.
        floristeria1.stockManager.addProduct(f1);
        floristeria1.stockManager.addProduct(d1);
        floristeria1.stockManager.addProduct(t1);
        floristeria1.stockManager.addProduct(f2);
        floristeria1.stockManager.addProduct(d2);
        floristeria1.stockManager.addProduct(t2);        
        floristeria1.stockManager.PrintStock();
        
        //Retirar arbre.
        floristeria1.stockManager.deleteProduct(t1);
        //Retirar flor.
        floristeria1.stockManager.deleteProduct(f1);        
        //Retirar decoració.
        floristeria1.stockManager.deleteProduct(d1);        
        //Printar per pantalla stock amb quantitats.
        floristeria1.stockManager.PrintStock();

        //Printar per pantalla valor total de la floristeria.
        floristeria1.stockManager.stockValue();

        //Crear tickets de compra amb múltiples objectes.
        floristeria1.ticketsManager.addTicket(new ArrayList<Product>(Arrays.asList(f2,d2,t2)));
        floristeria1.ticketsManager.addTicket(new ArrayList<Product>(Arrays.asList(f2,d2)));

        //Mostrar una llista de compres antigues.
        floristeria1.ticketsManager.printHistoricTickets();
        //Visualitzar el total de diners guanyats amb totes les vendes.
        floristeria1.ticketsManager.printSellTicketsPrice();

        //guardem estat abans de sortir
        dbtxtManager.WriteStoreStateToFile(floristeria1);
    }
}
