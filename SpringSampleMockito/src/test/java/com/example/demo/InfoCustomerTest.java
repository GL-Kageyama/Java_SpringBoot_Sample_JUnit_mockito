package com.example.demo;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Test class for testing InfoCustomer
 */
@RunWith(SpringRunner.class)
public class InfoCustomerTest {

    // Instantiation of a mocking class
    @Mock
    Customer mockCus;

    // Instantiation of the class under test
    @InjectMocks
    InfoCustomer infoCustomer;

    /**
     * Initialization
     */
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    /**
     * Functions for testing using a mock
     */
    @Test
    public void InfoTest() {

        // Creating a mock
    	when(mockCus.getName(1)).thenReturn("Alex");
    	when(mockCus.getAddress(1)).thenReturn("California");
        when(mockCus.getTelno(1)).thenReturn("00000");

        // Run the class under test
        String result = infoCustomer.GetInfo();

    }
}

