public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    public MovieTicket(String movieName) {
        this.movieName = movieName;
    }

    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    public void display() {
        System.out.println("Movie Ticket Details");
        System.out.println("Movie Name : " + movieName);
        System.out.println("Seat No.   : " + seatNumber);
        System.out.println("Price      : " + price);
    }

    public static void main(String[] args) {
        MovieTicket t1 = new MovieTicket("Avengers: Endgame");
        t1.bookTicket("A12", 250.0);
        t1.display();
    }
}
