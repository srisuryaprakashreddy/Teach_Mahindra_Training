package Day7;
class Pair<K,V>
{
	private K key;
	private V value;
	Pair(K key,V value)
	{
		this.key=key;
		this.value=value;
	}
	public void Printpair()
	{
		System.out.println(key+"->"+value);
	}
}
public class keyvalue {
	public static void main(String[]args)
	{
		Pair<String,Integer> p = new Pair<>("maths",99);
		Pair<String,Integer> p1 = new Pair<>("science",80);
		p.Printpair();
		p1.Printpair();
		
	}

}
