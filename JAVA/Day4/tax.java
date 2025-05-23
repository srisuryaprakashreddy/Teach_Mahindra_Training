
//create an interface taxable with a calculate_tax method and implement it in employee and freelancer
package Day4;
interface Taxable
{
	public abstract void Calculatetax();
}
class employee implements Taxable
{
	int salary;
	employee(int salary)
	{
		this.salary=salary;
	}
	public void Calculatetax()
	{
		System.out.println("the payable tax is 15 % of yout salary : "+(salary*0.15));
	}
}
class freelancer implements Taxable
{
	int salary;
	freelancer(int salary)
	{
		this.salary=salary;
	}
	public void Calculatetax()
	{
		System.out.println("the payable tax for the freelancer is 10 % of his salary : "+(salary*0.10));
	}
}
public class tax {
	public static void main(String[]args)
	{
		employee e= new employee(40000);
		freelancer f =new freelancer(23000);
		e.Calculatetax();
		f.Calculatetax();
	}

}
