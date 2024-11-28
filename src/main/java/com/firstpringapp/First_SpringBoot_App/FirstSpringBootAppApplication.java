package com.firstpringapp.First_SpringBoot_App;

import com.firstpringapp.First_SpringBoot_App.model.Addresss;
import com.firstpringapp.First_SpringBoot_App.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringBootAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(FirstSpringBootAppApplication.class, args);

		System.out.println("Hello everyone this is our new springboot project");

		// tight coupling example
	/*	Employee employee1 = new Employee();// object of employe
		employee1.id = 125;
		employee1.name = "Pallavi";
		employee1.designation = "Developer";
		employee1.age = 28;

		Addresss addresss1 = new Addresss();
		addresss1.doorNo = 503;
		addresss1.streetName = "mjnhrfd";
		addresss1.city = "Mumbai";

		employee1.address = addresss1;
		addresss1.doorNo = 511;
		addresss1.streetName = "mj65rfd";
		addresss1.city = "Pune";


		employee1.address = addresss1;


		System.out.println("employee1 is : " + employee1);
		System.out.println("addresss1 is : " + addresss1);*/

		// using setter injection of dependancy injection loose coupling


		Employee employee1 = new Employee();

		employee1.setId(125);
		employee1.setName("Nilesh");
		employee1.setDesignation("Developer");
		employee1.setAge(32);

		Addresss addresss1 = new Addresss();

		addresss1.setDoorNo(659);
		addresss1.setStreetName("nhfvjgf");
		addresss1.setCity("Pune");

		employee1.setAddress(addresss1);

		employee1.getAddress().setDoorNo(256);
		employee1.getAddress().setStreetName("ndhsja");
		employee1.getAddress().setCity("xnxchjak");










		System.out.println("employee1 is : " + employee1);
		System.out.println("addresss1 is : " + addresss1);





	}

}
