package Day3;
class gettersetter
{
	private long accountnumber;
	private double balance;
	private String name;
	
	//getter and setter method implementation
	//getter
	public long getacc()
	{
		return accountnumber;
	}
	public double getbal()
	{
		return balance;
	}
	public String getname()
	{
		return name;
	}
	//setter implementation
	public void setacc(long accountnumber)
	{
		this.accountnumber=accountnumber;
	}
	public void setbal(double balance)
	{
		if (balance>0)
		{
			this.balance=balance;
		}
		else
		{
			System.out.println("invalid balance");
		}
	}
	public void setname(String name)
	{
		this.name=name;
		
	}

}
public class bank_encapsulation {
	public static void main(String[] args)
	{
		gettersetter a = new gettersetter();
		a.setacc(123456);
		a.setbal(7000);
		a.setname("surya");
		
		System.out.print("the data stored in private variable are using setter method are |name :"+a.getname()+" |accountnumber: "+a.getacc()+ " balance: "+a.getbal());
	}

}
