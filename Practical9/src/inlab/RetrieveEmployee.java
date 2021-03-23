   package inlab;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class RetrieveEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory f = new Configuration().configure().buildSessionFactory();
		
		Session s = f.openSession();
		
		Transaction tx = s.beginTransaction(); 
		
		Scanner sc = new Scanner(System.in);
		
		
		Criteria criteria=s.createCriteria(Employee.class);

		List list=criteria.list();
		
		Iterator<Employee> iter = list.iterator();
		
		System.out.println("Employees Working....");
		System.out.println(" ");
		
		while(iter.hasNext()) {
			Employee e = iter.next();
			System.out.println("Emp Id : " +e.getEmpId());
			System.out.println("Emp Name : "+e.getEmpName());
			System.out.println("Emp Salary : "+e.getEmpSalary());
			System.out.println("Emp Address : "+e.getEmpAddress());
			System.out.println(" ");
	
		}
		
	}

}
