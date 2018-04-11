package com.ariba.codeassignment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoNumbersSum {

	public static int printSumPairs(int[] input, int k) {

		Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

		Set<Integer> resultSet = new HashSet<Integer>();

		if (input == null || input.length == 0) {
			throw new IllegalArgumentException("No two sum solution");
		}

		for (int i = 0; i < input.length; i++) {

			if (pairs.containsKey(input[i]))
				resultSet.add(input[i]);
			else
				pairs.put(k - input[i], input[i]);
		}

		return resultSet.size();

	}

}