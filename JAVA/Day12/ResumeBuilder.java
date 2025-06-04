package Day12;

import java.util.Optional;

class Resume
{
	Optional<String> linkedin;
	
	Resume(String linkedin)
	{
		this.linkedin=Optional.ofNullable(linkedin);
	}
	void verify()
	{
		System.out.println("Linked in Link : "+linkedin.orElse("Account Details not provided") );
	}
}


public class ResumeBuilder {
	public static void main(String[] args) {
		Resume r= new Resume("surya9133/Linkedin");
		r.verify();
		Resume r1= new Resume(null);
		r1.verify();
	}

}
