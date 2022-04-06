package com.cognizant.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessImplStubTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
				int result = businessImpl.findTheGreatestFromAllData();
		        assertEquals(32, result);
	}

}

class DataServiceStub implements DataService {

	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[] {21,24,32};
	}
	
	
}
