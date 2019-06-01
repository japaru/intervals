package intervals.intervals;

import static org.junit.Assert.*;

import org.junit.Test;

public class PointTest {

	@Test
	public void testPointNotIsLeft() {
		FromPoint point1 = new FromPoint(3,true);
		FromPoint point2 = new FromPoint(2,true);
		
		assertFalse(point1.isLeftTo(point2));
	}
	
	@Test
	public void testPointIsLeft() {
		FromPoint point1 = new FromPoint(3,true);
		FromPoint point2 = new FromPoint(4,true);
		
		assertTrue(point1.isLeftTo(point2));
	}	

	@Test
	public void testPointIsLeftPointInlcuded() {
		FromPoint point1 = new FromPoint(3,true);
		FromPoint point2 = new FromPoint(3,true);
		
		assertFalse(point1.isLeftTo(point2));
	}

	@Test
	public void testPointIsLeftNotPointInlcuded() {
		FromPoint point1 = new FromPoint(3,false);
		FromPoint point2 = new FromPoint(3,true);
		
		assertTrue(point1.isLeftTo(point2));
	}

	
}
