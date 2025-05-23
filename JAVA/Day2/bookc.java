package Day2;

public class bookc {
	String title;
	String Author;
	int price;
	
	bookc(String title,String Author,int price)
	{
		this.title=title;
		this.Author=Author;
		this.price=price;
		System.out.println("|title: "+title+" |Author of book :"+Author+"  |price: "+price);
		 
	}
	public static void main(String[]args)
	{
		new bookc("think and grow","ram",700);
		
	}
	

}
