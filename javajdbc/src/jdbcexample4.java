import java.io.*;
import java.sql.*;
public class jdbcexample4   {
	public static void main(String[] args) {
		try {
		//load  the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Creating a connection
		String url = "jdbc:mysql://localhost:3306/mydb1";
		String username = "root";
		String password = "rakshita25";
		Connection con = DriverManager.getConnection(url,username,password);
		String q ="insert into student(name,city) values(?,?)";
		PreparedStatement pstmt = con.prepareStatement(q);
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter Name:");
		String name = dis.readLine();
		System.out.println("Enter city:");
		String city = dis.readLine();
		pstmt.setString(1, name);
		pstmt.setString(2, city);
		pstmt.executeUpdate();
		System.out.println("Inserted...");
		con.close();
		
		}		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
