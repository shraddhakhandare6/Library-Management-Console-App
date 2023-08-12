package pkg1;
import java.util.*;

public class Homepage {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		int bookId;
		String bookName;
		String author;
		String publishedYear;
		String status = "Available";
		
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("-------------------------------------------------------Welcome to LMS Portal of Quastech-------------------------------------------------------");
		
			System.out.println("| 1.Add Book																       |");
			System.out.println("| 2.Show Available Books														   |");
			System.out.println("| 3.Borrow Books															       |");
			System.out.println("| 4.Return Book																       |");
			System.out.println("| 5.Exit																           |");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println();
			System.out.print("Enter Your Choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice){
				case 1:
				{
					System.out.println("\nPlease enter the details of the new book you want to add");
					System.out.print("Enter Book ID: ");
					bookId = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter Book Name: ");
					bookName = sc.nextLine();
					System.out.print("Enter Author: ");
					author = sc.nextLine();
					System.out.print("Enter Published Year: ");
					publishedYear = sc.nextLine();
					library.add(new Book(bookId, bookName, author, publishedYear, status));
					System.out.printf("Book with ID %d Added Successfully", bookId);
					System.out.println();
					System.out.println();
					
					
					break;
				}
				
				
				case 2:
				{
					System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("| ID                        TITLE                        AUTHOR                        PUBLISHED YEAR                        STATUS            |");
					System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
						for(Book b : library) {
							System.out.println(b.getBookId() + "                         " + b.getBookName() + "                            " + b.getAuthor() + "                             "  + b.getPublishedYear() + "                             " + b.getStatus());
						}
					System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println();
					System.out.println();
				
					break;
				}
				
				case 3:
				{	int borrowId;
					System.out.print("Enter the Book ID of the book you want to borrow: ");
					borrowId = sc.nextInt();
					for(Book b : library) {
					if(b.getBookId() == borrowId) {
							if(b.getStatus().equalsIgnoreCase("Available")) {
								b.setStatus("NOT Available");
								System.out.printf("You have borrowed the %s Book succssfully", b.getBookName());
								System.out.println();
							}
							else {
								System.out.println("This book is NOT AVAILABLE");
							}	
					}
					}
					break;
				}
				
				case 4:
				{
					int returnId;
					System.out.print("Enter the Book ID of the book you want to return: ");
					returnId = sc.nextInt();
					for(Book b : library) {
						if(b.getBookId() == returnId && b.getStatus().equalsIgnoreCase("NOT Available")) {
								b.setStatus("Available");	
								System.out.println("You have successfully returned your borrowed book!!");
						}
						
					}
					
					break;
				}
				
				
				case 5:
				{
					System.out.println("Thank You For Using Quastech's LMS Portal !!");
					System.exit(0);
				}
			}
		}while(true);
	}
}

	
	
	
