package libraryManagement;



import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	 private static SessionFactory sf;
	
	private HibernateUtil(){
		
	}
	
	public static SessionFactory getFactory(){
		if(sf==null){
			Configuration cfg = new Configuration().configure();
			sf = cfg.buildSessionFactory(
					new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build()
					);
			
			
			
		}
		return sf;
	}

}
