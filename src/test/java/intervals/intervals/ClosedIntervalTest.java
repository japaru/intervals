package intervals.intervals;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClosedIntervalTest {

	@Test
	public void testIsIntersectedOverlapingByLeft() {
		Interval one = new IntervalBuilder().min(new FromPoint(3,true)).max(new UntilPoint(14, true)).build();
		Interval another = new IntervalBuilder().min(new FromPoint(1,true)).max(new UntilPoint(7,true)).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByLeftWithEquals() {
		Interval one = new IntervalBuilder().min(new FromPoint(3,true)).max(new UntilPoint(14, true)).build();
		Interval another = new IntervalBuilder().min(new FromPoint(3,true)).max(new UntilPoint(7,true)).build();
		
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByEquals() {
		Interval one = new IntervalBuilder().min(new FromPoint(3,true)).max(new UntilPoint(14, true)).build();
		Interval another = new IntervalBuilder().min(new FromPoint(3,true)).max(new UntilPoint(14,true)).build();
		
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByRight() {
		Interval one = new IntervalBuilder().min(new FromPoint(3,true)).max(new UntilPoint(14, true)).build();
		Interval another = new IntervalBuilder().min(new FromPoint(7,true)).max(new UntilPoint(17,true)).build();
		
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByBoth() {
		Interval one = new IntervalBuilder().min(new FromPoint(3,true)).max(new UntilPoint(14, true)).build();
		Interval another = new IntervalBuilder().min(new FromPoint(0,true)).max(new UntilPoint(17,true)).build();

		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByInside() {
		Interval one = new IntervalBuilder().min(new FromPoint(3,true)).max(new UntilPoint(14, true)).build();
		Interval another = new IntervalBuilder().min(new FromPoint(5,true)).max(new UntilPoint(10,true)).build();

		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingByLeft() {
		Interval one = new IntervalBuilder().min(new FromPoint(3,true)).max(new UntilPoint(14, true)).build();
		Interval another = new IntervalBuilder().min(new FromPoint(0,true)).max(new UntilPoint(2,true)).build();

		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingByRight() {
		Interval one = new IntervalBuilder().min(new FromPoint(3,true)).max(new UntilPoint(14, true)).build();
		Interval another = new IntervalBuilder().min(new FromPoint(16,true)).max(new UntilPoint(22,true)).build();

		assertFalse(one.isIntersected(another));
	}
	
	
}