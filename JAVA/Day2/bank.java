package Day2;

public class bank {
	static int balance;
	int amount;
	static int count;
	
	public bank()
	{
		count++;
	}
	private int getCount()
	{
		return count;
	}
	
	private void deposit(int amount)
	{
		 balance=balance+amount;
	}
	protected void withdraw(int amount)
	{
		 balance=balance-amount;
	}
	void display()
	{
		System.out.println("the balnce in the account  :" +balance);
	}
	public static void main(String[] args)
	{
		System.out.println("the static balance is "+bank.balance);
		bank b=new bank();
		bank.balance=5000;
		b.deposit(5000);
		b.withdraw(1000);
		b.withdraw(500);
		b.deposit(50000);
		b.display();
		System.out.println("the static balance is "+bank.balance);
		bank b1 = new bank();
		bank.balance=10000;
		b1.deposit(10000);
		b1.withdraw(3000);
		b1.display();
		
		System.out.println("the static balance is "+bank.balance);
		System.out.println("the count of objects is " +  b1.getCount());
		System.out.println("the count of objects is " +  new bank().getCount());
		
	}
}
