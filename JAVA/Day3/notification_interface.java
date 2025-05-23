package Day3;

interface notification {
	void sent(String to, String message);
}
class emailNotification implements notification{
	public void sent(String to,String message) {
		System.out.println("Sending Email to "  + to + " : "+message);
	}
}
class smsnotification implements notification{
	public void sent(String to,String message) {
		System.out.println("Sending sms to "  + to + " : "+message);
	}
}
public class notification_interface{
	public static void main(String[]args)
	{
		notification en =new emailNotification();
		en.sent("ram@gmail.com","it is email notification");
		
		
		notification sn =new smsnotification();
		sn.sent("124134","this is sms notification");
	}
}
