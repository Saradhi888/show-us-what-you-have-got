package libraryManagement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getFactory();  
        Session session = sessionFactory.openSession();  
        session.beginTransaction();  
          
        BookDetails book = new BookDetails();  
        book.setIsbn(1001);  
        book.setTitle("java complete refference");  
        book.setAuthor("Herbert Schildt");
        book.setstatus("Available");
        session.save(book);  
        
        MemberReg member = new MemberReg();
        member.setId(Integer.parseInt("10E31A05A9"));
        member.setName("vijay saradhi");
        member.setEmail("vijay.saradhi888@gmail.com");
        member.setGender("male");
        member.setBranch("CSE");
        member.setPassword("vijayvijay");
        
        session.getTransaction().commit();  
          
        session.close();
	}

}
