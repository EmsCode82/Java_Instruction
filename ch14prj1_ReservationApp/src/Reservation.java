import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Reservation {

    private LocalDate arrivalDate;
    private LocalDate departureDate;
    public final double PRICE_PER_NIGHT = 115.00;

    public Reservation() {
    }

    public Reservation(LocalDate arrival, LocalDate departure) {
        this.arrivalDate = arrival;
        this.departureDate = departure;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public String getArrivalDateFormatted() {
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(
                FormatStyle.LONG);
        return dtf.format(arrivalDate);
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public String getDepartureDateFormatted() {
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(
                FormatStyle.LONG);
        return dtf.format(departureDate);
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }
    
    public int getNumberOfNights() {        
        int nights = (int) ChronoUnit.DAYS.between(
                arrivalDate, departureDate);
        return nights;
    }

    public String getPricePerNightFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(PRICE_PER_NIGHT);
    }
    
    public double getTotalPrice() {
        int numOfNights = this.getNumberOfNights();
        return PRICE_PER_NIGHT * numOfNights;
    }
    
    public String getTotalPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(getTotalPrice());
    }    
}