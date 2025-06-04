package Day6;

public class Wrapperex {
	public static void main(String[] args)
	{
		String javaScore="85";
		String dsaScore="77";
		String dbmsScore="80";
		
		int javaScore1=Integer.parseInt(javaScore);
		int dsaScore1=Integer.parseInt(dsaScore);
		int dbmsScore1=Integer.parseInt(dbmsScore);
		
//		int javaScore2=new Integer(javaScore);  deprecated method
		
		int total = javaScore1+dsaScore1+dbmsScore1;
		double average=(double) total/3;
		Double average1=Double.valueOf(average);
 		System.out.println("average "+average1);
		
	}
	
}
