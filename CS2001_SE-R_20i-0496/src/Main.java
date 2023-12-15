
/* By: Khursheed Alam Khan								Assignment#1: Telephone Book
 * Roll# 20i-0496
 * Section: SE-R
 */

								// This is the Main class.
								// Please read the note I have mentioned before using my program

								// Please also remember one very important thing:
								// * After you delete a data using the option 2, Please remember to use option 5 or 7 to Sort the data before using any other options
								//   This will help to bubble sort the data and will also remove Null memories (left by deleted data) which will avoid null pointer exception error.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		DynamicData dd = new DynamicData();
		
		Scanner cin = new Scanner(System.in); // for numbers
		Scanner in = new Scanner(System.in);  // for strings
		
		int option;
		
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("|          Welcome to Khursheed's Telephone Directory Book                                                                                                                              |");
		System.out.println("|                         Section: SE-R                                                                                                                                                 |");
		System.out.println("|                         Roll# 20i-0496                                                                                                                                                |");
		System.out.println("|                                                                                                                                                                                       |");
		System.out.println("|           Important NOTE (Please Read before using my program):                                                                                                                       |");
		System.out.println("|                                                                                                                                                                                       |");
		System.out.println("|    * Birth Date MUST be in INTEGER (any value between 1-31)                                                                                                                           |");
		System.out.println("|                                                                                                                                                                                       |");
		System.out.println("|    * Birth Month MUST be in INTEGER (any value between 1-12)                                                                                                                          |");
		System.out.println("|                                                                                                                                                                                       |");
		System.out.println("|    * Birth Year MUST be in INTEGER (any value between 1900-2021)                                                                                                                      |");
		System.out.println("|                                                                                                                                                                                       |");
		System.out.println("|    * ID MUST also be in INTEGER                                                                                                                                                       |");
		System.out.println("|                                                                                                                                                                                       |");
		System.out.println("|    * Everything else is in Strings                                                                                                                                                    |");
		System.out.println("|                                                                                                                                                                                       |");
		System.out.println("|    * After deleteing a data using Delete option (i.e 2) Please Remember to bubble sort the data again by pressing option 5 or 7, other wise it will give null pointer exception error |");
		System.out.println("|      Because when you will bubble sort the data right after deleting a data, it will help to sort the data in ascending order and will also remove Null memories left by deleted data |");
		System.out.println("|                                                                                                                                                                                       |");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		
		do
		{
			System.out.println("   1.   Insert/add phone data to my data base");
			System.out.println("   2.   Delete a number in data base");
			System.out.println("   3.   View records in the data base");
			System.out.println("   4.   Update records in data base");
			System.out.println("   5.   Sort records in data base");
			System.out.println("   6.   Search record in data base");
			System.out.println("   7.   Recent Birthdays of the records in data base");
			System.out.println("   0.   Quit");
			
			System.out.println("");
			
			System.out.println("Choose your option: ");
			option=cin.nextInt();
			
			switch(option)
			{
				case 1:
				{
					// Adding Data to the Data Base
					
					dd.add();
					break;
				}
				
				case 2:
				{
					// Delete data by its ID
					
					System.out.println("Enter ID: ");
					int id = cin.nextInt();
					dd.searchBinaryIDAndRemove(id);
					System.out.println();
					
					break;
				}
				
				case 3:
				{
					// View Records in Data Base
					
					dd.display();
					System.out.println();
					System.out.println("Size of array: " + dd.getSize());
			        System.out.println("No of elements in array: " +dd.getCount());
			        System.out.println();
					break;
				}
				
				case 4:
				{
					// Update Records in Data Base
					
					System.out.println("Updating Record!");
					System.out.println();
					
					dd.display();
					System.out.println();
					
					System.out.println("Select ID to update name: ");
					int id=cin.nextInt();
					dd.searchBinaryIDAndUpdate(id);
					System.out.println();
					break;
				}
				
				case 5:
				{
					// Sort Records in Data Base (By Bubble Sort)
					
					System.out.println("Sorting Data Base!");
					System.out.println("");
					System.out.println("1. Sort by ID: ");
					System.out.println("2. Sort by Name: ");
					System.out.println();
					System.out.println("Selection option");
					int opt = cin.nextInt();
					
					switch(opt)
					{
						case 1:
						{
							dd.shrinkSize(); // to remove memory having null elements to stop null pointer exception problem
							dd.sortBubbleByID();
							System.out.println();
							System.out.println("sucessfully Sorted by ID!");
							System.out.println();
							break;
						}
						
						case 2:
						{
							dd.shrinkSize(); // to remove memory having null elements to stop null pointer exception problem
							dd.sortByName();
							System.out.println();
							System.out.println("sucessfully Sorted by Name!");
							System.out.println();
							break;
						}
						
						default:
						{
							System.out.println("Incorrect Option Selected!");
							break;
						}
					}
					break;
				}
				
				case 6:
				{
					// Search Record in Data Base (By Binary Search)
					
					System.out.println();
					System.out.println("1. Binary Search by ID ");
					System.out.println("2. Binary Search by Name ");
					System.out.println();
					System.out.println("Select Option: ");
					int opt = cin.nextInt();
					switch(opt)
					{
						case 1:
						{
							System.out.println("Enter ID: ");
							int id = cin.nextInt();
							dd.searchBinaryID(id);
							System.out.println();
						
							break;
						}
						
						case 2:
						{
							
							System.out.println("Enter First Name: ");
							cin.nextLine();
							String fName=cin.nextLine();
							dd.searchBinaryByName(fName);
							System.out.println();
							
							break;
						}
						
						default:
						{
							//nothing
							System.out.println("Incorrect option Selected!");
							System.out.println();
							break;
						}
					}
					
					break;
					
					
				}
				
				case 7:
				{
					// sort data by recent birth days
					
					dd.shrinkSize(); // to remove memory having null elements to stop null pointer exception problem
					dd.sortBubbleByBirthDate();
					break;
				}
				
				case 0:
				{
					//Quit
					
					break;
				}
 			}
			
		}while(option != 0);
		
		System.out.println("");
		
		System.out.println("Thanks for using Khursheed's Telephone Directory System. I would love to see you again :-)");

	}
	
	

}
