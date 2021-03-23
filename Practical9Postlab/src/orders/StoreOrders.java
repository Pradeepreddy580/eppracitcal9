package orders;

import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.Scanner;

public class StoreOrders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		SessionFactory f = new Configuration().configure().buildSessionFactory();
		
		Session s = f.openSession();
		
		Transaction tx = s.beginTransaction();
		
		Orders o = new Orders();
		
		o.setID(1234);
		o.setOrderDate("10/02/2021");
		o.setOrderName("Red Roses");
		o.setCustomerId(31312);
		o.setTotalAmount(200.0);
		
		s.save(o);
		
		tx.commit();
		System.out.println("Values Inserted");
	}

}
