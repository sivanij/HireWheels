package com.upgrad.hirewheels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.upgrad.hirewheels.dao.usersDAO;
import  com.upgrad.hirewheels.dao.usersDAOImpl;
import com.upgrad.hirewheels.entities.users;
import com.upgrad.hirewheels.dao.userTypeDAO;
import com.upgrad.hirewheels.entities.user_type;
@SpringBootApplication
public class HireWheelsApplication {

	public static void main(String[] args) {
//		SpringApplication.run(HireWheelsApplication.class, args);
		ApplicationContext context = SpringApplication.run(HireWheelsApplication.class, args);
		usersDAO users_Dao = context.getBean(usersDAO.class);
		userTypeDAO user_type_dao = context.getBean(userTypeDAO.class);


		user_type userTypeList =new user_type();
		userTypeList.setUser_type_name("ADMIN");
		user_type response =user_type_dao.save(userTypeList);

		System.out.println("After saving: " + response);


		user_type userTypeList2 =new user_type();
		userTypeList.setUser_type_name("USER");
		user_type response2 =user_type_dao.save(userTypeList2);

		System.out.println("After saving: " + response2);
		users users_list = new users();
		users_list.setEmail("emma@gmail.com");
		users_list.setFirst_name("emma");
		users_list.setLast_name("beru");
		users_list.setPassword(12234);
		users_list.setWallet_money(10000);


		users_list.setUser_type_id(users_list.getUser_type_id());
		System.out.println("Before Saving: " + users_list);

		users saveduser = users_Dao.save(users_list);
		System.out.println("After saving: " + saveduser);

		users users_list1 = new users();
		users_list1.setEmail("ameli@gmail.com");
		users_list1.setFirst_name("ameli");
		users_list1.setLast_name("paru");
		users_list1.setPassword(1234);
		users_list1.setWallet_money(10000);

		users_list1.setUser_type_id(users_list1.getUser_type_id());
         users saveduser2 = users_Dao.save(users_list1);
		System.out.println("After saving: " + saveduser2);


		users users_list2 = new users();
		users_list2.setEmail("siva@gmail.com");
		users_list2.setFirst_name("siva");
		users_list2.setLast_name("jala");
		users_list2.setPassword(12345);
		users_list2.setWallet_money(10000);

		users_list2.setUser_type_id(users_list2.getUser_type_id());
		users saveduser3 = users_Dao.save(users_list2);

		System.out.println("After saving: " + saveduser3);

		users users_list3 = new users();
		users_list3.setEmail("vani@gmail.com");
		users_list3.setFirst_name("vani");
		users_list3.setLast_name("rupali");
		users_list3.setPassword(123456);
		users_list3.setWallet_money(10000);

		users_list3.setUser_type_id(users_list3.getUser_type_id());
		users saveduser4 = users_Dao.save(users_list2);

		System.out.println("After saving: " + saveduser4);

		users users_list4 = new users();
		users_list4.setEmail("vanisri@gmail.com");
		users_list4.setFirst_name("vanisri");
		users_list4.setLast_name("penchal");
		users_list4.setPassword(123467);
		users_list4.setWallet_money(10000);
		users_list4.setUser_type_id(users_list4.getUser_type_id());
		users saveduser5 = users_Dao.save(users_list2);
		System.out.println("After saving: " + saveduser5);
		//find by id
		users retrievedCustomer = (users) users_Dao.findById(saveduser.getUser_id());
		System.out.println("After retrieving: " + retrievedCustomer);


	}

}
