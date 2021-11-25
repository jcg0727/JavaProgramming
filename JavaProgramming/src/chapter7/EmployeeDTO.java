package chapter7;

public class EmployeeDTO {
	private String id;
	private String name;
	private String email;
	private String hpNumber;
	public EmployeeDTO(String id, String name, String email, String hpNumber) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.hpNumber = hpNumber;
	}
	public EmployeeDTO(String empName, int empHpNumber, int empId) {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHpNumber() {
		return hpNumber;
	}
	public void setHpNumber(String hpNumber) {
		this.hpNumber = hpNumber;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", name=" + name + ", email=" + email + ", hpNumber=" + hpNumber + "]";
	}
	
	
}
