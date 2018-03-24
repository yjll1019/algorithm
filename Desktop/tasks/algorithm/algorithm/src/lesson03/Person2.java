package lesson03;

public class Person2 {
	String name;
	int age;
	
	public Person2(String name, int age) {
		this.name=name;
		this.age=age;
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
        if ((obj instanceof Person2) == false) return false;
        Person2 p = (Person2)obj;
        return (this.name == null ? p.name == null : this.name.equals(p.name)) && this.age == p.age;
    }
    
	@Override
	public String toString() {
		return String.format("Person2 {name= %s, age= %d} ", name, age);
	}

}
