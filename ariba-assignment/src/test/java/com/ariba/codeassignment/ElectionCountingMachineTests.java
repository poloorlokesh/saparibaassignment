package com.ariba.codeassignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ElectionCountingMachineTests {

	@Test
	public void testElectionWinner1() {

		String votes[] = { "Alex", "Michael", "Harry", "Dave", "Michael", "Victor", "Harry", "Alex", "Mary", "Mary" };

		String winner = ElectionCountingMachine.electionWinner(votes);

		assertEquals("Michael", winner);
	}

	@Test
	public void testElectionWinner2() {

		String votes[] = { "Alex", "Michael", "Harry", "Dave", "Victor" };

		String winner = ElectionCountingMachine.electionWinner(votes);

		assertEquals("Victor", winner);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testElectionWinner3() {

		String votes[] = {};

		ElectionCountingMachine.electionWinner(votes);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testElectionWinner4() {

		ElectionCountingMachine.electionWinner(null);

	}

}
