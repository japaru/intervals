package intervals.intervals;

public class Interval {
	protected FromPoint min;
	protected UntilPoint max;
	
	public Interval(FromPoint min, UntilPoint max) {
		this.min = min;
		this.max = max;
	}
	
	public boolean isIntersected(Interval another) {
		if (this.min.value == another.max.value || this.max.value == another.min.value) {
			return this.isEqualValueConsiderationIntersected(another);
		};
		
		return (!this.min.isLeftTo(another.min) &&  !another.max.isLeftTo(this.min))||
				(this.min.isLeftTo(another.min) && !this.max.isLeftTo(another.max)) ||
				(this.min.isLeftTo(another.min) && !this.max.isLeftTo(another.min));
	}
	
	private boolean isEqualValueConsiderationIntersected(Interval another) {
		return (this.min.value == another.max.value && this.min.isValueIncluded && another.max.isValueIncluded) ||
				(this.max.value == another.min.value && this.max.isValueIncluded && another.min.isValueIncluded) ;
	}
		
}
;