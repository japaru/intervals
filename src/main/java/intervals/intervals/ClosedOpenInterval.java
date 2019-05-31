package intervals.intervals;

public class ClosedOpenInterval extends Interval {

	public ClosedOpenInterval(double min, double max) {
		super(min, max);
	}

	@Override
	protected boolean isIncluded(double value) {
		return this.min <= value && value < this.max;
	}

}
