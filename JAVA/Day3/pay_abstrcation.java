package Day3;
abstract class payment
{
	double amount;
	payment(double amount)
	{
		this.amount=amount;
	}
	abstract void makepayment();
}
class creditcard extends payment
{
	public creditcard(double amount)
	{
		super(amount);
	}
	void makepayment()
	{
		System.out.println("amount payed by Credit card was :"+amount);
	}
}
class upi extends payment
{
	public upi(double amount)
	{
		super(amount);
	}
	void makepayment()
	{
		System.out.println("amount payed by upi was : "+amount);
	}
}
public class pay_abstrcation {
	public static void main(String[]args)
	{
		payment p = new creditcard(10000);
		p.makepayment();
		
		payment p1 = new upi(20000);
		p1.makepayment();
	}

}
