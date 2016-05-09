package com.cloudcode.lottery.util;

import com.cloudcode.lottery.model.base.Base;

public class Point {
	/**
	 * x轴
	 */
	private Double x;
	/**
	 * y轴
	 */
	private Double y;
	
	/**
	 * 斜率
	 */
	public String slope;
	
	private LineSlope lineSlope;
	public Point() {}
	public Point(Double x, Double y) {
		this.x = x;
		this.y = y;
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}

	public LineSlope getLineSlope() {
		return lineSlope;
	}

	public void setLineSlope(LineSlope lineSlope) {
		this.lineSlope = lineSlope;
	}

	public String getSlope() {
		return slope;
	}

	public void setSlope(String slope) {
		this.slope = slope;
	}

	public void setPoint(Base base) {
		Point p1 = new Point(base.getA() * 0.1, base.getB() * 0.1);
		Point p2 = new Point(base.getB() * 0.1, base.getC() * 0.1);
		Point p3 = new Point(base.getC() * 0.1, base.getD() * 0.1);
		Point p4 = new Point(base.getD() * 0.1, base.getE() * 0.1);
		Point p5 = new Point(base.getE() * 0.1, base.getF() * 0.1);
		Point p6 = new Point(base.getF() * 0.1, base.getG() * 0.1);
		//LineSlope l1 = new LineSlope(p1, p2);
		LineSlope l1 = new LineSlope(p1, p2);
		LineSlope l2 = new LineSlope(p2, p3);
		LineSlope l3 = new LineSlope(p3, p4);
		LineSlope l4 = new LineSlope(p4, p5);
		LineSlope l5 = new LineSlope(p5, p6);
		String slope=format(l1.slope)+"+"+format(l2.slope)+"+"+format(l3.slope)+"+"+format(l4.slope)+"+"+format(l5.slope);
		base.setSlope(slope);
		base.setPoint1(p1);
		base.setPoint2(p2);
		base.setPoint3(p3);
		base.setPoint4(p4);
		base.setPoint5(p5);
		base.setPoint6(p6);
	}
	public static String format(double d){
		return new java.text.DecimalFormat("#0.00").format(d);
	}
	public static void main(String[] args) {
		Base lottery = new Base();
		lottery.setA(1);
		lottery.setB(5);
		lottery.setC(9);
		lottery.setD(11);
		lottery.setE(17);
		lottery.setF(22);
		lottery.setG(30);
		Point p=new Point();
		p.setPoint(lottery);
		System.out.println(lottery.getSlope());
	}
}
