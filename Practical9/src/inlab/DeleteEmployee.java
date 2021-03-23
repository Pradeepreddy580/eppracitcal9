package inlab;

import org.hibernate.*;
import java.util.Scanner;
import org.hibernate.cfg.*;
public class DeleteEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory f = new Configuration().configure().buildSessionFactory();
		
		Session s = f.openSession();
		
		Transaction tx = s.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id to Delete : ");
		int empId = sc.nextInt();
		
		Employee e = s.load(Employee.class, empId);
		
		s.delete(e);
		
		
		
		tx.commit();
		
		System.out.println("EMployee deleted....");
		
	}

}
