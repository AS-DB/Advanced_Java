import java.sql.*;

class JavaApplication1{
public static void main(String args[]) throws Exception{

Class.forName("com.mysql.cj.jdbc.Driver");

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "1234");


String sql_string="insert into info (id,name) values(?,?)";

//preparing a Callstatement
CallableStatement cs = con.prepareCall(sql_string);

cs.setInt(1,1);
cs.setString(2,"ADITYA DAS");

cs.execute();
System.out.println("Uploaded the data into Info table....\n");

}}