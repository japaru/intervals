package intervals.intervals;

public class OpenClosedInterval extends Interval {

	public OpenClosedInterval(double min, double max) {
		super(min, max);
	}

	@Override
	protected boolean isIncluded(double value) {
		return this.min < value && value <= this.max;
	}
}
