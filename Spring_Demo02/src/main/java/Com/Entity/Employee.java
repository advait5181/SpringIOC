package Com.Entity;

public class Employee {

	private int employeeid;
	private String employeeNameString;
	private long employeePhone;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeid, String employeeNameString, long employeePhone) {
		super();
		this.employeeid = employeeid;
		this.employeeNameString = employeeNameString;
		this.employeePhone = employeePhone;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeeNameString() {
		return employeeNameString;
	}
	public void setEmployeeNameString(String employeeNameString) {
		this.employeeNameString = employeeNameString;
	}
	public long getEmployeePhone() {
		return employeePhone;
	}
	public void setEmployeePhone(long employeePhone) {
		this.employeePhone = employeePhone;
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeeNameString=" + employeeNameString + ", employeePhone="
				+ employeePhone + "]";
	}
	
}
