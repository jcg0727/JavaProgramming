package chapter7;

public class EmployeesVO {
	private int departmentId;
	private String departmentName;
	private String empName;
	private String employeeId;
	public EmployeesVO(int departmentId, String departmentName, String empName, String employeeId) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.empName = empName;
		this.employeeId = employeeId;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		return "EmployeesVO [departmentId=" + departmentId + ", departmentName=" + departmentName + ", empName="
				+ empName + ", employeeId=" + employeeId + "]";
	}
	
	
	
	
	
}











