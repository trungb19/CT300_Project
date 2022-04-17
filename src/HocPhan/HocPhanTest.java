package HocPhan;

import static org.junit.Assert.*;

import org.junit.Test;

public class HocPhanTest {

	@Test
	public void testTimMaHPString() {
		HocPhan tester = new HocPhan();
		assertEquals(0, tester.timMaHP("CT101"));
		assertEquals(10, tester.timMaHP("CT10000"));
	}

	@Test
	public void testThemHPStringString() {
		HocPhan tester = new HocPhan();
		assertEquals(1, tester.themHP("CT_test", "Test"));
		assertEquals(-1, tester.themHP("CT101", "Lập trình"));
	}

	@Test
	public void testXoaHPString() {
		HocPhan tester = new HocPhan();
		assertEquals(1, tester.xoaHP("CT101"));
		assertEquals(-1, tester.xoaHP("CT1000"));
	}
}
