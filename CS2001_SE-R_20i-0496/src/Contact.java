
/* By: Khursheed Alam Khan								Assignment#1: Telephone Book
 * Roll# 20i-0496
 * Section: SE-R
 */

			     // This is the Contact class which contains: Attributes (Details of the Person) , Constructor, Getter & Setter methods, and an Override String toString function

public class Contact 
{
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
	
	private int id;
	private String fName;
	private String lName;
	private String address;
	private String phone;
	private String country;
	private String city;
	private String website;
	private String company;
	private String mPhone;
	
	private int bDay;
	private int bMonth;
	private int bYear;
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
	
	   // default constructor
		Contact()
		{
			
			this.fName=null;
			this.id=0;
			this.lName=null;
			this.bDay=0;
			this.bMonth=0;
			this.bYear=0;
			this.city=null;
			this.phone=null;
			this.mPhone=null;
			this.country=null;
			this.address=null;
			this.website=null;
			this.company=null;
			

		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
		
		// Parameterized constructor
		
		Contact(int id, String fName, String lName, String country, String city, int bDay, int bMonth, int bYear, String address, String phone, String mPhone, String website, String company )
		{
			this.id=id;
			
			this.fName=fName;
			
			this.lName=lName;
			
			this.country=country;
			
			this.city=city;
			
			this.bDay=bDay;
			
			this.bMonth=bMonth;
			
			this.bYear=bYear;
			
			this.address=address;
			
			this.phone=phone;
			
			this.mPhone=mPhone;
			
			this.website=website;
			
			this.company=company;
			
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
	
	// Getters and Setters
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	
	//
	public String getfName() 
	{
		return fName;
	}
	public void setfName(String fName) 
	{
		this.fName = fName;
	}
	
	//
	public String getlName() 
	{
		return lName;
	}
	public void setlName(String lName) 
	{
		this.lName = lName;
	}
	
	//
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	//
	public String getPhone() 
	{
		return phone;
	}
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}
	
	//
	public String getCountry() 
	{
		return country;
	}
	public void setCountry(String country) 
	{
		this.country = country;
	}
	
	//
	public String getCity() 
	{
		return city;
	}
	public void setCity(String city) 
	{
		this.city = city;
	}
	
	//
	public String getWebsite() 
	{
		return website;
	}
	public void setWebsite(String website) 
	{
		this.website = website;
	}
	
	//
	public int getbDay() 
	{
		return bDay;
	}
	public void setbDay(int bDay) 
	{
		this.bDay = bDay;
	}
	
	//
	public String getCompany() 
	{
		return company;
	}
	public void setCompany(String company) 
	{
		this.company = company;
	}
	
	//
	public String getmPhone() 
	{
		return mPhone;
	}
	public void setmPhone(String mPhone) 
	{
		this.mPhone = mPhone;
	}
	
	
	//
	public int getbMonth() 
	{
		return bMonth;
	}
	public void setbMonth(int bMonth) 
	{
		this.bMonth = bMonth;
	}
	
	//
	public int getbYear() 
	{
		return bYear;
	}
	public void setbYear(int bYear) 
	{
		this.bYear = bYear;
	}
	// End of Getters and Setters
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
	
	
	@Override
	public String toString()
	{
		return "ID: "+this.id+" | Name: "+this.fName+" "+this.lName+" | Birth Day: "+this.bDay+"/"+this.bMonth+"/"+this.bYear+
				" | Country: "+this.country+" | City: "+this.city+" | Phone: "+this.phone+" | Mobile Phone: "+this.mPhone+
				" | Address: "+this.address+" | Company: "+this.company+" | Website: "+this.website+" |"; 
	}
	
}
