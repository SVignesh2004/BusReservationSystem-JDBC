package Busresersationsystem;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
    String name;
    int busnum;
    Date date;

    Booking() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name");
        name = scanner.next();
        System.out.println("Enter the Busno");
        busnum = scanner.nextInt();
        System.out.println("Enter the date in dd-mm-yyyy");
        String Dateinput = scanner.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(Dateinput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    /*Getting the capacity of the Bus and Getting the no of Booking done in
     the bus and sub the capacity and booking to find the available seat in the bus*/

    public boolean isAvailabe() throws SQLException {

        //to find the capacity
        BDAOC busaoc=new BDAOC();
        bookingDao bookingdao = new bookingDao();
        int Capacity = busaoc.getCapacity(busnum);
        int booker=bookingdao.getBookedCount(busnum,date);
        return booker<Capacity?true :false;
    }
}
