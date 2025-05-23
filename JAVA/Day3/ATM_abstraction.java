package Day3;

abstract class atm
{
	abstract void withdraw(int amount);
	void insertcard()
	{
		System.out.println("Card inserted");
	}
	void pin(int pin)
	{
		System.out.println("pin entered: "+pin);
	}
}
class SBI extends atm{
	void withdraw(int amount)
	{
		System.out.println("amount withdrawed is :"+amount);
	}
}
public class ATM_abstraction {
	public static void main(String[]args)
	{
		atm a =new SBI();
		a.insertcard();
		a.pin(4562);
		a.withdraw(1000);
	}

}
