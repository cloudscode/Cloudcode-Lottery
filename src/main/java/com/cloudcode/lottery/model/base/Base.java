package com.cloudcode.lottery.model.base;

import javax.persistence.MappedSuperclass;

import com.cloudcode.framework.model.BaseModelObject;

@MappedSuperclass
public class Base extends BaseModelObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5581913243900041888L;
	private Integer a;
	private Integer b;
	private Integer c;
	private Integer d;
	private Integer e;
	private Integer f;
	private Integer g;
	/**
	 * 奇偶个数比
	 */
	private Integer odd;
	private Integer even;
	/**
	 * 余3个数比
	 */
	private Integer thanthreeratio0;
	private Integer thanthreeratio1;
	private Integer thanthreeratio2;
	/**
	 * 余5个数比
	 */
	private Integer thanfiveratio0;
	private Integer thanfiveratio1;
	private Integer thanfiveratio2;
	private Integer thanfiveratio3;
	private Integer thanfiveratio4;
	/**
	 * 余7个数比
	 */
	private Integer thansevenratio0;
	private Integer thansevenratio1;
	private Integer thansevenratio2;
	private Integer thansevenratio3;
	private Integer thansevenratio4;
	private Integer thansevenratio5;
	private Integer thansevenratio6;
	/**
	 * 上下区个数比
	 */
	private Integer upperareas;
	private Integer lowerareas;
	/**
	 * 4区之比
	 */
	private Integer fourtharea1;
	private Integer fourtharea2;
	private Integer fourtharea3;
	private Integer fourtharea4;
	/**
	 * 6区之比
	 */
	private Integer sixarea1;
	private Integer sixarea2;
	private Integer sixarea3;
	private Integer sixarea4;
	private Integer sixarea5;
	private Integer sixarea6;
	/**
	 * 9区之比
	 */
	private Integer ninearea1;
	private Integer ninearea2;
	private Integer ninearea3;
	private Integer ninearea4;
	private Integer ninearea5;
	private Integer ninearea6;
	private Integer ninearea7;
	private Integer ninearea8;
	private Integer ninearea9;
	/**
	 * 连号个数
	 */
	private String consecutivenumber;
	/**
	 * 长度
	 */
	private Integer length;
	/**
	 * 总和
	 */
	private Integer total;
	/**
	 * 横向间隔和
	 */
	private Integer thanthehorizontalspacingadd;
	/**
	 * 横向间隔比
	 */
	private String thanthehorizontalspacing;
	/**
	 * T值
	 */
	private Integer t;
	/**
	 * 出现尾数值：即将原来数模十后出现的数值。
	 */
	private String lastvalueappears;
	/**
	 * 横纵比
	 */
	private String horver;
	/**
	 * 起始号码
	 */
	private Integer firstnum;
	/**
	 * 号码
	 */
	private String strnum;

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public Integer getB() {
		return b;
	}

	public void setB(Integer b) {
		this.b = b;
	}

	public Integer getC() {
		return c;
	}

	public void setC(Integer c) {
		this.c = c;
	}

	public Integer getD() {
		return d;
	}

	public void setD(Integer d) {
		this.d = d;
	}

	public Integer getE() {
		return e;
	}

	public void setE(Integer e) {
		this.e = e;
	}

	public Integer getF() {
		return f;
	}

	public void setF(Integer f) {
		this.f = f;
	}

	public Integer getG() {
		return g;
	}

	public void setG(Integer g) {
		this.g = g;
	}

	public Integer getOdd() {
		return odd;
	}

	public void setOdd(Integer odd) {
		this.odd = odd;
	}

	public Integer getEven() {
		return even;
	}

	public void setEven(Integer even) {
		this.even = even;
	}

	public Integer getThanthreeratio0() {
		return thanthreeratio0;
	}

	public void setThanthreeratio0(Integer thanthreeratio0) {
		this.thanthreeratio0 = thanthreeratio0;
	}

	public Integer getThanthreeratio1() {
		return thanthreeratio1;
	}

	public void setThanthreeratio1(Integer thanthreeratio1) {
		this.thanthreeratio1 = thanthreeratio1;
	}

	public Integer getThanthreeratio2() {
		return thanthreeratio2;
	}

	public void setThanthreeratio2(Integer thanthreeratio2) {
		this.thanthreeratio2 = thanthreeratio2;
	}

	public Integer getThanfiveratio0() {
		return thanfiveratio0;
	}

	public void setThanfiveratio0(Integer thanfiveratio0) {
		this.thanfiveratio0 = thanfiveratio0;
	}

	public Integer getThanfiveratio1() {
		return thanfiveratio1;
	}

	public void setThanfiveratio1(Integer thanfiveratio1) {
		this.thanfiveratio1 = thanfiveratio1;
	}

	public Integer getThanfiveratio2() {
		return thanfiveratio2;
	}

	public void setThanfiveratio2(Integer thanfiveratio2) {
		this.thanfiveratio2 = thanfiveratio2;
	}

	public Integer getThanfiveratio3() {
		return thanfiveratio3;
	}

	public void setThanfiveratio3(Integer thanfiveratio3) {
		this.thanfiveratio3 = thanfiveratio3;
	}

	public Integer getThanfiveratio4() {
		return thanfiveratio4;
	}

	public void setThanfiveratio4(Integer thanfiveratio4) {
		this.thanfiveratio4 = thanfiveratio4;
	}

	public Integer getThansevenratio0() {
		return thansevenratio0;
	}

	public void setThansevenratio0(Integer thansevenratio0) {
		this.thansevenratio0 = thansevenratio0;
	}

	public Integer getThansevenratio1() {
		return thansevenratio1;
	}

	public void setThansevenratio1(Integer thansevenratio1) {
		this.thansevenratio1 = thansevenratio1;
	}

	public Integer getThansevenratio2() {
		return thansevenratio2;
	}

	public void setThansevenratio2(Integer thansevenratio2) {
		this.thansevenratio2 = thansevenratio2;
	}

	public Integer getThansevenratio3() {
		return thansevenratio3;
	}

	public void setThansevenratio3(Integer thansevenratio3) {
		this.thansevenratio3 = thansevenratio3;
	}

	public Integer getThansevenratio4() {
		return thansevenratio4;
	}

	public void setThansevenratio4(Integer thansevenratio4) {
		this.thansevenratio4 = thansevenratio4;
	}

	public Integer getThansevenratio5() {
		return thansevenratio5;
	}

	public void setThansevenratio5(Integer thansevenratio5) {
		this.thansevenratio5 = thansevenratio5;
	}

	public Integer getThansevenratio6() {
		return thansevenratio6;
	}

	public void setThansevenratio6(Integer thansevenratio6) {
		this.thansevenratio6 = thansevenratio6;
	}

	public Integer getUpperareas() {
		return upperareas;
	}

	public void setUpperareas(Integer upperareas) {
		this.upperareas = upperareas;
	}

	public Integer getLowerareas() {
		return lowerareas;
	}

	public void setLowerareas(Integer lowerareas) {
		this.lowerareas = lowerareas;
	}

	public Integer getFourtharea1() {
		return fourtharea1;
	}

	public void setFourtharea1(Integer fourtharea1) {
		this.fourtharea1 = fourtharea1;
	}

	public Integer getFourtharea2() {
		return fourtharea2;
	}

	public void setFourtharea2(Integer fourtharea2) {
		this.fourtharea2 = fourtharea2;
	}

	public Integer getFourtharea3() {
		return fourtharea3;
	}

	public void setFourtharea3(Integer fourtharea3) {
		this.fourtharea3 = fourtharea3;
	}

	public Integer getFourtharea4() {
		return fourtharea4;
	}

	public void setFourtharea4(Integer fourtharea4) {
		this.fourtharea4 = fourtharea4;
	}

	public Integer getSixarea1() {
		return sixarea1;
	}

	public void setSixarea1(Integer sixarea1) {
		this.sixarea1 = sixarea1;
	}

	public Integer getSixarea2() {
		return sixarea2;
	}

	public void setSixarea2(Integer sixarea2) {
		this.sixarea2 = sixarea2;
	}

	public Integer getSixarea3() {
		return sixarea3;
	}

	public void setSixarea3(Integer sixarea3) {
		this.sixarea3 = sixarea3;
	}

	public Integer getSixarea4() {
		return sixarea4;
	}

	public void setSixarea4(Integer sixarea4) {
		this.sixarea4 = sixarea4;
	}

	public Integer getSixarea5() {
		return sixarea5;
	}

	public void setSixarea5(Integer sixarea5) {
		this.sixarea5 = sixarea5;
	}

	public Integer getSixarea6() {
		return sixarea6;
	}

	public void setSixarea6(Integer sixarea6) {
		this.sixarea6 = sixarea6;
	}

	public Integer getNinearea1() {
		return ninearea1;
	}

	public void setNinearea1(Integer ninearea1) {
		this.ninearea1 = ninearea1;
	}

	public Integer getNinearea2() {
		return ninearea2;
	}

	public void setNinearea2(Integer ninearea2) {
		this.ninearea2 = ninearea2;
	}

	public Integer getNinearea3() {
		return ninearea3;
	}

	public void setNinearea3(Integer ninearea3) {
		this.ninearea3 = ninearea3;
	}

	public Integer getNinearea4() {
		return ninearea4;
	}

	public void setNinearea4(Integer ninearea4) {
		this.ninearea4 = ninearea4;
	}

	public Integer getNinearea5() {
		return ninearea5;
	}

	public void setNinearea5(Integer ninearea5) {
		this.ninearea5 = ninearea5;
	}

	public Integer getNinearea6() {
		return ninearea6;
	}

	public void setNinearea6(Integer ninearea6) {
		this.ninearea6 = ninearea6;
	}

	public Integer getNinearea7() {
		return ninearea7;
	}

	public void setNinearea7(Integer ninearea7) {
		this.ninearea7 = ninearea7;
	}

	public Integer getNinearea8() {
		return ninearea8;
	}

	public void setNinearea8(Integer ninearea8) {
		this.ninearea8 = ninearea8;
	}

	public Integer getNinearea9() {
		return ninearea9;
	}

	public void setNinearea9(Integer ninearea9) {
		this.ninearea9 = ninearea9;
	}

	public String getConsecutivenumber() {
		return consecutivenumber;
	}

	public void setConsecutivenumber(String consecutivenumber) {
		this.consecutivenumber = consecutivenumber;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getThanthehorizontalspacingadd() {
		return thanthehorizontalspacingadd;
	}

	public void setThanthehorizontalspacingadd(
			Integer thanthehorizontalspacingadd) {
		this.thanthehorizontalspacingadd = thanthehorizontalspacingadd;
	}

	public String getThanthehorizontalspacing() {
		return thanthehorizontalspacing;
	}

	public void setThanthehorizontalspacing(String thanthehorizontalspacing) {
		this.thanthehorizontalspacing = thanthehorizontalspacing;
	}

	public Integer getT() {
		return t;
	}

	public void setT(Integer t) {
		this.t = t;
	}

	public String getLastvalueappears() {
		return lastvalueappears;
	}

	public void setLastvalueappears(String lastvalueappears) {
		this.lastvalueappears = lastvalueappears;
	}

	public String getHorver() {
		return horver;
	}

	public void setHorver(String horver) {
		this.horver = horver;
	}

	public Integer getFirstnum() {
		return firstnum;
	}

	public void setFirstnum(Integer firstnum) {
		this.firstnum = firstnum;
	}

	public String getStrnum() {
		return strnum;
	}

	public void setStrnum(String strnum) {
		this.strnum = strnum;
	}
	public void init(Base lottery) {
		lottery.setOdd(0);
		lottery.setEven(0);
		lottery.setUpperareas(0);
		lottery.setLowerareas(0);
		lottery.setThanthreeratio0(0);
		lottery.setThanthreeratio1(0);
		lottery.setThanthreeratio2(0);
		lottery.setThanfiveratio0(0);
		lottery.setThanfiveratio1(0);
		lottery.setThanfiveratio2(0);
		lottery.setThanfiveratio3(0);
		lottery.setThanfiveratio4(0);
		lottery.setThansevenratio0(0);
		lottery.setThansevenratio1(0);
		lottery.setThansevenratio2(0);
		lottery.setThansevenratio3(0);
		lottery.setThansevenratio4(0);
		lottery.setThansevenratio5(0);
		lottery.setThansevenratio6(0);
		lottery.setFourtharea1(0);
		lottery.setFourtharea2(0);
		lottery.setFourtharea3(0);
		lottery.setFourtharea4(0);
		lottery.setSixarea1(0);
		lottery.setSixarea2(0);
		lottery.setSixarea3(0);
		lottery.setSixarea4(0);
		lottery.setSixarea5(0);
		lottery.setSixarea6(0);
		lottery.setNinearea1(0);
		lottery.setNinearea2(0);
		lottery.setNinearea3(0);
		lottery.setNinearea4(0);
		lottery.setNinearea5(0);
		lottery.setNinearea6(0);
		lottery.setNinearea7(0);
		lottery.setNinearea8(0);
		lottery.setNinearea9(0);
		lottery.setLastvalueappears("");
	}
}
