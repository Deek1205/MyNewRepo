package com.build;

public class Test {

	public static void main(String[] args) {
        
		  User user=new User
		  .UserBuilder()
		 .name("Deeksha")
		 .mobile("7880110374")
		 .age(24)
		 .salary(40.6)
		 .build();
		  
		  System.out.println(user.getAge());
		  System.out.println(user.getName());
		  System.out.println(user.getSalary());
		  System.out.println(user.getMobile());
		  
		  
		  
		 
		 
		
	}

}
