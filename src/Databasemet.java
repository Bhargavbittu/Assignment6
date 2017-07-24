import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by vankayab on 7/21/2017.
 */
public class Databasemet {
    static Connection ct;
    static Statement st;
    public static void connect(String s) {


        try {
            Class.forName("com.mysql.jdbc.Driver");

            ct = DriverManager.getConnection("jdbc:mysql://localhost/cdk", "root", "CDKcdk11");

            Statement st = ct.createStatement();

            st.executeUpdate(s);

            st.close();
            ct.close();
        } catch (Exception et) {
            et.printStackTrace();
        }

    }
    public static void insertdb(String name,long time)
    {
        time=time/1000;
        connect("insert into timelog values('"+name+"',"+time+")");
    }
}