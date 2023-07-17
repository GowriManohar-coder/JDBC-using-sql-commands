package jdbc;

import java.time.LocalDate;

public class Employee {
	private int id;
	private String first_Name;
	private String last_Name;
	private String father_Name;
	private char gender;
	private Education education;
	private LocalDate date_of_Birth;
	private LocalDate date_of_Joining;
	private long phone_Number;
	private String email_Id;
	private String present_Address;
	private String designation;
	private String department;
	private String expertise;
	private String skills;
	private String working_Shift;
	
	public Employee(int id, String first_Name, String last_Name, String father_Name, char gender, Education education,
			LocalDate date_of_Birth, LocalDate date_of_Joining, long phone_Number, String email_Id,
			String present_Address, String designation, String department, String expertise, String skills,
			String working_Shift) {
		super();
		this.id = id;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.father_Name = father_Name;
		this.gender = gender;
		this.education = education;
		this.date_of_Birth = date_of_Birth;
		this.date_of_Joining = date_of_Joining;
		this.phone_Number = phone_Number;
		this.email_Id = email_Id;
		this.present_Address = present_Address;
		this.designation = designation;
		this.department = department;
		this.expertise = expertise;
		this.skills = skills;
		this.working_Shift = working_Shift;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", first_Name=" + first_Name + ", last_Name=" + last_Name + ", father_Name="
				+ father_Name + ", gender=" + gender + ", Education=" + education + ", date_of_Birth="
				+ date_of_Birth + ", date_of_Joining=" + date_of_Joining + ", phone_Number=" + phone_Number
				+ ", email_Id=" + email_Id + ", present_Address=" + present_Address + ", designation=" + designation
				+ ", department=" + department + ", expertise=" + expertise + ", skills=" + skills + ", working_Shift="
				+ working_Shift + "]";
	}
	
	

}