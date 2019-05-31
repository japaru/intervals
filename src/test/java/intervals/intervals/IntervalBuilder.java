package intervals.intervals;

public class IntervalBuilder {

	private double min;
	private double max;
	private IntervalType type;
	
	IntervalBuilder(){
		this.min = 0;
		this.max = 1;
		this.type = IntervalType.CLOSED;
	}
	
	IntervalBuilder min(double min) {
		this.min = min;
		return this;
	}

	IntervalBuilder max(double max) {
		this.max = max;
		return this;
	}

	IntervalBuilder type(IntervalType type) {
		this.type = type;
		return this;
	}

	Interval build() {
		assert min <= max;
		
		switch(this.type) {
		  case CLOSED:
			return new ClosedInterval(min, max);
		  case OPEN:
			return new OpenInterval(min, max);
		  case CLOSEDOPEN:
			return new ClosedOpenInterval(min, max);
		  case OPENCLOSED:
			return new OpenClosedInterval(min, max);
		}
		return null;
	}

}
