package com.in28minutes.unittesting.masterjavaunittestingwithspringbootandmockito.business;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.in28minutes.unittesting.masterjavaunittestingwithspringbootandmockito.data.SomeDataService;

class SomeDataServiceStub implements SomeDataService {
	public int[] retrieveAllData() {
		return new int[] {1,2,3};
	}
}

class SomeDataServiceEmptyStub implements SomeDataService {
	public int[] retrieveAllData() {
		return new int[] {};
	}
}

class SomeDataServiceOneElementStub implements SomeDataService {
	public int[] retrieveAllData() {
		return new int[] {5};
	}
}


public class SomeBusinessStubTest {

	@Test
	public void calculateSumUsingDataService_basic() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		business.setSomeDataService(new SomeDataServiceStub());
		int actual = business.calculateSumUsingDataService();
		assertEquals(6, actual);
	}
	
	@Test
	public void calculateSumUsingDataService_empty() {
		SomeBusinessImpl business = new SomeBusinessImpl(); 
		business.setSomeDataService(new SomeDataServiceEmptyStub());
		int actual = business.calculateSumUsingDataService();
		assertEquals(0, actual);
	}
	
	@Test
	public void calculateSumUsingDataService_oneValue() {
		SomeBusinessImpl business = new SomeBusinessImpl(); 
		business.setSomeDataService(new SomeDataServiceOneElementStub());
		int actual = business.calculateSumUsingDataService();
		assertEquals(5, actual);
	}

}
