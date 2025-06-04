package Day12;

import java.util.Optional;

class Biodata {
    private String name;
    private Optional<String> bio;

    public Biodata(String name, String bio) {
        this.name = name;
        this.bio = Optional.ofNullable(bio); 
    }

    public void displayBio() {
        System.out.println("Bio: " + bio.orElse("No bio added"));
    }
}
public class OnlineProfile
{
	public static void main(String[] args) {
        Biodata user1 = new Biodata("Surya", "I love programming!");
        Biodata user2 = new Biodata("ram", null); 

        user1.displayBio(); 
        user2.displayBio();
	}
}
