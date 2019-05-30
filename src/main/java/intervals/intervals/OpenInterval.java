package intervals.intervals;

public class OpenInterval extends Interval{

	public OpenInterval(double min, double max) {
		super(min, max);
	}

	@Override
	protected boolean isIncluded(double value) {
		return this.min < value && value < this.max;
	}
}
