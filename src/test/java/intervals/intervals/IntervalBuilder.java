package intervals.intervals;

public class IntervalBuilder {

	protected FromPoint min;
	protected UntilPoint max;
	
	IntervalBuilder(){
		this.min = new FromPoint(3,true);
		this.max = new UntilPoint(5,true);
	}
	
	IntervalBuilder min(FromPoint min) {
		this.min = min;
		return this;
	}

	IntervalBuilder max(UntilPoint max) {
		this.max = max;
		return this;
	}

	Interval build() {
		//assert min <= max;
		
		return new Interval(this.min,this.max);
	}

}
