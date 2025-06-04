package Day14;

import java.io.*;


class student implements Serializable
{
	int id;
	String name;
	int marks;
	
	student(int id,String name,int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public String toString()
	{
		return "id: "+id+" name: "+name+" marks: "+marks;
	}
}
public class seriali {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f =new File("Serial.txt");
		f.createNewFile();
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
		student s =new student(12,"surya",99);
		oos.writeObject(s);
		oos.close();
		
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream(f));
		System.out.println(ois.readObject());
		ois.close();
		f.delete();
		
		
		
	}

}
