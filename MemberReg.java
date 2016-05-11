package libraryManagement;

public class MemberReg {
	private int Id;
	private String Name,Password,Email,Branch,Gender;
	
	public int Id(){
		return Id;
	}
	public String Name(){
		return Name;
	}
	public String Password(){
		return Password;
	}
	public String Email(){
		return Email;
	}
	
	public void setId(int Id){
		this.Id=Id;
	}
	public void Name(String Name){
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
