package HibApplication;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Application {

	public static void main(String[] args) {
		
		SessionFactory fact=new Configuration().configure().buildSessionFactory();

		Session session=fact.openSession();
		Transaction trans=session.beginTransaction();
		
		
		Shop shop= new Shop();
		shop.setName("imax");
		
		Manager manager1 = new Manager();
		Manager manager2= new Manager();
		Manager manager3= new Manager();
		
		manager1.setName("keshav");
		manager2.setName("ravi");
		manager3.setName("harsha");
		
		manager1.setShop(shop);
		manager2.setShop(shop);
		manager3.setShop(shop);
		
		List<Manager> managers= new ArrayList<>();
		managers.add(manager1);
		managers.add(manager2);
		managers.add(manager3);
		
		
		
		Flowers flowers1 = new Flowers();
		Flowers flowers2 = new Flowers();
		
		
		List<Flowers> flowers = new ArrayList<>();
		
		flowers1.setFlowerType("red rose");
		flowers1.setSales(50);
		flowers1.setShop(shop);
		flowers2.setShop(shop);
		
		
		flowers2.setFlowerType("white rose");
		flowers2.setSales(30);
		shop.setManagers(managers);
		shop.setFlowers(flowers);
		
		session.save(shop);
		session.save(flowers1);
		session.save(flowers2);
		session.save(manager1);
		session.save(manager2);
		session.save(manager3);
		
		
		trans.commit();
		session.close();
	
		
	}

}
