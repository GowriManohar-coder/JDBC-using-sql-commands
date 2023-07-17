package jdbc;
import java.sql.*;
public class Joins {

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
					
					String query = "select employee.id,employee.first_name from employee as e left join education as ed on e.id = ed.id;";
					PreparedStatement st = con.prepareStatement(query);
					ResultSet rs = st.executeQuery();
					while(rs.next()) {
					System.out.println(rs.getInt("id")+"  "+rs.getString("first_Name")/*+"  "+rs.getString("last_Name")
					+"  "+rs.getString("father_Name")+"  "+rs.getString("gender")+"  "+rs.getDate("date_of_birth")+"  "+rs.getString("date_of_joining0")*/);
					}
					System.out.println("Table shown Successfully...");
					con.close();
					
				} catch (ClassNotFoundException e) {
					System.out.println("unable to find the driver");
				}
				catch (SQLException e) {
					System.out.println("unable to connect with database");
				}

			}

		}