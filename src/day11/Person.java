package day11;

public class Person {
	String name;
	int jumin;
	
	public Person() {}
	
	public Person(String name, int jumin) {
		super();
		this.name = name;
		this.jumin = jumin;
	}
	
	@Override
	public String toString() {
	
		return "ÀÌ¸§ : " + name;
	}
	
	@Override
	public int hashCode() {
		return jumin;
	}
}
