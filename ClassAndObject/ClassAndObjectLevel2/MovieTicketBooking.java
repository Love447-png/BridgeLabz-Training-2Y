class MovieTicket {
    String movie;
    int seats;
    double price;

    MovieTicket(String m,int s,double p){
        movie=m;
        seats=s;
        price=p;
    }

    double totalCost(){
        return seats*price;
    }

    void display(){
        System.out.println("Movie: "+movie);
        System.out.println("Seats: "+seats);
        System.out.println("Price per seat: "+price);
        System.out.println("Total Cost: "+totalCost());
    }
}

public class TicketMain {
    public static void main(String[] args){
        MovieTicket t1=new MovieTicket("Pathaan",3,200);
        MovieTicket t2=new MovieTicket("Jawan",2,250);

        t1.display();
        t2.display();
    }
}
