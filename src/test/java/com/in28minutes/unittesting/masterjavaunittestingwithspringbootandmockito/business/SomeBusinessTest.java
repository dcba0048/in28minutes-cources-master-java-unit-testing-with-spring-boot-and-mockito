package com.in28minutes.unittesting.masterjavaunittestingwithspringbootandmockito.business;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SomeBusinessTest {

	@Test
	public void calculateSum_basic() {
		SomeBusinessImpl business = new SomeBusinessImpl(); 
		int actual = business.calculateSum(new int[] {1,2,3});
		assertEquals(6, actual);
	}
	
	@Test
	public void calculateSum_empty() {
		SomeBusinessImpl business = new SomeBusinessImpl(); 
		int actual = business.calculateSum(new int[] {});
		assertEquals(0, actual);
	}
	
	@Test
	public void calculateSum_oneValue() {
		SomeBusinessImpl business = new SomeBusinessImpl(); 
		int actual = business.calculateSum(new int[] {5});
		assertEquals(5, actual);
	}

}
