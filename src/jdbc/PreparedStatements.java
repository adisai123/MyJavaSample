package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;


public class PreparedStatements
{

    public static void main(String[] args)
    {
        try
        {
            Driver d = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(d);
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest", "root", "password");
            PreparedStatement p = c.prepareStatement("select * from employee");
            ResultSet ss = p.executeQuery();
            while (ss.next())
            {
                System.out.println(ss.getInt(1));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
