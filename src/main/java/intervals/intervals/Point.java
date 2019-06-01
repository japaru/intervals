package intervals.intervals;

public class Point {
	protected double value;
	protected boolean isValueIncluded;
	
	public Point(double value, boolean isValueIncluded) {
		this.value = value;
		this.isValueIncluded = isValueIncluded;
	}

	public boolean isLeftTo(Point another) {
		return this.value < another.value || 
				(this.value == another.value && !this.isValueIncluded);
	}
}
