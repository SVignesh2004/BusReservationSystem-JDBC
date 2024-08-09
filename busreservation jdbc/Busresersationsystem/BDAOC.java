package Busresersationsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class BDAOC {
    public static  void performDatabaseOperation() {
        try (Connection conn = DatabaseConnections.getConnection()) {
            String query = "SELECT * FROM bus";
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println("id:"+rs.getInt(1));
                if (rs.getInt(2)==0){
                    System.out.println("AC:NO");
                }else {
                    System.out.println("AC:YES");

                }
                System.out.println("Capacity:"+rs.getInt(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int getCapacity(int busnum) throws SQLException {

        String query="select capacity from bus where id="+busnum;
        Connection conn = DatabaseConnections.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        return rs.getInt(1);
    }
}
