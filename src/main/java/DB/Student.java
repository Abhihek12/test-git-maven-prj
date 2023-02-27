package DB;

public class Student {

	private int rollNo;
	private String name;
    private long contactNo;
    private String email;
    private String city;
    private int standard;
    
    
   public Student(int rn,String nm,long ph,String em,String ct,int std)
    {
    	rollNo=rn;
    	name=nm;
    	contactNo=ph;
    	email=em;
    	city=ct;
    	standard=std;
    }

	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getContactNo() {
		return contactNo;
	}


	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getStandard() {
		return standard;
	}


	public void setStandard(int standard) {
		this.standard = standard;
	}
	
	public String toString()
	{
		return rollNo+ " "+name+" "+contactNo+" "+city+" "+email+" "+standard ;
	}
	

}
