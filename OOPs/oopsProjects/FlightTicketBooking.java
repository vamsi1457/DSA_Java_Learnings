package OOPs.oopsProjects;
interface BoardingService {
    void boardPassenger();
}
abstract class Passenger {
    int passId;
    String passName;
    int age;
    double lugWeight;

    static int totalPassengers = 0;

    Passenger(int passId, String passName, int age, double lugWeight) {
        this.passId = passId;
        this.passName = passName;
        this.age = age;
        this.lugWeight = lugWeight;
        totalPassengers++;
    }

    abstract double calExtraLugFee();

    public void displayPass() {
        System.out.println("Passenger ID      : " + passId);
        System.out.println("Passenger Name    : " + passName);
        System.out.println("Passenger Age     : " + age);
        System.out.println("Luggage Weight    : " + lugWeight + " kg");
    }
}

class VIP extends Passenger {

    VIP(int passId, String passName, int age, double lugWeight) {
        super(passId, passName, age, lugWeight);
    }

    @Override
    double calExtraLugFee() {
        if (lugWeight > 25) {
            return (lugWeight - 25) * 200;
        }
        return 0;
    }
}

class Regular extends Passenger {

    Regular(int passId, String passName, int age, double lugWeight) {
        super(passId, passName, age, lugWeight);
    }

    @Override
    double calExtraLugFee() {
        if (lugWeight > 15) {
            return (lugWeight - 15) * 500;
        }
        return 0;
    }
}

class Flight {
    private int flightId;
    private String flightName;
    private String destination;
    private double price;

    static int totalFlights = 0;

    Flight(int flightId, String flightName, String destination, double price) {
        this.flightId = flightId;
        this.flightName = flightName;
        this.destination = destination;
        this.price = price;
        totalFlights++;
    }

    public int getFlightId() {
        return flightId;
    }

    public String getFlightName() {
        return flightName;
    }

    public String getDestination() {
        return destination;
    }

    public double getPrice() {
        return price;
    }

    public void displayFlight() {
        System.out.println("Flight ID         : " + flightId);
        System.out.println("Flight Name       : " + flightName);
        System.out.println("Destination       : " + destination);
        System.out.println("Ticket Price      : Rs. " + price);
    }
}

class TicketBooking implements BoardingService {

    private Passenger passenger;
    private Flight flight;

    static int totalBookings = 0;

    TicketBooking(Passenger passenger, Flight flight) {
        this.passenger = passenger;
        this.flight = flight;
        totalBookings++;
    }

    public double calFinalAmt() {
        return flight.getPrice() + passenger.calExtraLugFee();
    }

    public void genBoardPass() {

        System.out.println("\n========== BOARDING PASS ==========");

        passenger.displayPass();
        System.out.println();

        flight.displayFlight();
        System.out.println();

        System.out.println("Extra Luggage Fee : Rs. " + passenger.calExtraLugFee());
        System.out.println("Final Amount      : Rs. " + calFinalAmt());

        System.out.println("===================================");
    }

    @Override
    public void boardPassenger() {
        System.out.println("Passenger boarded successfully!");
    }
}

class AirportStats {

    public static void displayAirportStats() {

        System.out.println("\n--------- AIRPORT STATS ---------");
        System.out.println("Total Passengers : " + Passenger.totalPassengers);
        System.out.println("Total Flights    : " + Flight.totalFlights);
        System.out.println("Total Bookings   : " + TicketBooking.totalBookings);
        System.out.println("---------------------------------");
    }
}

public class FlightTicketBooking {

    public static void main(String[] args) {

        Flight f1 = new Flight(
                101,
                "Indigo",
                "Singapore",
                34000
        );

        Passenger p1 = new VIP(
                1,
                "Rahul",
                24,
                29
        );

        Passenger p2 = new Regular(
                2,
                "Jack",
                22,
                21
        );

        TicketBooking t1 = new TicketBooking(p1, f1);
        TicketBooking t2 = new TicketBooking(p2, f1);

        t1.genBoardPass();
        t1.boardPassenger();

        t2.genBoardPass();
        t2.boardPassenger();

        AirportStats.displayAirportStats();
    }
}