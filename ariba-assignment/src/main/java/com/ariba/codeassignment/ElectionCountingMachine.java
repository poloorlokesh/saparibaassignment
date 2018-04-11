package com.ariba.codeassignment;

import java.util.HashMap;
import java.util.Map;

public class ElectionCountingMachine {

	public static String electionWinner(String[] votes) {
		Map<String, Integer> votesMap = new HashMap<String, Integer>();

		int maxValueInMap = 0;

		String winner = null;

		if (votes == null || votes.length == 0) {
			throw new IllegalArgumentException("No two sum solution");
		}

		/** Here insert each and every vote into hashmap with code **/

		for (String vote : votes) {
			if (votesMap.containsKey(vote)) {
				votesMap.put(vote, votesMap.get(vote) + 1);
			} else {
				votesMap.put(vote, 1);
			}
		}

		/** Iterating every item from hashmap and finding the highest votes **/
		for (String key : votesMap.keySet()) {
			Integer val = votesMap.get(key);
			if (val > maxValueInMap) {
				maxValueInMap = val;
				winner = key;
			}
			/** if tie between highest votes getting the least(Smallest) one **/
			else if (val == maxValueInMap && winner.compareTo(key) < 0)
				winner = key;
		}
		return winner;
	}

}