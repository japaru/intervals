package intervals.intervals;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClosedOpenIntervalTest {


	@Test
	public void testIsIntersectedOverlapingByLeft() {
		Interval one = new IntervalBuilder().type(IntervalType.CLOSEDOPEN).min(3).max(14).build();
		Interval another = new IntervalBuilder().type(IntervalType.CLOSEDOPEN).min(1).max(7).build();
		assertTrue(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedOverlapingByLeftWithEquals() {
		Interval one = new IntervalBuilder().type(IntervalType.CLOSEDOPEN).min(3).max(14).build();
		Interval another = new IntervalBuilder().type(IntervalType.CLOSEDOPEN).min(3).max(7).build();
		assertTrue(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedOverlapingByEquals() {
		Interval one = new IntervalBuilder().type(IntervalType.CLOSEDOPEN).min(3).max(14).build();
		Interval another = new IntervalBuilder().type(IntervalType.CLOSEDOPEN).min(3).max(14).build();
		assertTrue(one.isIntersected(another));
	}
	
	
	@Test
	public void testIsIntersectedOverlapingByRight() {
		Interval one = new IntervalBuilder().type(IntervalType.CLOSEDOPEN).min(3).max(14).build();
		Interval another = new IntervalBuilder().type(IntervalType.CLOSEDOPEN).min(7).max(17).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByBoth() {
		Interval one = new IntervalBuilder().type(IntervalType.CLOSEDOPEN).min(3).max(14).build();
		Interval another = new IntervalBuilder().type(IntervalType.CLOSEDOPEN).min(0).max(17).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByInside() {
		Interval one = new IntervalBuilder().type(IntervalType.CLOSEDOPEN).min(3).max(14).build();
		Interval another = new IntervalBuilder().type(IntervalType.CLOSEDOPEN).min(5).max(10).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingByLeft() {
		Interval one = new IntervalBuilder().type(IntervalType.CLOSEDOPEN).min(3).max(14).build();
		Interval another = new IntervalBuilder().type(IntervalType.CLOSEDOPEN).min(0).max(2).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingByRight() {
		Interval one = new IntervalBuilder().type(IntervalType.CLOSEDOPEN).min(3).max(14).build();
		Interval another = new IntervalBuilder().type(IntervalType.CLOSEDOPEN).min(16).max(22).build();
		assertFalse(one.isIntersected(another));
	}
		
	@Test
	public void testIsIntersectedNotOverlapingByRightSameValue() {
		Interval one = new IntervalBuilder().type(IntervalType.CLOSEDOPEN).min(3).max(14).build();
		Interval another = new IntervalBuilder().type(IntervalType.CLOSEDOPEN).min(1).max(3).build();
		assertTrue(one.isIntersected(another));
	}
/*		
	@Test
	public void testIsIntersectedNotOverlapingByLeftSameValue() {
		Interval one = new IntervalBuilder().type(IntervalType.CLOSEDOPEN).min(3).max(14).build();
		Interval another = new IntervalBuilder().type(IntervalType.CLOSEDOPEN).min(14).max(18).build();
		assertTrue(one.isIntersected(another));
	}
*/	
}
