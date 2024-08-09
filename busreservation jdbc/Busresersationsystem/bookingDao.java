package Busresersationsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class bookingDao {


    public int getBookedCount(int busnum, Date date)throws SQLException {
        String query="select count(pasanger_name ) from booking where  bus_no=? and travel_date=?";

        Connection conn = DatabaseConnections.getConnection();
        PreparedStatement pre=conn.prepareStatement(query);
        java.sql.Date sqldate=new  java.sql.Date(date.getTime());
        pre.setInt(1,busnum);
        pre.setDate(2,sqldate);
        ResultSet rs=pre.executeQuery();
        rs.next();
        return rs.getInt(1);

    }

    public void addBooking(Booking booking) throws  SQLException{
        String query="insert into booking values(?,?,?)";
        Connection conn = DatabaseConnections.getConnection();
        java.sql.Date sqldate=new  java.sql.Date(booking.date.getTime());
        PreparedStatement pre=conn.prepareStatement(query);
        pre.setString(1,booking.name );
        pre.setInt(2,booking.busnum);
        pre.setDate(3,sqldate);
        pre.executeUpdate();


    }
}

