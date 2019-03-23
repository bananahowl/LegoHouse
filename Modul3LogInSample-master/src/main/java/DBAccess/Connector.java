package DBAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 The purpose of Connector is to...

 @author kasper
 */
public class Connector {

//    private static final String URL = "jdbc:mysql://167.99.209.106:22/LEGODATA";
//    private static final String USERNAME = "root";
//    private static final String PASSWORD = "Kpb77qwv";

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/legodata";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "nutz";
    private static Connection singleton;

    public static void setConnection( Connection con ) {
        singleton = con;
    }

    public static Connection connection() throws ClassNotFoundException, SQLException {
        if ( singleton == null ) {
            Class.forName( "com.mysql.cj.jdbc.Driver" );
            singleton = DriverManager.getConnection( URL, USERNAME, PASSWORD );
        }
        return singleton;
    }

}
