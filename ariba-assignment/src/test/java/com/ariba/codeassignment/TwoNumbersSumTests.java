package com.ariba.codeassignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TwoNumbersSumTests {

	@Test
	public void testPrintSumPairs1() {

		int input[] = { 1, 3, 46, 1, 3, 9 };

		int result = TwoNumbersSum.printSumPairs(input, 47);

		assertEquals(1, result);
	}

	@Test
	public void testPrintSumPairs2() {

		int input[] = { 6, 6, 3, 9, 3, 5, 1 };

		int result = TwoNumbersSum.printSumPairs(input, 12);

		assertEquals(2, result);
	}

	@Test
	public void testPrintSumPairs3() {

		int input[] = { 6, 5, 3, 46, 7, 3, 9 };

		int result = TwoNumbersSum.printSumPairs(input, 47);

		assertEquals(0, result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPrintSumPairs4() {

		int input[] = {};

		TwoNumbersSum.printSumPairs(input, 6);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testPrintSumPairs5() {

		TwoNumbersSum.printSumPairs(null, 6);

	}

	@Test
	public void testPrintSumPairs6() {

		int input[] = { 1, 1, 1, 1, 1 };
		int result = TwoNumbersSum.printSumPairs(input, 2);

		assertEquals(1, result);
	}

}
