package me.andrekunitz.challange;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class QuadrupletsTest {

	public static final int SIZE_OF_QUADRUPLET = 4;

	@Test
	@DisplayName("Test Case 01 - Should return two quadruplets")
	void testCaseOne_shouldReturnTwoQuadruplets() {
		int[] testArray = {7, 6, 4, -1, 1, 2};
		var targetSum = 16;
		var expectedOutput = List.of(
				new Integer[]{7, 6, 4, -1},
				new Integer[]{7, 6, 1, 2}
		);

		var result = Quadruplets.findFourNumberSum(testArray, targetSum);

		assertThat(result).hasSize(2);
		result.forEach(quadruplet ->
				assertThat(quadruplet).hasSize(SIZE_OF_QUADRUPLET));
		result.forEach(quadruplet ->
				assertThat(expectedOutput).contains(quadruplet));
	}

	@Test
	@DisplayName("Test Case 02 - Should return one quadruplet")
	void testCaseTwo_shouldReturnOneQuadruplet() {
		int[] testArray = {1, 2, 3, 4, 5, 6, 7};
		var targetSum = 10;
		var expectedOutput = List.of(
				new Integer[]{1, 2, 3, 4}
		);

		var result = Quadruplets.findFourNumberSum(testArray, targetSum);

		assertThat(result).hasSize(1);
		result.forEach(quadruplet ->
				assertThat(quadruplet).hasSize(SIZE_OF_QUADRUPLET));
		result.forEach(quadruplet ->
				assertThat(expectedOutput).contains(quadruplet));
	}

	@Test
	@DisplayName("Test Case 03 - Should return three quadruplets")
	void testCaseThree_shouldReturnThreeQuadruplets() {
		int[] testArray = {5, -5, -2, 2, 3, -3};
		var targetSum = 0;
		var expectedOutput = List.of(
				new Integer[]{5, -5, -2, 2},
				new Integer[]{5, -5, 3, -3},
				new Integer[]{-2, 2, 3, -3}
		);

		var result = Quadruplets.findFourNumberSum(testArray, targetSum);

		assertThat(result).hasSize(3);
		result.forEach(quadruplet ->
				assertThat(expectedOutput).contains(quadruplet));
	}

	@Test
	@DisplayName("Test Case 04 - Should return four quadruplets")
	void testCaseFour_shouldReturnFourQuadruplets() {
		int[] testArray = {-2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		var targetSum = 4;
		var expectedOutput = List.of(
				new Integer[]{-2, -1, 1, 6},
				new Integer[]{-2, -1, 2, 5},
				new Integer[]{-2, -1, 3, 4},
				new Integer[]{-2, 1, 2, 3}
		);

		var result = Quadruplets.findFourNumberSum(testArray, targetSum);

		assertThat(result).hasSize(4);
		result.forEach(quadruplet ->
				assertThat(expectedOutput).contains(quadruplet));
	}

	@Test
	@DisplayName("Test Case 05 - Should return five quadruplets")
	void testCaseFive_shouldReturnFiveQuadruplets() {
		int[] testArray = {-1, 22, 18, 4, 7, 11, 2, -5, -3};
		var targetSum = 30;
		var expectedOutput = List.of(
				new Integer[]{-1, 22, 7, 2},
				new Integer[]{22, 4, 7, -3},
				new Integer[]{-1, 18, 11, 2},
				new Integer[]{18, 4, 11, -3},
				new Integer[]{22, 11, 2, -5}
		);

		var result = Quadruplets.findFourNumberSum(testArray, targetSum);

		assertThat(result).hasSize(5);
		result.forEach(quadruplet ->
				assertThat(expectedOutput).contains(quadruplet));
	}

	@Test
	@DisplayName("Test Case 06 - Should return seven quadruplets")
	void testCaseSix_shouldReturnSevenQuadruplets() {
		int[] testArray = {-10, -3, -5, 2, 15, -7, 28, -6, 12, 8, 11, 5};
		var targetSum = 20;
		var expectedOutput = List.of(
				new Integer[]{-5, 2, 15, 8},
				new Integer[]{-3, 2, -7, 28},
				new Integer[]{-10, -3, 28, 5},
				new Integer[]{-10, 28, -6, 8},
				new Integer[]{-7, 28, -6, 5},
				new Integer[]{-5, 2, 12, 11},
				new Integer[]{-5, 12, 8, 5}
		);

		var result = Quadruplets.findFourNumberSum(testArray, targetSum);

		assertThat(result).hasSize(7);
		result.forEach(quadruplet ->
				assertThat(expectedOutput).contains(quadruplet));
	}

	@Test
	@DisplayName("Test Case 07 - Should return empty list")
	void testCaseSeven_shouldReturnEmptyList() {
		int[] testArray = {1, 2, 3, 4, 5};
		var targetSum = 100;

		var result = Quadruplets.findFourNumberSum(testArray, targetSum);

		assertThat(result).isEmpty();
	}

	@Test
	@DisplayName("Test Case 08 - Should return six quadruplets")
	void testCaseEight_shouldReturnSixQuadruplets() {
		int[] testArray = {1, 2, 3, 4, 5, -5, 6, -6};
		var targetSum = 5;
		var expectedOutput = List.of(
				new Integer[]{2, 3, 5, -5},
				new Integer[]{1, 4, 5, -5},
				new Integer[]{2, 4, 5, -6},
				new Integer[]{1, 3, -5, 6},
				new Integer[]{2, 3, 6, -6},
				new Integer[]{1, 4, 6, -6}
		);

		var result = Quadruplets.findFourNumberSum(testArray, targetSum);

		assertThat(result).hasSize(6);
		result.forEach(quadruplet ->
				assertThat(expectedOutput).contains(quadruplet));
	}
}