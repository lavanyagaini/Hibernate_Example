package youtube_hibernate_1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlienNames an=new AlienNames();
		an.setFname("Lavanya");
		an.setLname("Gaini");
		an.setMname("Mallesh");
		
		Alien a1=new Alien();
		a1.setId(5);
		a1.setName(an);
		
		a1.setColor("black");
		
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("Lavanya");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tranaction=manager.getTransaction();
		
		tranaction.begin();
		manager.persist(a1);
		
		//a1=manager.find(Alien.class,1);
		tranaction.commit();
		
		System.out.println(a1);
	}

}
