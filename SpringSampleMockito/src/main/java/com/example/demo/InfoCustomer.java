package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

/**
 * Class to be test
 */
@ComponentScan
public class InfoCustomer {

	// Dependency injection
	@Autowired
	Customer cus;

    /**
     * Function to convert data retrieved from the DB to a string
     * @return result String generated from DB information
     */
	public String GetInfo () {

    	// Plans to mock this process
        String name = cus.getName(1);
        String address = cus.getAddress(1);
        String telno = cus.getTelno(1);

        String result = name + " lives in " + address + " and phone number is " + telno + ".";

        return result;

    }

}
