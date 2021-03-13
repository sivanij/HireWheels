package com.upgrad.hirewheels.services;
import com.upgrad.hirewheels.dao.*;
import com.upgrad.hirewheels.entities.*;
import org.springframework.beans.factory.annotation.Autowired;

public class initServiceImpl implements initService{
    @Autowired
    usersDAO usersdao;
    @Autowired
    public userTypeDAO usertypedao;
    @Autowired
    public vehicleDAO vehicledao;
    @Autowired
    public vehicleCategoryDAO vehiclecategorydao;
     @Autowired
    public vehicleSubCategoryDAO vehiclesubcategorydao;
     @Autowired
     public fuelTypeDAO fueltypedao;
     @Autowired
     public locationDAO locationdao;
     @Autowired
     public cityDAO citydao;

    public void start() {
        addUserRole();
        addUsers();
        addVehicleCategory();
        addVehicleSubCategory();
        addCity();
        addFuelType();
        addLocation();
    }
    private void addVehicleSubCategory(){
        vehicle_sub_category vehicleSubCategory = new vehicle_sub_category();
        vehicleSubCategory.setVehicle_sub_category_id(1);
        vehicleSubCategory.setModel_name("SUV");
        vehicleSubCategory.setPrice(10000);
        vehicleSubCategory.setVehicle_category_id(vehicleSubCategory.getVehicle_category_id());
        vehiclesubcategorydao.save(vehicleSubCategory);
    }
    private  void addVehicleCategory(){
        vehicle_category vehicleCategory = new vehicle_category();
        vehicleCategory.setVehicle_category_id(10);
        vehicleCategory.setVehicle_category_name("car");
        vehicleCategory.setVehicle_category_id(11);
        vehicleCategory.setVehicle_category_name("bike");
        vehiclecategorydao.save(vehicleCategory);
    }
    private void addUsers(){
        users usersList = new users();
        usersList.setUser_type_id(usersList.getUser_type_id());
        usersList.setFirst_name("sivani");
        usersList.setLast_name("raavi");
        usersList.setEmail("sivani@gmail.com");
        usersList.setPassword(1234);
        usersList.setWallet_money(10000);
        usersList.setMobile_number(976896543);
        usersdao.save(usersList);

    }
    private void addUserRole(){
        user_type userType = new user_type();
        userType.setUser_type_id(1);
        userType.setUser_type_name("ADMIN");
        usertypedao.save(userType);
    }
    private void addLocation() {
        location locationList = new location();
        locationList.setLocation_id(1);
        locationList.setLocation_name("Worli");
        locationList.setAddress("Dr E Moses Rd, Worli Naka, Upper Worli");
        locationList.setPincode(400018);
        locationList.setCity_id(locationList.getCity_id());
        locationdao.save(locationList);

    }
    private  void addFuelType(){
        fuel_type fuelType = new fuel_type();
        fuelType.setFuel_type_id(1);
        fuelType.setFuel_type("petrol");
        fueltypedao.save(fuelType);

    }

    private void addCity() {
        city citylist = new city();
        citylist.setCity_id(1);
        citylist.setCity_name("mumbai");
        citydao.save(citylist);
    }

}
