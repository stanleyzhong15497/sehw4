package sehw4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class letterGradeTest {

	@Test
	void testScoreBoundaryOfX() {
		assertEquals('X', letterGrade.letterGrade(-1));
		assertEquals('X', letterGrade.letterGrade(101));
	}

	@Test
	void testScoreBoundaryOfF() {
		assertEquals('F', letterGrade.letterGrade(0));
		assertEquals('F', letterGrade.letterGrade(59));
	}

	@Test
	void testScoreBoundaryOfD() {
		assertEquals('D', letterGrade.letterGrade(60));
		assertEquals('D', letterGrade.letterGrade(69));
	}

	@Test
	void testScoreBoundaryOfC() {
		assertEquals('C', letterGrade.letterGrade(70));
		assertEquals('C', letterGrade.letterGrade(79));
	}

	@Test
	void testScoreBoundaryOfB() {
		assertEquals('B', letterGrade.letterGrade(80));
		assertEquals('B', letterGrade.letterGrade(89));
	}

	@Test
	void testScoreBoundaryOfA() {
		assertEquals('A', letterGrade.letterGrade(90));
		assertEquals('A', letterGrade.letterGrade(100));
	}

	@Test
	void testScoreOfX() {
		assertEquals('X', letterGrade.letterGrade(-5));
		assertEquals('X', letterGrade.letterGrade(110));
	}
	
	@Test
	void testScoreOfF() {
		assertEquals('F', letterGrade.letterGrade(45));
	}
	
	@Test
	void testScoreOfD() {
		assertEquals('D', letterGrade.letterGrade(65));
	}
	
	@Test
	void testScoreOfC() {
		assertEquals('C', letterGrade.letterGrade(72));
	}

	@Test
	void testScoreOfB() {
		assertEquals('B', letterGrade.letterGrade(83));
	}
	
	@Test
	void testScoreOfA() {
		assertEquals('A', letterGrade.letterGrade(97));
	}
}
