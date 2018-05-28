package jdbc;

import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

import com.mysql.jdbc.Driver;


public class FirstJava implements DriverAction
{

    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest", "root", "password");
            Statement s = c.createStatement();
            // s.addBatch("create table employee(id int(11),name varchar(30),salary int(22))");
            c.setAutoCommit(false);
            s.addBatch("insert into employee values(3322,'wwhsww',2999909)");
            s.executeBatch();
            Savepoint sp = c.setSavepoint("f");
            s.executeUpdate("insert into employee values(5333222,'wwssjw',2999989)");
            c.rollback(sp);
            c.commit();
            ResultSet rs = s.executeQuery("select * from employee;");
            while (rs.next())
            {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
            Driver driver = new com.mysql.jdbc.Driver();
            // Creating Action Driver
            DriverAction da = new FirstJava();
            // Registering driver by passing driver and driverAction
            DriverManager.registerDriver(driver, da);
            // Creating connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest", "root", "password");
            Statement stmt = con.createStatement();
            // Executing SQL query
            rs = stmt.executeQuery("select * from employee");
            while (rs.next())
            {
                System.out.println(rs.getInt(1) + "" + rs.getString(2) + "" + rs.getString(3));
            }
            // Closing connection
            DriverManager.deregisterDriver(driver);
            con.close();
        }
        catch (ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
    }


    @Override
    public void deregister()
    {
        System.out.println("Driver deregistered");
    }
}
