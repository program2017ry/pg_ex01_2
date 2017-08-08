package pg_ex01_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class pg_ex01_2Test {
	@Test
	public void test1() {
		pg_ex01_2 pg_ex01_2  = new pg_ex01_2();
		assertEquals("I", pg_ex01_2.change(1));
	}

	@Test
	public void test2() {
		pg_ex01_2 pg_ex01_2  = new pg_ex01_2();
		assertEquals("II", pg_ex01_2.change(2));
	}

	@Test
	public void test3() {
		pg_ex01_2 pg_ex01_2  = new pg_ex01_2();
		assertEquals("III", pg_ex01_2.change(3));
	}

	@Test
	public void test4() {
		pg_ex01_2 pg_ex01_2  = new pg_ex01_2();
		assertEquals("IV", pg_ex01_2.change(4));
	}

	@Test
	public void test5() {
		pg_ex01_2 pg_ex01_2  = new pg_ex01_2();
		assertEquals("V", pg_ex01_2.change(5));
	}

	public void test6() {
		pg_ex01_2 pg_ex01_2  = new pg_ex01_2();
		assertEquals("VI", pg_ex01_2.change(6));
	}

	public void test7() {
		pg_ex01_2 pg_ex01_2  = new pg_ex01_2();
		assertEquals("VII", pg_ex01_2.change(7));
	}

	public void test8() {
		pg_ex01_2 pg_ex01_2  = new pg_ex01_2();
		assertEquals("VIII", pg_ex01_2.change(8));
	}

	public void test9() {
		pg_ex01_2 pg_ex01_2  = new pg_ex01_2();
		assertEquals("IX", pg_ex01_2.change(9));
	}

	@Test
	public void test10() {
		pg_ex01_2 pg_ex01_2  = new pg_ex01_2();
		assertEquals("X", pg_ex01_2.change(10));
	}
	@Test
	public void test11() {
		pg_ex01_2 pg_ex01_2  = new pg_ex01_2();
		assertEquals("XI", pg_ex01_2.change(11));
	}

	@Test
	public void test12() {
		pg_ex01_2 pg_ex01_2  = new pg_ex01_2();
		assertEquals("XII", pg_ex01_2.change(12));
	}

	@Test
	public void test13() {
		pg_ex01_2 pg_ex01_2  = new pg_ex01_2();
		assertEquals("XIII", pg_ex01_2.change(13));
	}

	@Test
	public void test14() {
		pg_ex01_2 pg_ex01_2  = new pg_ex01_2();
		assertEquals("XIV", pg_ex01_2.change(14));
	}

	@Test
	public void test15() {
		pg_ex01_2 pg_ex01_2  = new pg_ex01_2();
		assertEquals("XV", pg_ex01_2.change(15));
	}

	public void test16() {
		pg_ex01_2 pg_ex01_2  = new pg_ex01_2();
		assertEquals("XVI", pg_ex01_2.change(16));
	}

	public void test17() {
		pg_ex01_2 pg_ex01_2  = new pg_ex01_2();
		assertEquals("XVII", pg_ex01_2.change(17));
	}

	public void test18() {
		pg_ex01_2 pg_ex01_2  = new pg_ex01_2();
		assertEquals("XVIII", pg_ex01_2.change(18));
	}

	public void test19() {
		pg_ex01_2 pg_ex01_2  = new pg_ex01_2();
		assertEquals("XIX", pg_ex01_2.change(19));
	}

	@Test
	public void test20() {
		pg_ex01_2 pg_ex01_2  = new pg_ex01_2();
		assertEquals("XX", pg_ex01_2.change(20));
	}
	@Test
	public void testother() {
		pg_ex01_2 pg_ex01_2  = new pg_ex01_2();
		assertEquals("変換できません", pg_ex01_2.change(111));
		assertEquals("変換できません", pg_ex01_2.change(0));
		assertEquals("変換できません", pg_ex01_2.change(-1));
		assertEquals("変換できません", pg_ex01_2.change(33));
		assertEquals("変換できません", pg_ex01_2.change(21));
	}
}
