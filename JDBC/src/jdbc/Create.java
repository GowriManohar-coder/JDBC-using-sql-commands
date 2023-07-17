package jdbc;
import java.sql.*;
public class Create {

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
					
					String query = "CREATE TABLE employee (id INT NOT NULL,first_Name VARCHAR(255),last_Name VARCHAR(255),\r\n"
							+ "    father_Name VARCHAR(255),gender CHAR(1),qualification VARCHAR(255),date_of_Birth DATE,date_of_Joining DATE,\r\n"
							+ "    phone_Number BIGINT,email_Id VARCHAR(255),present_Address VARCHAR(255),designation VARCHAR(255),\r\n"
							+ "    department VARCHAR(255),expertise VARCHAR(255),skills VARCHAR(255),working_Shift VARCHAR(255),\r\n"
							+ "    PRIMARY KEY (id))";
					PreparedStatement st = con.prepareStatement(query);
					st.execute();
					System.out.println("Table has been Created Successfully...");
					con.close();
					
				} catch (ClassNotFoundException e) {
					System.out.println("unable to find the driver");
				}
				catch (SQLException e) {
					System.out.println("unable to connect with database");
				}

			}

		}
