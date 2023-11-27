package com.nov9DayOperatorTest;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nov9Day5Operators.MiscellaneousOperator;

public class MiscellaneousTest {
	MiscellaneousOperator miscellaneousOperator = new MiscellaneousOperator();

	@Test
	public void misc1() {
		String result=miscellaneousOperator.miscellaneous1(12, 16);
		assertEquals("true", result);
	}

	
	@Test
	public void misc2() {
		boolean result=miscellaneousOperator.miscellaneous2(10);
        assertTrue(result);
	}

}
