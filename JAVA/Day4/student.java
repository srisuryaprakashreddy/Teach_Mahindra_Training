//Create a student Grading system that classifes scores

package Day4;
import java.util.Scanner;


public class student {
    private static Scanner s;

	public static void main(String[] args) {
    	s = new Scanner(System.in);
    	System.out.println("enter number of subjects: ");
    	int n=s.nextInt();
    	int[] scores =new int[n]; 
    	System.out.println("enter the scores :");
    	
    	for(int i=0;i<n;i++)
    	{
    		scores[i]=s.nextInt();
    	}
        
        String[] grades = new String[scores.length] ;
        for(int i=0;i<scores.length;i++)
        {
        	if (scores[i] < 40) {
                grades[i] = "Fail";
            } else if (scores[i] >= 40 && scores[i] <= 60) {
                grades[i] = "Pass";
            } else {
                grades[i] = "Distinction";
            }        	
        }
        for(int i=0;i<scores.length;i++)
        {
        	System.out.print(scores[i]+"  ");
        }
        System.out.println("\n the results are");
        
        
        for(int i=0;i<grades.length;i++)
        {
        	System.out.print(grades[i]+" | ");
        }
      
    }
}
