package libraryManagement;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookDetails {
	@Id
		private int ISBN;
		private String Title,Author,AvailStatus;
		
		public int getIsbn(){
			return ISBN;
		}
		public String getTitle(){
			return Title;
		}
		public String getAuthor(){
			return Author;
		}
		public String getstatus(){
			return AvailStatus;
		}
		
		public void setIsbn(int ISBN){
			this.ISBN=ISBN;
		}
		public void setTitle(String Title){
			this.Title=Title;
		}
		public void setAuthor(String Author){
			this.Author=Author;
		}
		public void setstatus(String AvailStatus){
			this.AvailStatus=AvailStatus;
		}
		
}
