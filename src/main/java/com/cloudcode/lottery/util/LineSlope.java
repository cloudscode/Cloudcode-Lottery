package com.cloudcode.lottery.util;


public class LineSlope {
	/**
	 * 点坐标
	 */
	private Point point;
	/**
	 * 斜率
	 */
	public Double slope;

	public boolean isParallel(LineSlope line) {
		if (this.slope == line.slope)
			return true;
		return false;
	}
	public LineSlope() {
		
	}
	public LineSlope(Point point, Double slope) {
		this.point = point;
		this.slope = slope;
	}

	public LineSlope(Point p1, Point p2) {
		 this.slope = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());

	}
	public Double getSlope(Point p1, Point p2) {
		 this.slope = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
		 return this.slope;
	}
	public LineSlope(Double a, Double b) {
		this(new Point(a, (double) 0), new Point((double) 0, b));
	}
	public double getY(Point p1, Point p2,Double x) {
		 double slopes = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
		 return p2.getY() -p2.getX()*slopes+x*slopes;
	}
	public static void main(String[] args) {
		LineSlope l1 = new LineSlope(new Point(0.0, 1.0), 2.0);
		LineSlope l2 = new LineSlope(new Point(2.0, 3.0), new Point(5.0,8.0));
		System.out.println(l2.slope);
		System.out.print(l1.isParallel(l2));
		double y1=1;
		double v1=200;
		double y2=5;
		double v2=600;
		double y3=3;
		double v3=0;
		LineSlope l3 = new LineSlope(new Point(y1, v1), new Point(y2,v2));
		System.out.println(l3.slope);
		v3=v2-y2*l3.slope+y3*l3.slope;
		System.out.println(v3);
		System.out.println(l3.getY(new Point(y1, v1), new Point(y2,v2),3.0));
	}
/*	public Double getSlope(SharingPlans p1, SharingPlans p2) {
		 this.slope = (p2.getPrice() - p1.getPrice()) / (p2.getTimesX()- p1.getTimesX());
		 return this.slope;
	}
	public LineSlope(SharingPlans p1, SharingPlans p2) {
		 setSlope( (p2.getPrice() - p1.getPrice()) / (p2.getTimesX()- p1.getTimesX()));
	}*/

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public Double getSlope() {
		return slope;
	}

	public void setSlope(Double slope) {
		this.slope = slope;
	}
	
}
