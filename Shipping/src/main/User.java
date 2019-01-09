package main;

public class User{
	//User details stored here!
	String name;
	char gender;
	int age;
	public User(String name,char gender,int age) {
		setName(name);
		setGender(gender);
		setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}