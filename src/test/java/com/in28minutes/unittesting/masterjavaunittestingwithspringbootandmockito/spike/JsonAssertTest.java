package com.in28minutes.unittesting.masterjavaunittestingwithspringbootandmockito.spike;

import static org.junit.Assert.*;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class JsonAssertTest {
	
	String actual = "{\"id\":1,\"name\":\"Ball\",\"price\":10,\"quantity\":100}";

	@Test
	public void jsonAssert_StrictTrue_ExactMatchExceptForSpaces() throws JSONException {
		String expected = "{\"id\": 1,\"name\":\"Ball\",\"price\":10,\"quantity\":100}";
		JSONAssert.assertEquals(expected, actual, true);
	}
	
	@Test
	public void jsonAssert_StrictFalse() throws JSONException {
		String expected = "{\"id\": 1,\"name\":\"Ball\",\"price\":10}";
		JSONAssert.assertEquals(expected, actual, false);
	}
	
	@Test
	public void jsonAssert_WithoutEscapeCharacters() throws JSONException {
		String expected = "{id: 1, name:Ball, price:10}";
		JSONAssert.assertEquals(expected, actual, false);
	}

}
