package inlab;

import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.cfg.*;
public class UpdateEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory f = new Configuration().configure().buildSessionFactory();
		
		Session s = f.openSession();
		
		Transaction tx = s.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee id to update: ");
		
		int empId = sc.nextInt();
		System.out.println(" ");
		Employee e = s.load(Employee.class, empId);
		System.out.println("Enter Employee Name : ");
		String empName = sc.next();
		System.out.println("Enter Employee Salary : ");
		double empSalary = sc.nextDouble();
		System.out.println("Enter Employee Address : ");
		String empAddress = sc.next();
		e.setEmpName(empName);
		e.setEmpSalary(empSalary);
		e.setEmpAddress(empAddress);
		s.save(e);
		
		tx.commit();
		System.out.println("Employee details updated....");
	}

}
