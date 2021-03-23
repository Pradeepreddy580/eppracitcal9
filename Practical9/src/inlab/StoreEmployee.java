package inlab;

import org.hibernate.*;
import org.hibernate.cfg.*;
public class StoreEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory f = new Configuration().configure().buildSessionFactory();
		
		Session s = f.openSession();
		
		Transaction tx = s.beginTransaction();
		
		Employee e = new Employee();
		
		e.setEmpId(31303);
		e.setEmpName("Nithesh");
		e.setEmpSalary(50000);
		e.setEmpAddress("Ongole");
		s.save(e);
		tx.commit();
		System.out.println("values inserted");
	}

}
