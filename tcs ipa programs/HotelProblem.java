import java.util.*;

class Hotel implements Comparable<Hotel> {
    int hotelId;
    String hotelName;
    String dateOfBooking;
    int noOfRoomsBooked;
    String wifiFacility;
    double totalBill;

    public Hotel(int hotelId, String hotelName, String dateOfBooking, int noOfRoomsBooked, String wifiFacility, double totalBill) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.wifiFacility = wifiFacility;
        this.totalBill = totalBill;
    }

    @Override
    public int compareTo(Hotel a) {
        if (this.totalBill > a.totalBill) 
            return 1;
        else if (this.totalBill < a.totalBill) 
            return -1;
        else 
            return 0;
    }
}
public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel[] hotels = new Hotel[4];
        
        for (int i = 0; i < hotels.length; i++) {

            int hotelId = sc.nextInt();
            sc.nextLine(); 
            String hotelName = sc.nextLine();
            String dateOfBooking = sc.nextLine();
            int noOfRoomsBooked = sc.nextInt();
            sc.nextLine();
            String wifiFacility = sc.nextLine();
            double totalBill = sc.nextDouble();
            hotels[i] = new Hotel(hotelId, hotelName, dateOfBooking, noOfRoomsBooked, wifiFacility, totalBill);
        }

        List<Hotel> list = Arrays.asList(hotels);
        Collections.sort(list);
        for (Hotel hotel : list) {
            System.out.println("Hotel ID: " + hotel.hotelId + ", Hotel Name: " + hotel.hotelName + 
                               ", Date of Booking: " + hotel.dateOfBooking + ", No of Rooms Booked: " + hotel.noOfRoomsBooked + 
                               ", Wifi Facility: " + hotel.wifiFacility + ", Total Bill: " + hotel.totalBill);
        }
    }
}
