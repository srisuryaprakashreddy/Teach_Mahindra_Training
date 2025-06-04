package Day12;

import java.util.Optional;

class Grading
{
	Optional<Integer> marks;
	Grading(Integer marks)
	{
		this.marks=Optional.ofNullable(marks);
	}
	void Grade()
	{
		marks.filter(g->g>75).ifPresent(s->System.out.println("Distinction"));
		marks.filter(g->g<75).ifPresent(s->System.out.println("Fail"));
		boolean v=marks.isEmpty();
		if (v==true)
			System.out.println("null value is present in the marks");
		
	}
}

public class StudentGrades {
	public static void main(String[] args) {
		Grading f= new Grading(null);
		f.Grade();
	}

}
