import java.time.LocalDate;

public class ReservationApp {

    public static void main(String[] args) {

        System.out.println("Reservation Calculator\n");
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the month, day, and year of the arrival
            int month = Console.getInt("Enter the arrival month (1-12): ", 0, 13);
            int day = Console.getInt("Enter the arrival day (1-31): ", 0, 32);
            int year = Console.getInt("Enter the arrival year: ", 2016, 2100);
            System.out.println();            

            // create date from the values entered
            LocalDate arrivalDate = LocalDate.of(year, month, day);

            // get the month, day, and year of the departure
            month = Console.getInt("Enter the departure month (1-12): ", 0, 13);
            day = Console.getInt("Enter the departure day (1-31): ", 0, 32);
            year = Console.getInt("Enter the departure year: ", 2016, 2100);
            System.out.println();            

            // create date from the values entered
            LocalDate departureDate = LocalDate.of(year, month, day);

            // create a reservation object with the dates entered
            Reservation r = new Reservation(arrivalDate, departureDate);

            // display the reservation data
            String s = 
                  "Arrival Date: " + r.getArrivalDateFormatted() + "\n"
                + "Departure Date: " + r.getDepartureDateFormatted() + "\n"
                + "Price: " + r.getPricePerNightFormatted() + " per night\n"
                + "Total price: " + r.getTotalPriceFormatted()
                + " for " + r.getNumberOfNights() + " nights\n";
            System.out.println(s);
            
            choice = Console.getString("Continue? (y/n): ");
            System.out.println();            
        }
        System.out.println("Bye!");
    }
}