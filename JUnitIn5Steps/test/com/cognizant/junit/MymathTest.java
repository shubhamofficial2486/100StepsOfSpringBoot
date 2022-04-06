package com.cognizant.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class MymathTest {
    
	@Before
    void before() {
    	System.out.println("Before");
    }
    
    @After
    void after() {
    	System.out.println("After");
    }

    
	@Test
	void test1() {
		Mymath mymath = new Mymath();
		assertEquals(45, mymath.sum(new int[] {1,34,10}));
		System.out.println("test1");
	}
	
	@Test
	void test2() {
		Mymath mymath = new Mymath();
		assertEquals(45, mymath.sum(new int[] {1,34,10}));
		System.out.println("test2");
	}
	
}
