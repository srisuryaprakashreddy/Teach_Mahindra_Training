package Day12;

import java.util.Optional;

class Mode
{
	Optional<String> mode;
	Mode(String mode)
	{
		this.mode=Optional.ofNullable(mode);
	}
	void Setmode()
	{
		if(!mode.isEmpty())
		{
			System.out.println(mode.get());
		}
		else {
			System.out.println("Light Mode");
		}
		
	}
}
public class UserSettings {
	public static void main(String[] args) {
		Mode m=new Mode("DarkMode");
		m.Setmode();
		Mode m1=new Mode(null);
		m1.Setmode();
		
		
	}

}
