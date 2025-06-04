package Day12;

import java.util.Optional;

class library
{
	Optional<String> title;
	library(String title)
	{
		this.title=Optional.ofNullable(title);
	}
	
	void check()
	{
		System.out.println( "Book Borrowed: "+title.orElse("No book Borrowed"));
	}
	
}

public class BookBorrowing {
	public static void main(String[] args) {
		library l=new library("java");
		l.check();
		library l1=new library(null);
		l1.check();
		
	}

}
