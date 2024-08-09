package Busresersationsystem;


import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        BDAOC busaoc=new BDAOC();
        BDAOC.performDatabaseOperation();

        int useropt = 1;
        Scanner option = new Scanner(System.in);
        while (useropt == 1) {
            System.out.println("Welcome to Xyz Bus Booking App Press 1 to Continue Booking or Press 2 to Exit");
            useropt = option.nextInt();
            if (useropt == 1) {


                Booking booking = new Booking();
                if (booking.isAvailabe()) {
                    bookingDao bookingdao = new bookingDao();
                    bookingdao.addBooking(booking);
                    System.out.println("Booking confirmed");
                } else {
                    System.out.println("'Sorry' Seats are full in this Bus Try some other Bus..Thank YOU!!");
                }

            } else {
                System.out.println("Thanks For Visiting!!");
            }
        }
        option.close();
        }

    }

