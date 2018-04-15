package Room;
import Guest.Guest;
import java.util.ArrayList;


public class ConferenceRoom extends Room {
    private String name;
    private double dailyPrice;

    public ConferenceRoom(int capacity, ArrayList<Guest> guests, String name, double dailyPrice) {
        super(capacity, guests);
        this.name = name;
        this.dailyPrice = dailyPrice;

    }

    public double getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(double dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
