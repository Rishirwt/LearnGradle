package Sale;

import com.google.gson.Gson;
import info.garage.JsonDisplay;

public class SaleEvent {
    private String id;
    private String streetAddress;
    private String city;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "saleEvent: "+id+", "+streetAddress+", "+city;
    }

    public static void main(String[] args) {
        SaleEvent event=new SaleEvent();
        event.setId("100");
        event.setStreetAddress("123 Main St.");
        event.setCity("London");
        System.out.println(event.toString());

        JsonDisplay.showJson(event);
    }
}
