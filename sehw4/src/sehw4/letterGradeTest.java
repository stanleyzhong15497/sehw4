package sehw4;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class letterGradeTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;
	private final InputStream originalIn = System.in;
	private final letterGrade lg = new letterGrade();

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
	
	@Test
	void testMain1() {
		String data = "89\n";
		System.setOut(new PrintStream(outContent));
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		lg.main(null);
		assertEquals("Enetr the score = The grade of 89 is B\r\n", outContent.toString());
		
		System.setOut(originalOut);
	    System.setIn(originalIn);
		
	}
	
	@Test
	void testMain2() {
		String data = "notNumber\n";
		System.setOut(new PrintStream(outContent));
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		lg.main(null);
		assertEquals("Enetr the score = Not an integer!\r\n", outContent.toString());
		
		
		System.setOut(originalOut);
	    System.setIn(originalIn);
		
	}
	
}
