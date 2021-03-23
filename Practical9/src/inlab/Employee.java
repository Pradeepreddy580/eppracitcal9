package inlab;

public class Employee {
	private int EmpId;
	private String EmpName;
	private double EmpSalary;
	private String EmpAddress;
	
	public Employee() {
		super();
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public double getEmpSalary() {
		return EmpSalary;
	}

	public void setEmpSalary(double empSalary) {
		EmpSalary = empSalary;
	}

	public String getEmpAddress() {
		return EmpAddress;
	}

	public void setEmpAddress(String empAddress) {
		EmpAddress = empAddress;
	}
	
}
