
/* By: Khursheed Alam Khan								Assignment#1: Telephone Book
 * Roll# 20i-0496
 * Section: SE-R
 */

										// This is the DynamicData class. I have associated Contact class in this class.
										// This class contains:
										// My Custom Made Dynamic Array, Insertion Method, Deletion Method, Bubble Sort and Binary Search Method (By ID, Names and Recent Birthdays)
										// Please Note that for sorting I have used BUBBLE SORT and for searching I have used BINARY SEARCH.

import java.util.Scanner;

public class DynamicData 
{

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
  
	private static Contact con[]; // Association of Contact Class
    
    static Scanner cin = new Scanner(System.in); // for numbers
	static Scanner in = new Scanner(System.in);  // for strings
   
  
    private static int count; // count = number of elements in the array
    private static int size;  // size = the length or the size of the array
    
    
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
	
	// Default Constructor
  
    public DynamicData()
    {
     
        con=new Contact[1];
        
        count = 0;
        size = 1;
    }
    
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
    
    // Getters and Setters
    
    public int getCount() 
    {
		return count;
	}





	public void setCount(int count) 
	{
		this.count = count;
	}





	public int getSize() 
	{
		return size;
	}





	public void setSize(int size) 
	{
		this.size = size;
	}

    // End of Getters and Setters
    
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ 
    
																// My custom Dynamic Array (Function 1-5)
	
    // #1: function to insert/add contacts to the end of the array memory 
  
    public Contact[] add()
    {
  
    	 System.out.println("");
		 System.out.println("Adding Contact !!!");
		 System.out.println("");
		 
		 
		 
		    System.out.println("");
			
			System.out.println("Please enter an ID: ");
			int id = in.nextInt();
			System.out.println("");
			
			System.out.println("Please enter First Name: ");
			String fName = cin.nextLine();
			System.out.println("");
			 
			System.out.println("Please enter Last Name: ");
			String lName = cin.nextLine();
			System.out.println("");
			
			System.out.println("Please enter Phone Number: ");
			String phone = cin.nextLine();
			System.out.println("");
			
			System.out.println("Please enter Country: ");
			String country = cin.nextLine();
			System.out.println("");
			
			System.out.println("Please enter City: ");
			String city = cin.nextLine();
			System.out.println("");
			
			System.out.println("Please enter Mobile Phone: ");
			String mPhone = cin.nextLine();
			System.out.println("");
			
			System.out.println("Please enter Home Address: ");
			String address = cin.nextLine();
			System.out.println("");
			
			System.out.println("Please enter the Birth Date: ");
			int bDay = in.nextInt();
			System.out.println("");
			
			System.out.println("Please enter the Birth Month: ");
			int bMonth = in.nextInt();
			System.out.println("");
			
			System.out.println("Please enter the Birth Year: ");
			int bYear = in.nextInt();
			System.out.println("");
			
			System.out.println("Please enter Website name: ");
			String website = cin.nextLine();
			System.out.println("");
			
			System.out.println("Please enter Company Name: ");
			String company = cin.nextLine();
			System.out.println("");

        // checks if size is equal to count
        if (count == size) 
        {
            growSize(); // increases size of array by doubling it
        }
        
        // now inserting the data into the array
        con[count] = new Contact(id, fName, lName, country, city, bDay, bMonth, bYear, address, phone, mPhone, website, company );
        count++;
        System.out.println("Data Successfully Added!");
        System.out.println();
        return con;
    }// end of function #1
  
   
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    
	// #2: function makes size double of array
    public void growSize()
    {
    	Contact temp[] = null;
        if (count == size) 
        {
            // temp will have double the size of the original array; stores array's elements

        	temp = new Contact[size*2];
            {
                for (int i = 0; i < size; i++)
                {
                    // copy con values into temp
              
                	temp[i]=con[i];
                }
            }
        }
  
        // Initializing temp into a variable again for the function to work
        con = temp;
         
        // doubling the size of the array
        size = size * 2;
    }// end of function #2
    
    
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

  
    // #3: function shrink size of array to remove unwanted null memory/slots
    public static void shrinkSize()
    {
       
        Contact temp[] = null;
        if (count > 0) 
        {
  
            // Here temp = count size array which stores array elements
        	
        	temp = new Contact[count];
            for (int i = 0; i < count; i++) {
  
                // copy value of con into temp
            	
            	temp[i]=con[i];
            }
  
            size = count;
  
            // temp is initialized into variable again for the function to work
            
            con = temp;
        }
    }// end of function #3

    
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    
   
