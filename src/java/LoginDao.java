/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 


 *
 * @author Lloyd
 
import java.sql.*; 


public class LoginDao {
    
public static boolean validate(String Username,String password){  
boolean status=false;  
try{  
Class.forName("com.mysql.jdbc.Driver"); 
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root","sonwabo@");  
      
PreparedStatement ps=con.prepareStatement(  
"select * from userlog where Username=? and password=?");  
ps.setString(1,Username);  
ps.setString(2,password);  
      
ResultSet rs=ps.executeQuery();  
status=rs.next();  
          
}catch(Exception e){System.out.println(e);}  
return status;  
}  
} 

*/