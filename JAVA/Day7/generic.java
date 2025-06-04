package Day7;
//
//class vegmeal
//{
//	public String toString()
//	{
//		return "vegmeal";
//	}
//}
//class nonveg
//{
//	public String toString()
//	{
//		return "nonvegmeal";
//	}
//}
//class tiffinbox
//{
//	private Object meal;
//	public void setmeal(Object meal)
//	{
//		this.meal=meal;
//	}
//	public Object getmeal()
//	{
//		return meal;
//	}
//}
//public class generic {
//	public static void main(String[] args)
//	{
//		tiffinbox t = new tiffinbox();
//		vegmeal vm = new vegmeal();
//
//		nonveg nvm=(nonveg)t.getmeal();
//		t.setmeal(vm);
//		System.out.println(nvm);
//	}
//
//}
class Tiffinbox <t>
{	
	int size;
	public Tiffinbox(int size)
	{
		this.size=size;
	}
	
	private t meal;
	public void setmeal(t meal)
	{
		this.meal=meal;
	}
	public t getmeal()
	{
		return meal;
	}
}
class vegmeal
{
	private String name;
	public vegmeal(String name)
	{
		this.name=name;
	}
	
	public String toString()
	{
		return  "vegmeals";
	}
}
class nonveg
{
	private String name;
	public nonveg(String name)
	{
		this.name=name;
	}
	
	public String toString()
	{
		return (String) "non vegmeal";
	}
}
public class generic
{
	public static void main(String[] args)
	{
		Tiffinbox<vegmeal> tiffin = new Tiffinbox<>(2);
		tiffin.setmeal(new vegmeal("panner"));
		System.out.println(tiffin.getmeal());
		
		Tiffinbox <nonveg> atiffin=new Tiffinbox<>(2);
		atiffin.setmeal(new nonveg("egg"));
		System.out.println(atiffin.getmeal());
	}
}