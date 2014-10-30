
public class Course {
	
	private String name;
	private String ID;
	private String department;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

	private String room;
	private int section;
	
	private boolean prerequisite(String ID) {
		boolean result = true;
		
		if (result == false) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public Course(String name, String ID, String department) {
		setName(name);
		setID(ID);
		setDepartment(department);
		System.out.println(ID+" Course created");
	}
	
	public Course(String ID, String name) {
		try {
			if (this.getDepartment().isEmpty()){
				new Course(name,ID,"Default");
			}
		} catch (ExceptionInInitializerError e) {
			
		}
	}
}
