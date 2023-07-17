package jdbc;

public class Education {
	private String typeOfEducation;
	private String institution;
	private int completionYear;
	private double cgpa;
	
	
	public Education(String typeOfEducation, String institution, int completionYear, double cgpa) {
		super();
		this.typeOfEducation = typeOfEducation;
		this.institution = institution;
		this.completionYear = completionYear;
		this.cgpa = cgpa;
	}
	
	public String getTypeOfEducation() {
		return typeOfEducation;
	}
	public String getInstitution() {
		return institution;
	}
	public int getCompletionYear() {
		return completionYear;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setTypeOfEducation(String typeOfEducation) {
		this.typeOfEducation = typeOfEducation;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public void setCompletionYear(int completionYear) {
		this.completionYear = completionYear;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Education [typeOfEducation=" + typeOfEducation + ", institution=" + institution + ", completionYear="
				+ completionYear + ", cgpa=" + cgpa + "]";
	}

}