    // #4: function remove last element or put zero at last index
    public static void remove()
    {
        if (count > 0)
        {
        	con[count - 1] = null;
            count--;
        }
    }// end of function #4
   
    
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
    
    // #5: general function to display/view records in data base
    public void display()
	{
		
		try
		{
			System.out.println();
			for(int i =0; i<con.length;i++)
			{
				System.out.println(con[i]+" index: "+i);
				System.out.println();
			}
		}
		catch(Exception e)
		{
			System.out.println("");
		}
			
	}// end of function #5
    

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
    
    																// Sorting Functions (Function 6-8) ==> I have used Bubble Sorting Method
    
    // #6: Function to Sort by ID
    public static void sortBubbleByID() 
	{ 
		try
		{
		
	        int n = con.length;  
	        Contact temp;  
	        for(int i=0; i < n; i++)
	        {  
	                 for(int j=1; j < (n-i); j++)
	                 {  
	                   if(con[j-1].getId() > con[j].getId())
	                    {  
	                	   temp = con[j-1];
	                	   con[j-1] = con[j];
	                	   con[j]=temp;
	                    } 
	                          
	                 }  
	        } 
		}
		catch(Exception e)
		{
			System.out.println("");
		}
	}// end of function #6
    
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
    
    // #7: Function to Sort by Name
    public static void sortByName()
 	{

		try
		{
		
	        int n = con.length;  
	        Contact temp;  
	        for (int j = 0; j < n; j++) 
	        {
	        	   for (int i = j + 1; i < n; i++) 
	        	  {
	        		// Here we are comparing the adjacent strings
		     		if (con[i].getfName().compareTo(con[j].getfName()) < 0) 
		     		{
		     			temp = con[j];
		     			con[j] = con[i];
		     			con[i] = temp;
		     		}
	     	   }
	        }
		}
	        
	        
		catch(Exception e)
		{
			System.out.println("");
		}
 	}// end of function #7
    
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    

 // #8: Function to Sort by Recent Birthdays
    public static void sortBubbleByBirthDate() 
	{ 
		try
		{
		
	        int n = con.length;  
	        Contact temp;  
	        for(int i=0; i < n; i++)
	        {  
	                 for(int j=1; j < (n-i); j++)
	                 {  
	                   if((con[j-1].getbDay() > con[j].getbDay()) || (con[j-1].getbMonth() > con[j].getbMonth()))
	                    {  
	                	   temp = con[j-1];
	                	   con[j-1] = con[j];
	                	   con[j]=temp;
	                    } 
	                          
	                 }  
	        } 
	        System.out.println("Successfully Sorted the Record by Recent Birth Days!");
	        System.out.println();
		}
		catch(Exception e)
		{
			System.out.println("");
		}
	}// end of function #8
    
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
    
    
    													// Binary Search Functions (Function 9-12)
    
    
 //#9: Function to Binary Search by Name
    public static int searchBinaryByName(String fName)  // fName = key
 	{
 	    int found=-1;
 	    int left = 0;
 	    //set last to last elements in array
 	    int right=con.length-1;
 	    //calculate mid of the array
 	    int mid = (left + right)/2; 
 	    //while first and last do not overlap
 	    
 	    int temp = con[mid].getfName().compareTo(fName);
 	    
 	    while( left <= right )
 	    {
 	        //if the mid < key, then key to be searched is in the first half of array
 	        if ( temp < 0  )
 	        {
 	            left = mid + 1;
 	        }
 	        else if ( temp == 0 )
 	        {
 	            //if key = element at mid, then print the location
 	            System.out.println("Element is found at index: " + mid);
 	            found=mid;
 	            System.out.println("");
 	            System.out.println(con[mid]);
 	            System.out.println();
 	            return mid;

 	        }else
 	        {
 	            //the key is to be searched in the second half of the array
 	            right = mid - 1;
 	        }
 	        mid = (left + right)/2; 
 	    }
 	    //if first and last overlap, then key is not present in the array
 	    if ( left > right )
 	    {
 	        System.out.println("Element is not found!");
 	        return  found;
 	    }
 	    return found;
 	}// end of function #9
 	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
    
 	
  //#10: Function to Binary Search by ID
 	public static int searchBinaryID(int id)  // id = key
 	{
 	    int found=-1;
 	    int left = 0;
 	    //set last to last elements in array
 	    int right=con.length-1;
 	    //calculate mid of the array
 	    int mid = (left + right)/2;
 	    //while first and last do not overlap
 	    while( left <= right )
 	    {
 	        //if the mid < key, then key to be searched is in the first half of array
 	        if ( con[mid].getId() < id )
 	        {
 	            left = mid + 1;
 	        }
 	        else if ( con[mid].getId() == id )
 	        {
 	            //if key = element at mid, then print the location
 	            System.out.println("Element is found at index: " + mid);
 	            found=mid;
 	            System.out.println("");
	            System.out.println(con[mid]);
	            System.out.println();
 	            return mid;

 	        }else
 	        {
 	            //the key is to be searched in the second half of the array
 	            right = mid - 1;
 	        }
 	        mid = (left + right)/2;
 	    }
 	    //if first and last overlap, then key is not present in the array
 	    if ( left > right )
 	    {
 	        System.out.println("Element is not found!");
 	        return  found;
 	    }
 	    return found;
 	}// end of function 10
 	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
	

