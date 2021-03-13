package com.upgrad.hirewheels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.upgrad.hirewheels.dao.usersDAO;
import  com.upgrad.hirewheels.dao.usersDAOImpl;
import com.upgrad.hirewheels.entities.users;
@SpringBootApplication
public class HireWheelsApplication {

	public static void main(String[] args) {
//		SpringApplication.run(HireWheelsApplication.class, args);
		ApplicationContext context = SpringApplication.run(HireWheelsApplication.class, args);
		usersDAO users_Dao = context.getBean(usersDAO.class);
		users users_list = new users();
		users_list.setEmail("emma@gmail.com");
		users_list.setFirst_name("emma");
		users_list.setLast_name("beru");
		users_list.setPassword(12234);
		users_list.setWallet_money(10000);

		System.out.println("Before Saving: " + users_list);

		users saveduser = users_Dao.save(users_list);
		System.out.println("After saving: " + saveduser);

		//find by id
		users retrievedCustomer = (users) users_Dao.findById(saveduser.getUser_id());
		System.out.println("After retrieving: " + retrievedCustomer);

        //find by first name


		users retrievedCustomerfirstname = (users) users_Dao.findByFirstName(saveduser.getFirst_name());
		System.out.println("find by first name: "+ retrievedCustomerfirstname);
		users retrievedCustomer1 = (users) users_Dao.findByEmail("emma@gmail.com");
		System.out.println("sivani");
		System.out.println("After retrieving: " + retrievedCustomer1);


	}

}
