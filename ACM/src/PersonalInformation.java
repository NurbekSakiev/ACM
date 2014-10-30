
public class PersonalInformation {
	
	private String name;
	private String sname;
	private double id;
	private String department;

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getId() {
		return id;
	}


	public void setId(double id) {
		this.id = id;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	private String email(String name, String sname) {
		return getName().charAt(0)+sname+"@na.edu";
	}


	private String getSname() {
		return sname;
	}


	private void setSname(String sname) {
		this.sname = sname;
	}
	
	
}
