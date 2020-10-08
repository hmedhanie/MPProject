package otherClasses;

import java.util.Scanner;

import controller.SystemController;

public class Main {
	
	private static SystemController systemController;
	
	 public Main() {
		super();
		systemController = new SystemController(this);
	}
	


	public static void main(String[] args) {
		

		// *************** Interactive Console *********************
		Scanner sc = new Scanner(System.in);
		String input = null;
		String userID = null;
		String pswd = null;
		String notValid = "Please enter a valid input. ";

		System.out.println("*********This is your login screen.************");
		System.out.println("Please enter your User ID");

		if (sc.hasNext()) {
			userID = sc.next();
		} else {
			System.out.println(notValid);
		}

		// TODO: include the searchUsername mth and searchPswd
		// if Username found
		if (systemController.searchUsername(input)) {
			System.out.println("Please enter your Password");

			if (sc.hasNext()) {
				pswd = sc.next();
			} else {
				System.out.println(notValid);
			}

			if (systemController.matchPswd(userID, pswd)) {
				// return Authorization
				int authorization = systemController.authorization(userID); // returns either 0/1 or name

				if (authorization == 0) {
					System.out.println("You are a Librarian");
					System.out.println("You are authorized to checkout books.");
					librarian(sc, input, notValid);
				} else if (authorization == 1) {
					System.out.println("You are an Administrator");
					System.out.println("You are authorized to add member and add books.");
					Administrator(sc, input, notValid);
				} else {
					System.out.println("You are both an Administrator and a Librarian");
					System.out.println("Do you want to continue as Administrator or Librarian? A/L");

					if (sc.hasNext()) {
						input = sc.next();
					} else {
						System.out.println(notValid);
					}

					if (input.equalsIgnoreCase("A")) {
						Administrator(sc, input, notValid);
					} else if (input.equalsIgnoreCase("L")) {
						librarian(sc, input, notValid);
					} else {
						System.out.println(notValid);
					}

				}
			}

		} else {
			System.out.println("Your User Name is invalid" + notValid);
		}

	}

	
	
	public static void librarian(Scanner sc, String input, String notValid) {
//		String memberID = null;
		
		System.out.println("Do you have the library member's ID and the book's isbn number?Y/N");
		input = sc.next();
		
		if(input.equalsIgnoreCase("Y")) {
			System.out.println("Please enter the library member's ID");
//			input = sc.next();
			
			if(sc.hasNext()) {
				input = sc.next();
			} else {
				System.out.println(notValid); //TODO include another chance to accept the correct entry  
			}
			
			
			if(!(null == systemController.searchMember(input))) {
				String memberId = input;
				System.out.println("Please enter the book's isbn Number");
				
				int inputIsbn = 0000;
				
				if(sc.hasNextInt()) {
					inputIsbn = sc.nextInt();
				} else {
					System.out.println(notValid);
				}

				if(!(null == systemController.searchBook(inputIsbn))) {
					
					systemController.checkOutBook(memberId, inputIsbn);
				}else {
					System.out.println(notValid + "Please enter a correct isbn Number"); //TODO include another chance to accept the correct entry
				}
			}else {
				System.out.println("The library member doesn't exist. Please input a registered member.");
			}
			
			
		}else {
			System.out.println("Please get the library member's ID and the book's isbn number "
					+ "first before proceeding ");
		} 
	
		
	}

	public static void Administrator(Scanner sc, String input, String notValid) {
		System.out.println("Do you want to add member or add books? "
				+ "Please enter 'M' to add member or enter 'B' to add books.");
		input = sc.next();
		
		if(input.equalsIgnoreCase("M")) {
			String FirstName = null; String LastName = null; String memberID = null; String TelephoneNumber = null;
			String Street = null; String City = null; String State = null; int Zip= (Integer) null;
//			FirstName, LastName, TelephoneNumber, Street, City, State, Zip = null;
			String[] tempArray;
			
			System.out.println("Please enter the library member's credentials");
			System.out.println("This include: Student ID, First Name, Last Name, Telephone Number and Address" );
			System.out.println("Please first enter First and Last Name");
			
			input = sc.next();
			
			if(sc.hasNext()) {
				input = sc.next();
				tempArray = input.split(" ");
				FirstName = tempArray[0];
				LastName = tempArray[1];			
			} else {
				System.out.println(notValid); //TODO include another chance to accept the correct entry  
			}
			
			System.out.println("Please enter Member ID");
			input = sc.next();
			
			if(sc.hasNext()) {
				input = sc.next();
				memberID = input;
			} else {
				System.out.println(notValid); //TODO include another chance to accept the correct entry  
			}
			
			System.out.println("Please enter Telephone Number");
			input = sc.next();
			
			if(sc.hasNext()) {
				input = sc.next();
				TelephoneNumber = input;
			} else {
				System.out.println(notValid); //TODO include another chance to accept the correct entry  
			}
			
			System.out.println("Please now enter Address");
			System.out.println("Address includes: Street, City, State, and Zip. "
					+ "Please enter all with separated with white space" );
			input = sc.next();
			
			if(sc.hasNext()) {
				input = sc.next();
				tempArray = input.split(" ");
				Street = tempArray[0];
				City = tempArray[1];	
				State = tempArray[2];
				Zip = Integer.parseInt(tempArray[3]);
			} else {
				System.out.println(notValid); //TODO include another chance to accept the correct entry  
			}
			
			Address address = new Address(Street, City, State, Zip);	
			new LibraryMember(FirstName, LastName, TelephoneNumber, address, memberID);
			
			}else if (input.equalsIgnoreCase("B")) {
			//Check Chala's work
			//Assume book in dataAccess.saveBook(book) is a BookCopy object

			
			System.out.println("Please enter the isbn Number of the book(of the book copy) to be added.");
			input = sc.next();
			
			if(sc.hasNext()) {
				int isbn = Integer.parseInt(input);
				Book book = systemController.searchBook(isbn);

				 if (book != null) {
					new BookCopy(book);
				 	displaySuccess();
				}else{
				 System.out.println("There is no book that is recorded witht the given isbn.");
				}

			
			} else {
				System.out.println(notValid + "Please enter in isbn format"); //TODO include another chance to accept the correct entry  
			}
			
		}else {
			
		System.out.println(notValid + "Please enter either 'M' or 'B' . ");
		}
	}
	
	 public static void displaySuccess() {
		 System.out.println("Success");
	 }
}
