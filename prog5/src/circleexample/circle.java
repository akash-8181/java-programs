package circleexample;

public final class circle {
	
	private double r;
	
	private final float pie=3.14f;
	
	public circle(final double r1)
	{
		//r1++;
		this.r=r1;
	}
	
	public final double getArea()
	{
		return pie*r*r;
	}


}
