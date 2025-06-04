package Day14;

public class Finalizeexample {
	public Finalizeexample()
	{
		System.out.println("Object Created");
	}
	protected void finalize() throws Throwable//Depricated Method
	{
		System.out.println("Finalize methods call");
	}
	public static void main(String[] args) {
		Finalizeexample e= new Finalizeexample();
		e=null;
		System.gc();
		System.out.println("end of main");
		
	}

}
