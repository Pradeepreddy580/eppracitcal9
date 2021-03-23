package customers;

import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.Scanner;

public class StoreCustomers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		SessionFactory f = new Configuration().configure().buildSessionFactory();
		
		Session s = f.openSession();
		
		Transaction tx = s.beginTransaction();
		
		Customers c = new Customers();
		
		c.setID(31303);
		c.setFirstName("Nithesh");
		c.setLastName("Narayana");
		c.setCity("Ongole");
		c.setCountry("India");
		c.setPhone(794516565);
		
		s.save(c);
		
		tx.commit();
		System.out.println("Values Inserted");
	}

}
