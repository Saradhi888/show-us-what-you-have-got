package libraryManagement;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MemberReg {
	@Id
	private int Id;
	private String Name,Password,Email,Branch,Gender;
	
	public int getId(){
		return Id;
	}
	public String getName(){
		return Name;
	}
	public String getPassword(){
		return Password;
	}
	public String getEmail(){
		return Email;
	}
	public String getBranch(){
		return Branch;
	}public String getGender(){
		return Gender;
	}
	
	
	public void setId(int Id){
		this.Id=Id;
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public void setEmail(String Email){
		this.Email=Email;
	}
	public void setPassword(String Password){
		this.Password=Password;
	}
	public void setBranch(String Branch){
		this.Branch=Branch;
	}
	public void setGender(String Gender){
		this.Gender=Gender;
	}
	

}
