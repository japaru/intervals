package intervals.intervals;

public class OpenInterval {
	private double min;
	
	private double max;
	
	public OpenInterval(double min, double max) {
		this.min = min;
		this.max = max;
	}

	public boolean isIntersected(OpenInterval another) {
		return this.isIncluded(another.min) ||
				this.isIncluded(another.max)||
				another.isIncluded(this.min) ||
				(this.min == another.min && this.max == another.max);
	}

	private boolean isIncluded(double value) {
		return this.min < value && value < this.max;
	}


}
