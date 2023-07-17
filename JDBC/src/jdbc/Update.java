package jdbc;
import java.sql.*;
public class Update {

	public static void main(String[] args) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					System.out.println("driver found successful");
					String url = "jdbc:mysql://localhost:3306/manohar";
					String username = "root";
					String password = "root";
					Connection con;
					con =DriverManager.getConnection(url,username,password);
					System.out.println("connected with database successfully");
					
					String query = "update employee set first_name = 'Rajesh' where id = 1001";
					PreparedStatement st = con.prepareStatement(query);
					st.execute();
					System.out.println("Data updated Successfully...");
					con.close();
					
				} catch (ClassNotFoundException e) {
					System.out.println("unable to find the driver");
				}
				catch (SQLException e) {
					System.out.println("unable to connect with database");
				}

			}

		}