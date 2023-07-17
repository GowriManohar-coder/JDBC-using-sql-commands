package jdbc;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int emp_id = 0;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver found successful");
			String url = "jdbc:mysql://localhost:3306/manohar";
			String username = "root";
			String password = "root";
			Connection con;
			con = DriverManager.getConnection(url, username, password);
			System.out.println("connected with database successfully");
			;
			System.out.println("Enter the Employee Id");
			emp_id = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Enter first name: ");
			String firstName = scanner.nextLine();

			System.out.print("Enter last name: ");
			String lastName = scanner.nextLine();

			System.out.print("Enter father's name: ");
			String fatherName = scanner.nextLine();

			System.out.print("Enter gender: ");
			char gender = scanner.nextLine().charAt(0);

			System.out.print("Enter date of birth (yyyy-mm-dd): ");
			String dateOfBirthStr = scanner.nextLine();
			LocalDate dateOfBirth = LocalDate.parse(dateOfBirthStr);

			System.out.print("Enter date of joining (yyyy-mm-dd): ");
			String dateOfJoiningStr = scanner.nextLine();
			LocalDate dateOfJoining = LocalDate.parse(dateOfJoiningStr);

			System.out.print("Enter phone number: ");
			long phoneNumber = scanner.nextLong();
			scanner.nextLine();

			System.out.print("Enter email ID: ");
			String emailId = scanner.nextLine();

			System.out.print("Enter present address: ");
			String presentAddress = scanner.nextLine();

			System.out.print("Enter designation: ");
			String designation = scanner.nextLine();

			System.out.print("Enter department: ");
			String department = scanner.nextLine();

			System.out.print("Enter expertise: ");
			String expertise = scanner.nextLine();

			System.out.print("Enter skills: ");
			String skills = scanner.nextLine();

			System.out.print("Enter working shift: ");
			String workingShift = scanner.nextLine();

			for (int i = 1; i <= 2; i++) {
				System.out.print("Enter the type of education: ");
				String typeOfEducation = scanner.nextLine();

				System.out.print("Enter the institution: ");
				String institution = scanner.nextLine();

				System.out.print("Enter the completion year: ");
				int completionYear = scanner.nextInt();

				System.out.print("Enter the CGPA: ");
				float cgpa = scanner.nextFloat();
				scanner.nextLine();

				String query1 = "INSERT INTO education (typeOfEducation, institution, completionYear, cgpa, emp_id) VALUES (?, ?, ?, ?, ?)";

				PreparedStatement st1 = con.prepareStatement(query1);
				st1.setString(1, typeOfEducation);
				st1.setString(2, institution);
				st1.setInt(3, completionYear);
				st1.setFloat(4, cgpa);
				st1.setInt(5, emp_id);
				st1.execute();
			}
			
			String query = "INSERT INTO employee (emp_id, first_Name, last_Name, father_Name, gender, date_of_Birth, date_of_Joining, phone_Number, email_Id, present_Address, designation, department, expertise, skills, working_Shift) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

			PreparedStatement st = con.prepareStatement(query);
			st.setInt(1, emp_id);
			st.setString(2, firstName);
			st.setString(3, lastName);
			st.setString(4, fatherName);
			st.setString(5, String.valueOf(gender));
			st.setDate(6, java.sql.Date.valueOf(dateOfBirth));
			st.setDate(7, java.sql.Date.valueOf(dateOfJoining));
			st.setLong(8, phoneNumber);
			st.setString(9, emailId);
			st.setString(10, presentAddress);
			st.setString(11, designation);
			st.setString(12, department);
			st.setString(13, expertise);
			st.setString(14, skills);
			st.setString(15, workingShift);

			st.execute();

			System.out.println("Data inserted to SQL Successfully");
			con.close();

		} catch (ClassNotFoundException e) {
			System.out.println("unable to find the driver");
		} catch (SQLException e) {
			System.out.println("unable to connect with database");
		}

	}

}