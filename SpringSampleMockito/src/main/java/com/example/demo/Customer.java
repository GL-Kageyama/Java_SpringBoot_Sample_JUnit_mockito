package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * Class to retrieve customer information from the DB (to be mocked)
 */
@Component
public class Customer {

    /**
     * Get a name that corresponds to the primary key
     * @param key Primary key to be acquired
     * @return name Target name
     */
	public String getName(Integer key) {
        String name = "";
        // Get name from DB [TODO]
        return name;
    }

    /**
     * Get the address for the primary key
     * @param key Primary key to be acquired
     * @return address Target address
     */
	public String getAddress(Integer key) {
        String address = "";
        // Get address from DB [TODO]
        return address;
    }

    /**
     * Get a phone number for your primary key
     * @param key Primary key to be acquired
     * @return telno target phone number
     */
	public String getTelno(Integer key) {
        String telno = "";
        // Get phone number from DB [TODO]
        return telno;
    }
}
