package com.in28minutes.unittesting.masterjavaunittestingwithspringbootandmockito.business;

import java.util.Arrays;
import java.util.OptionalInt;

import com.in28minutes.unittesting.masterjavaunittestingwithspringbootandmockito.data.SomeDataService;

public class SomeBusinessImpl {
	
	private SomeDataService someDataService; 

	public void setSomeDataService(SomeDataService someDataService) {
		this.someDataService = someDataService;
	}

	public int calculateSum(int[] data) {
		return Arrays.stream(data).reduce(Integer::sum).orElse(0);
	}
	
	public int calculateSumUsingDataService() {
		int sum = 0;
		int[] data = someDataService.retrieveAllData();
		for (int value : data) {
			sum += value;
		}
		return sum;
	}
}
