package com.cognizant.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SomeBusinessImplMockTest{

	@Test
	public void testFindTheGreatestFromAllData() {
		
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn( new int[] {24,15,4});
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
				int result = businessImpl.findTheGreatestFromAllData();
		        assertEquals(24, result);
	}

}