 	//#11: Function to Remove Data by Binary Search through ID	
 	public static int searchBinaryIDAndRemove(int id)  // id = key
 	{
 	    int found=-1;
 	    int left = 0;
 	    //set last to last elements in array
 	    int right=con.length-1;
 	    //calculate mid of the array
 	    int mid = (left + right)/2;
 	    //while first and last do not overlap
 	    while( left <= right )
 	    {
 	        //if the mid < key, then key to be searched is in the first half of array
 	        if ( con[mid].getId() < id )
 	        {
 	            left = mid + 1;
 	        }
 	        else if ( con[mid].getId() == id )
 	        {
 	            //if key = element at mid, then print the location
 	            System.out.println("Element is found at index: " + mid);
 	            found=mid;
 	            
 	            System.out.println();
 	            System.out.println("Removing the element....");
 	            System.out.println();
 	            
 	            int temp = con[mid].getId();
 	            con[mid].setId(con[size-1].getId());
 	            con[size-1].setId(temp);
 	            
 	            remove();
 	            
 	            System.out.println("Successfully Removed!");
 	            System.out.println();
 	            return mid;
 	            

 	        }else
 	        {
 	            //the key is to be searched in the second half of the array
 	            right = mid - 1;
 	        }
 	        mid = (left + right)/2;
 	    }
 	    //if first and last overlap, then key is not present in the array
 	    if ( left > right )
 	    {
 	        System.out.println("Element is not found!");
 	        return  found;
 	    }
 	    return found;
 	}// end of function #11
 	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
	 
 	//#12: Function to Update Data by Binary Search through ID	
 	public static int searchBinaryIDAndUpdate(int id) // id = key
 	{
 	    int found=-1;
 	    int left = 0;
 	    //set last to last elements in array
 	    int right=con.length-1;
 	    //calculate mid of the array
 	    int mid = (left + right)/2;
 	    //while first and last do not overlap
 	    while( left <= right )
 	    {
 	        //if the mid < key, then key to be searched is in the first half of array
 	        if ( con[mid].getId() < id )
 	        {
 	            left = mid + 1;
 	        }
 	        else if ( con[mid].getId() == id )
 	        {
 	            //if key = element at mid, then print the location
 	            System.out.println("Element is found at index: " + mid);
 	            found=mid;
 	            
 	            System.out.println(con[mid]);
 	            System.out.println("");
 	            System.out.println("Enter new first name: ");
 	            String fName = in.next();
 	            System.out.println();
 	            
 	            System.out.println("Enter new last name: ");
 	            String lName = in.next();
 	            System.out.println();
 	            
 	            con[mid].setfName(fName);
 	            con[mid].setlName(lName);
 	            System.out.println();
 	            System.out.println("Successfully Updated the Names!");
 	            System.out.println();
 	            return mid;
 	            

 	        }else
 	        {
 	            //the key is to be searched in the second half of the array
 	            right = mid - 1;
 	        }
 	        mid = (left + right)/2;
 	    }
 	    //if first and last overlap, then key is not present in the array
 	    if ( left > right )
 	    {
 	        System.out.println("Element is not found!");
 	        return  found;
 	    }
 	    return found;
 	}// end of function #12
 	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
	
}
