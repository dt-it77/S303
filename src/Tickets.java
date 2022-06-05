import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Tickets implements Serializable{

    public static final long serialVersionUID = 1L;

    List<Ticket> listTickets = new ArrayList<Ticket>();

    public void addTicket(List<Product> products){
        Ticket newTicket = new Ticket();
        newTicket.ticketID = listTickets.size()+1;
        newTicket.tickets = new ArrayList<Product>();
        newTicket.tickets.addAll(products);
        listTickets.add(newTicket);
    }

    public void printHistoricTickets(){
        for (Ticket tickets : listTickets) {
            System.out.println("-----Ticket ID: "+tickets.ticketID + "-----");
            System.out.println("Products:");
            for (Product product : tickets.tickets) {
                System.out.println(product.getProductName() + " " + product.getPrice());
            }
        }
    }

    public void printSellTicketsPrice(){
        double value = 0;
        for (Ticket ticket : listTickets) {
            for (Product product : ticket.tickets) {
                value = value + product.getPrice();
            }
        }
        System.out.println("Total sell value " + value);
    }
    
    public class Ticket implements Serializable{
        public static final long serialVersionUID = 1L;
        public int ticketID;
        public List<Product> tickets;
    }


}
