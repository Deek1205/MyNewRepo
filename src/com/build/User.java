package com.build;

public class User 
{
private String name,mobile;
private int age;
private double salary;

User()
{
	
}

User(UserBuilder builder)
{
this.name=builder.name;
this.age=builder.age;
this.mobile=builder.mobile;
this.salary=builder.salary;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}


static public class UserBuilder
{
	
	private String name,mobile;
	private int age;
	private double salary;

	
	public UserBuilder()
	{
		
	}
	
	public User build()
	{
		
		User u=new User(this);
		return u;	
	}
	
	
	public UserBuilder name(String name) {
		this.name = name;
		return this;
		
	}
	public UserBuilder mobile(String mobile) {
		this.mobile = mobile;
		return this;
		
	}
	public UserBuilder age(int age) {
		this.age = age;
		return this;
		
	}
	public UserBuilder salary(double salary) {
		this.salary = salary;
		return this;
		
	}
	
	
	
	
}



}
