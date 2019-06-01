package intervals.intervals;

import static org.junit.Assert.*;

import org.junit.Test;

public class OpenIntervalTest {

	@Test
	public void testIsIntersectedOverlapingByLeft() {
		Interval one = new IntervalBuilder().min(new FromPoint(3,false)).max(new UntilPoint(14, false)).build();
		Interval another = new IntervalBuilder().min(new FromPoint(1,false)).max(new UntilPoint(7,false)).build();
	
		assertTrue(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedOverlapingByLeftWithEquals() {
		Interval one = new IntervalBuilder().min(new FromPoint(3,false)).max(new UntilPoint(14, false)).build();
		Interval another = new IntervalBuilder().min(new FromPoint(3,false)).max(new UntilPoint(7,false)).build();		

		assertTrue(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedOverlapingByEquals() {
		Interval one = new IntervalBuilder().min(new FromPoint(3,false)).max(new UntilPoint(14, false)).build();
		Interval another = new IntervalBuilder().min(new FromPoint(3,false)).max(new UntilPoint(14,false)).build();	
		
		assertTrue(one.isIntersected(another));
	}
	
	
	@Test
	public void testIsIntersectedOverlapingByRight() {
		Interval one = new IntervalBuilder().min(new FromPoint(3,false)).max(new UntilPoint(14, false)).build();
		Interval another = new IntervalBuilder().min(new FromPoint(7,false)).max(new UntilPoint(17,false)).build();			

		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByBoth() {
		Interval one = new IntervalBuilder().min(new FromPoint(3,false)).max(new UntilPoint(14, false)).build();
		Interval another = new IntervalBuilder().min(new FromPoint(0,false)).max(new UntilPoint(17,false)).build();			

		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByInside() {
		Interval one = new IntervalBuilder().min(new FromPoint(3,false)).max(new UntilPoint(14, false)).build();
		Interval another = new IntervalBuilder().min(new FromPoint(5,false)).max(new UntilPoint(10,false)).build();			

		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingByLeft() {
		Interval one = new IntervalBuilder().min(new FromPoint(3,false)).max(new UntilPoint(14, false)).build();
		Interval another = new IntervalBuilder().min(new FromPoint(0,false)).max(new UntilPoint(2,false)).build();			

		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingByRight() {
		Interval one = new IntervalBuilder().min(new FromPoint(3,false)).max(new UntilPoint(14, false)).build();
		Interval another = new IntervalBuilder().min(new FromPoint(16,false)).max(new UntilPoint(22,false)).build();			

		assertFalse(one.isIntersected(another));
	}
		
	@Test
	public void testIsIntersectedNotOverlapingByRightSameValue() {
		Interval one = new IntervalBuilder().min(new FromPoint(3,false)).max(new UntilPoint(14, false)).build();
		Interval another = new IntervalBuilder().min(new FromPoint(1,false)).max(new UntilPoint(3,false)).build();			

		assertFalse(one.isIntersected(another));
	}
		
	@Test
	public void testIsIntersectedNotOverlapingByLeftSameValue() {
		Interval one = new IntervalBuilder().min(new FromPoint(3,false)).max(new UntilPoint(14, false)).build();
		Interval another = new IntervalBuilder().min(new FromPoint(14,false)).max(new UntilPoint(18,false)).build();	
		
		assertFalse(one.isIntersected(another));
	}
			
}
