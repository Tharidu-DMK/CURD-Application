/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package songs;
import java.sql.Connection;
import java.sql.DriverManager;
public class db {
    
    public static Connection con(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://"
                            +"localhost:3306/songs","root","");
            return c ;
        }
        catch (Exception e){
        }
        return null;
    }
    
}
