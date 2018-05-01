package lesson03;

public class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Person)==false) return false;
		Person p = (Person) obj;
		return this.name==null? p.name==null : this.name.equals(p.name) && this.age == p.age;
	}
	
	@Override
	public String toString() {
		return String.format("Person {name= %s, age= %d} ", name, age);
	}
	
	@Override
	public int compareTo(Person p) {
		int r = this.name.compareTo(p.name);
		if(r!=0) return r;
		return this.age-p.age;
	}
	
}
