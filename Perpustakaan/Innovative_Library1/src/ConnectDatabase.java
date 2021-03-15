import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConnectDatabase {
    Connection con;
    Statement stm;
    
    public void koneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/innovative_library","root","");
            stm=con.createStatement();
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "koneksi gagal"+e.getMessage()); 
        }
    }
    
    public static void main(String args[]){
        new ConnectDatabase().koneksi();
    }
    
}
