package libraryManagement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();  
        Session session = sessionFactory.openSession();  
        session.beginTransaction();  
          
        BookDetails book = new BookDetails();  
        book.setIsbn(1001);  
        book.setTitle("java complete refference");  
        book.setAuthor("Herbert Schildt");
        book.setstatus("Available");
        session.save(book);  
        session.getTransaction().commit();  
          
        session.close();
	}

}
