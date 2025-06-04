package Day7;

import java.util.ArrayList;
import java.util.List;

interface notifi
{
	void send();
}
class notification implements notifi
{
	private String email;
	private static String message;
	private long number;

	notification(String email,String message)
	{
		this.email=email;
		this.message=message;
		System.out.println("notification is send by email"+message);
	}
	notification(int number,String message)
	{
		this.number=number;
		this.message=message;
		System.out.println("notification is send by sms"+message);
	}
	notification(String message)
	{
		this.message=message;
		System.out.println("push notification "+message);
	}
	public void send()
	{
		System.out.println("the messagge was "+message);
	}
}
public class bankingapp {
	public static void main(String[] args) {
		List<notification> m =new ArrayList<notification>();
		m.add(new notification("ramram@gamil","attend meeting"));
		m.add(new notification(185085,"atteng the class"));
		m.add(new notification("submit leave"));
		System.out.println(m);

		
	}

}
