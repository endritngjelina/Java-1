package ngjelina6;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This program contains a data class named Book and executable class named TestBook
//It contains an array with 6 Book objects
//It displays the most expensive book after the discounts

public class Ngjelina6program1 {

	    //Book class
		class Book{
			//Set title, author, price and pages
		    String title;
		    String author;
		    double price;
		    int pages;
		    
		    
		    public static int numBooks = 0;
		    public Book() {
		    	numBooks++;
		    }
		    public Book(String _title, String _author, double _price, int _pages) {
		    	title = _title;
		    	author = _author;
		    	price = _price;
		    	pages = _pages;
		    	numBooks++;
		    }
		    public void setTitle(String _title) {
		    	title = _title;
		    }
		    private String getTitle(){
		        return title;
		    }
		    private String getAuthor(){
		        return author;
		    }
		    private double getPrice(){
		        return price;
		    }
		    private int getPages(){
		        return pages;
  }
		    public String toString() {
		    	String newString = "Book title" + title + ", author" + author + ", price" + price + ", pages" + pages;
		    	return newString;
		    }
}
		//TestBook class
		class TestBook{
			public static void main (String[] args) {
				
				//books array
				Book[] books = new Book[6];
				books[0] = new Book("Introduction to Java programing and data structures" , "Liang", 145.00, 1320);
				books[1] = new Book("IT " , "Stephen Kings",56, 1034);
				books[2] = new Book("Animal Farm" , "Gerogre Orwell", 8.99, 112);
				books[3] = new Book("1984" , "George Orwell", 12.47, 328);
				books[4] = new Book();
				books[5] = new Book();
				
				//For each loop 
				for (Book individualBook:books) {
					System.out.println(individualBook.toString());
		}
				//Call method
				finishArray(books);	
				Book newBook = reduceBooks();
				
				//For each loop for books
				for (Book individualBook:books) {
					
					//display Books
					System.out.println(individualBook.toString());
		}
			}
			//Void method for Finish Array
			public void finishArray(Book[] books) {
				books[4].setTitle(" The Overstory");
				books[4].setAuthor(" Richard Powers");
				books[4].setPages(356);
				books[4].setPrice(43.99);
				books[5].setTitle("Celestial Bodies");
				books[5].setAuthor("Jokha Alharthi");
				books[5].setPages(129);
				books[5].setPrice(39.99);
		}	
	}
}