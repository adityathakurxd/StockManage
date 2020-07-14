/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanage;


import java.sql.*;  
//Stock Trade and  STAR System
public class StockManage {
static Connection con;
Statement st;
ResultSet rs;
public static void main(String args[]){  
try{  
new LoginPage().setVisible(true);
Class.forName("com.mysql.cj.jdbc.Driver");  
con = DriverManager.getConnection("jdbc:mysql://localhost/abc?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root",""); 
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from userdetails");  
while(rs.next())  
System.out.println(rs.getString(1)+" "+ rs.getString(2));   
}catch(Exception e){ System.out.println(e);}  
}  
}  
