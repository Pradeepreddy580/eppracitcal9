package main;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.*;


public class JoinQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory f =new Configuration().configure().buildSessionFactory();
		
		Session s = f.openSession();
		
		Transaction tx = s.beginTransaction();
		
		Query query = s.createQuery("select o.OrderName, o.TotalAmount, c.FirstName, c.LastName, c.City, c.Country from Orders o,Customers c  WHERE c.id = o.CustomerId");
		
		System.out.println("Common values in both 'Orders' And 'Customers'");
		
		List<Object[]> es= (List<Object[]>)query.list();
	     for(Object[] e: es){
	         String OrderName = (String)e[0];
	         double TotalAmount = (double)e[1];
	         String FirstName = (String)e[2];
	         String LastName = (String)e[3];
	         String city = (String)e[4];
	         String country = (String)e[5];
	         System.out.println("Ordername : "+OrderName);
	         System.out.println("TotalAmount : "+TotalAmount);
	         System.out.println("FirstName : "+FirstName);
	         System.out.println("LastName : "+LastName);
	         System.out.println("city : "+city);
	         System.out.println("country : "+country);
	         System.out.println("\n");
	         
	     }
	}
}
