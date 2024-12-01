
package kelas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
   private Connection connect_db;
   private String host = "localhost";
   private String db = "tokokita_202357201048";
   private String user = "root";
   private String password = "";
   private String port = "3306";
   private String url = "jdbc:mysql://" + host + ":" + port + "/" + db;
   
   public Connection connectDb() throws SQLException{
       
       try {
           connect_db = DriverManager.getConnection(url, user, password);
           System.out.println("Terkoneksi");
       } catch (SQLException sQLException) {
           System.out.println("Request TimeOut");
       }
       
       return connect_db;
   }
}
