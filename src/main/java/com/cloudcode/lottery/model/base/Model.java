package com.cloudcode.lottery.model.base;

import java.util.Date;

import javax.persistence.MappedSuperclass;

import com.cloudcode.framework.model.BaseModelObject;
import com.cloudcode.framework.utils.Check;

@MappedSuperclass
public class Model extends BaseModelObject {
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
	private Integer odd;
	private Integer even;
	private Integer thanthreeratio0;
	private Integer thanthreeratio1;
	private Integer thanthreeratio2;
	private Integer thanfiveratio0;
	private Integer thanfiveratio1;
	private Integer thanfiveratio2;
	private Integer thanfiveratio3;
	private Integer thanfiveratio4;
	private Integer thansevenratio0;
	private Integer thansevenratio1;
	private Integer thansevenratio2;
	private Integer thansevenratio3;
	private Integer thansevenratio4;
	private Integer thansevenratio5;
	private Integer thansevenratio6;
	private Integer upperareas;
	private Integer lowerareas;
	private Integer fourtharea1;
	private Integer fourtharea2;
	private Integer fourtharea3;
	private Integer fourtharea4;
	private Integer sixarea1;
	private Integer sixarea2;
	private Integer sixarea3;
	private Integer sixarea4;
	private Integer sixarea5;
	private Integer sixarea6;
	private Integer ninearea1;
	private Integer ninearea2;
	private Integer ninearea3;
	private Integer ninearea4;
	private Integer ninearea5;
	private Integer ninearea6;
	private Integer ninearea7;
	private Integer ninearea8;
	private Integer ninearea9;
	private Integer oddtotal;
	private Integer eventotal;
	private Integer oddnear;
	private Integer evennear;
	private Integer thanthreeratio0total;
	private Integer thanthreeratio1total;
	private Integer thanthreeratio2total;
	private Integer thanthreeratio0near;
	private Integer thanthreeratio1near;
	private Integer thanthreeratio2near;
	private Integer thanfiveratio0total;
	private Integer thanfiveratio1total;
	private Integer thanfiveratio2total;
	private Integer thanfiveratio3total;
	private Integer thanfiveratio4total;
	private Integer thanfiveratio0near;
	private Integer thanfiveratio1near;
	private Integer thanfiveratio2near;
	private Integer thanfiveratio3near;
	private Integer thanfiveratio4near;
	private Integer thansevenratio0total;
	private Integer thansevenratio1total;
	private Integer thansevenratio2total;
	private Integer thansevenratio3total;
	private Integer thansevenratio4total;
	private Integer thansevenratio5total;
	private Integer thansevenratio6total;
	private Integer thansevenratio0near;
	private Integer thansevenratio1near;
	private Integer thansevenratio2near;
	private Integer thansevenratio3near;
	private Integer thansevenratio4near;
	private Integer thansevenratio5near;
	private Integer thansevenratio6near;
	private Integer upperareastotal;
	private Integer lowerareastotal;
	private Integer upperareasnear;
	private Integer lowerareasnear;
	private Integer fourtharea1total;
	private Integer fourtharea2total;
	private Integer fourtharea3total;
	private Integer fourtharea4total;
	private Integer fourtharea1near;
	private Integer fourtharea2near;
	private Integer fourtharea3near;
	private Integer fourtharea4near;
	private Integer sixarea1total;
	private Integer sixarea2total;
	private Integer sixarea3total;
	private Integer sixarea4total;
	private Integer sixarea5total;
	private Integer sixarea6total;
	private Integer sixarea1near;
	private Integer sixarea2near;
	private Integer sixarea3near;
	private Integer sixarea4near;
	private Integer sixarea5near;
	private Integer sixarea6near;
	private Integer ninearea1total;
	private Integer ninearea2total;
	private Integer ninearea3total;
	private Integer ninearea4total;
	private Integer ninearea5total;
	private Integer ninearea6total;
	private Integer ninearea7total;
	private Integer ninearea8total;
	private Integer ninearea9total;
	private Integer ninearea1near;
	private Integer ninearea2near;
	private Integer ninearea3near;
	private Integer ninearea4near;
	private Integer ninearea5near;
	private Integer ninearea6near;
	private Integer ninearea7near;
	private Integer ninearea8near;
	private Integer ninearea9near;
	private Integer consecutivenumber;
	private String Integerervaland;
	private Integer Integerervalandtotal;
	private Integer Integerervalandmin;
	private Integer Integerervalandmax;
	private Integer Integerervalandpostmin;
	private Integer Integerervalandpostmax;
	private Integer length;
	private Integer total;
	private Integer totalmin;
	private Integer totalmax;
	private Double totalavg;
	private Integer thanthehorizontalspacingadd;
	private String thanthehorizontalspacing;
	private Integer t;
	private Integer newno;
	private Integer repeatno;
	private Integer noside;
	private String ratioonthethreenumbers;
	private String ratioonthefivenumbers;
	private String ratioonthesevennumbers;
	private String ratioonthetennumbers;
	private String lastvalueappears;
	private Integer heat1;
	private Integer heat2;
	private Integer heat3;
	private Integer heat4;
	private Integer heat5;
	private Integer heat6;
	private Integer heat7;
	private Integer heat8;
	private Integer heat9;
	private Integer heat10;
	private Integer heat11;
	private Integer heat12;
	private Integer heat13;
	private Integer heat14;
	private Integer heat15;
	private Integer heat16;
	private Integer heat17;
	private Integer heat18;
	private Integer heat19;
	private Integer heat20;
	private Integer heat21;
	private Integer heat22;
	private Integer heat23;
	private Integer heat24;
	private Integer heat25;
	private Integer heat26;
	private Integer heat27;
	private Integer heat28;
	private Integer heat29;
	private Integer heat30;
	private Integer heat31;
	private Integer heat32;
	private Integer heat33;
	private Integer heat34;
	private Integer heat35;
	private Integer heat36;
	private Integer Integerervaland1;
	private Integer Integerervaland2;
	private Integer Integerervaland3;
	private Integer Integerervaland4;
	private Integer Integerervaland5;
	private Integer Integerervaland6;
	private Integer Integerervaland7;
	private Integer Integerervaland8;
	private Integer Integerervaland9;
	private Integer Integerervaland10;
	private Integer Integerervaland11;
	private Integer Integerervaland12;
	private Integer Integerervaland13;
	private Integer Integerervaland14;
	private Integer Integerervaland15;
	private Integer Integerervaland16;
	private Integer Integerervaland17;
	private Integer Integerervaland18;
	private Integer Integerervaland19;
	private Integer Integerervaland20;
	private Integer Integerervaland21;
	private Integer Integerervaland22;
	private Integer Integerervaland23;
	private Integer Integerervaland24;
	private Integer Integerervaland25;
	private Integer Integerervaland26;
	private Integer Integerervaland27;
	private Integer Integerervaland28;
	private Integer Integerervaland29;
	private Integer Integerervaland30;
	private Integer Integerervaland31;
	private Integer Integerervaland32;
	private Integer Integerervaland33;
	private Integer Integerervaland34;
	private Integer Integerervaland35;
	private Integer Integerervaland36;
	private Date drawtime;
	private String whether;
	private String remark;
	private String horver;
	private Integer threeareas1;
	private Integer threeareas2;
	private Integer threeareas3;
	private Integer Integerervalandone;
	private Integer firstnum;
	private Integer upperlowerareas;
	private Integer threeareas;
	private Integer fourthareas;
	private Integer sixareas;
	private Integer nineareas;
	private Integer thanthreeratios;
	private Integer thanfiveratios;
	private Integer thansevenratios;
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

	public Integer getOddtotal() {
		return oddtotal;
	}

	public void setOddtotal(Integer oddtotal) {
		this.oddtotal = oddtotal;
	}

	public Integer getEventotal() {
		return eventotal;
	}

	public void setEventotal(Integer eventotal) {
		this.eventotal = eventotal;
	}

	public Integer getOddnear() {
		return oddnear;
	}

	public void setOddnear(Integer oddnear) {
		this.oddnear = oddnear;
	}

	public Integer getEvennear() {
		return evennear;
	}

	public void setEvennear(Integer evennear) {
		this.evennear = evennear;
	}

	public Integer getThanthreeratio0total() {
		return thanthreeratio0total;
	}

	public void setThanthreeratio0total(Integer thanthreeratio0total) {
		this.thanthreeratio0total = thanthreeratio0total;
	}

	public Integer getThanthreeratio1total() {
		return thanthreeratio1total;
	}

	public void setThanthreeratio1total(Integer thanthreeratio1total) {
		this.thanthreeratio1total = thanthreeratio1total;
	}

	public Integer getThanthreeratio2total() {
		return thanthreeratio2total;
	}

	public void setThanthreeratio2total(Integer thanthreeratio2total) {
		this.thanthreeratio2total = thanthreeratio2total;
	}

	public Integer getThanthreeratio0near() {
		return thanthreeratio0near;
	}

	public void setThanthreeratio0near(Integer thanthreeratio0near) {
		this.thanthreeratio0near = thanthreeratio0near;
	}

	public Integer getThanthreeratio1near() {
		return thanthreeratio1near;
	}

	public void setThanthreeratio1near(Integer thanthreeratio1near) {
		this.thanthreeratio1near = thanthreeratio1near;
	}

	public Integer getThanthreeratio2near() {
		return thanthreeratio2near;
	}

	public void setThanthreeratio2near(Integer thanthreeratio2near) {
		this.thanthreeratio2near = thanthreeratio2near;
	}

	public Integer getThanfiveratio0total() {
		return thanfiveratio0total;
	}

	public void setThanfiveratio0total(Integer thanfiveratio0total) {
		this.thanfiveratio0total = thanfiveratio0total;
	}

	public Integer getThanfiveratio1total() {
		return thanfiveratio1total;
	}

	public void setThanfiveratio1total(Integer thanfiveratio1total) {
		this.thanfiveratio1total = thanfiveratio1total;
	}

	public Integer getThanfiveratio2total() {
		return thanfiveratio2total;
	}

	public void setThanfiveratio2total(Integer thanfiveratio2total) {
		this.thanfiveratio2total = thanfiveratio2total;
	}

	public Integer getThanfiveratio3total() {
		return thanfiveratio3total;
	}

	public void setThanfiveratio3total(Integer thanfiveratio3total) {
		this.thanfiveratio3total = thanfiveratio3total;
	}

	public Integer getThanfiveratio4total() {
		return thanfiveratio4total;
	}

	public void setThanfiveratio4total(Integer thanfiveratio4total) {
		this.thanfiveratio4total = thanfiveratio4total;
	}

	public Integer getThanfiveratio0near() {
		return thanfiveratio0near;
	}

	public void setThanfiveratio0near(Integer thanfiveratio0near) {
		this.thanfiveratio0near = thanfiveratio0near;
	}

	public Integer getThanfiveratio1near() {
		return thanfiveratio1near;
	}

	public void setThanfiveratio1near(Integer thanfiveratio1near) {
		this.thanfiveratio1near = thanfiveratio1near;
	}

	public Integer getThanfiveratio2near() {
		return thanfiveratio2near;
	}

	public void setThanfiveratio2near(Integer thanfiveratio2near) {
		this.thanfiveratio2near = thanfiveratio2near;
	}

	public Integer getThanfiveratio3near() {
		return thanfiveratio3near;
	}

	public void setThanfiveratio3near(Integer thanfiveratio3near) {
		this.thanfiveratio3near = thanfiveratio3near;
	}

	public Integer getThanfiveratio4near() {
		return thanfiveratio4near;
	}

	public void setThanfiveratio4near(Integer thanfiveratio4near) {
		this.thanfiveratio4near = thanfiveratio4near;
	}

	public Integer getThansevenratio0total() {
		return thansevenratio0total;
	}

	public void setThansevenratio0total(Integer thansevenratio0total) {
		this.thansevenratio0total = thansevenratio0total;
	}

	public Integer getThansevenratio1total() {
		return thansevenratio1total;
	}

	public void setThansevenratio1total(Integer thansevenratio1total) {
		this.thansevenratio1total = thansevenratio1total;
	}

	public Integer getThansevenratio2total() {
		return thansevenratio2total;
	}

	public void setThansevenratio2total(Integer thansevenratio2total) {
		this.thansevenratio2total = thansevenratio2total;
	}

	public Integer getThansevenratio3total() {
		return thansevenratio3total;
	}

	public void setThansevenratio3total(Integer thansevenratio3total) {
		this.thansevenratio3total = thansevenratio3total;
	}

	public Integer getThansevenratio4total() {
		return thansevenratio4total;
	}

	public void setThansevenratio4total(Integer thansevenratio4total) {
		this.thansevenratio4total = thansevenratio4total;
	}

	public Integer getThansevenratio5total() {
		return thansevenratio5total;
	}

	public void setThansevenratio5total(Integer thansevenratio5total) {
		this.thansevenratio5total = thansevenratio5total;
	}

	public Integer getThansevenratio6total() {
		return thansevenratio6total;
	}

	public void setThansevenratio6total(Integer thansevenratio6total) {
		this.thansevenratio6total = thansevenratio6total;
	}

	public Integer getThansevenratio0near() {
		return thansevenratio0near;
	}

	public void setThansevenratio0near(Integer thansevenratio0near) {
		this.thansevenratio0near = thansevenratio0near;
	}

	public Integer getThansevenratio1near() {
		return thansevenratio1near;
	}

	public void setThansevenratio1near(Integer thansevenratio1near) {
		this.thansevenratio1near = thansevenratio1near;
	}

	public Integer getThansevenratio2near() {
		return thansevenratio2near;
	}

	public void setThansevenratio2near(Integer thansevenratio2near) {
		this.thansevenratio2near = thansevenratio2near;
	}

	public Integer getThansevenratio3near() {
		return thansevenratio3near;
	}

	public void setThansevenratio3near(Integer thansevenratio3near) {
		this.thansevenratio3near = thansevenratio3near;
	}

	public Integer getThansevenratio4near() {
		return thansevenratio4near;
	}

	public void setThansevenratio4near(Integer thansevenratio4near) {
		this.thansevenratio4near = thansevenratio4near;
	}

	public Integer getThansevenratio5near() {
		return thansevenratio5near;
	}

	public void setThansevenratio5near(Integer thansevenratio5near) {
		this.thansevenratio5near = thansevenratio5near;
	}

	public Integer getThansevenratio6near() {
		return thansevenratio6near;
	}

	public void setThansevenratio6near(Integer thansevenratio6near) {
		this.thansevenratio6near = thansevenratio6near;
	}

	public Integer getUpperareastotal() {
		return upperareastotal;
	}

	public void setUpperareastotal(Integer upperareastotal) {
		this.upperareastotal = upperareastotal;
	}

	public Integer getLowerareastotal() {
		return lowerareastotal;
	}

	public void setLowerareastotal(Integer lowerareastotal) {
		this.lowerareastotal = lowerareastotal;
	}

	public Integer getUpperareasnear() {
		return upperareasnear;
	}

	public void setUpperareasnear(Integer upperareasnear) {
		this.upperareasnear = upperareasnear;
	}

	public Integer getLowerareasnear() {
		return lowerareasnear;
	}

	public void setLowerareasnear(Integer lowerareasnear) {
		this.lowerareasnear = lowerareasnear;
	}

	public Integer getFourtharea1total() {
		return fourtharea1total;
	}

	public void setFourtharea1total(Integer fourtharea1total) {
		this.fourtharea1total = fourtharea1total;
	}

	public Integer getFourtharea2total() {
		return fourtharea2total;
	}

	public void setFourtharea2total(Integer fourtharea2total) {
		this.fourtharea2total = fourtharea2total;
	}

	public Integer getFourtharea3total() {
		return fourtharea3total;
	}

	public void setFourtharea3total(Integer fourtharea3total) {
		this.fourtharea3total = fourtharea3total;
	}

	public Integer getFourtharea4total() {
		return fourtharea4total;
	}

	public void setFourtharea4total(Integer fourtharea4total) {
		this.fourtharea4total = fourtharea4total;
	}

	public Integer getFourtharea1near() {
		return fourtharea1near;
	}

	public void setFourtharea1near(Integer fourtharea1near) {
		this.fourtharea1near = fourtharea1near;
	}

	public Integer getFourtharea2near() {
		return fourtharea2near;
	}

	public void setFourtharea2near(Integer fourtharea2near) {
		this.fourtharea2near = fourtharea2near;
	}

	public Integer getFourtharea3near() {
		return fourtharea3near;
	}

	public void setFourtharea3near(Integer fourtharea3near) {
		this.fourtharea3near = fourtharea3near;
	}

	public Integer getFourtharea4near() {
		return fourtharea4near;
	}

	public void setFourtharea4near(Integer fourtharea4near) {
		this.fourtharea4near = fourtharea4near;
	}

	public Integer getSixarea1total() {
		return sixarea1total;
	}

	public void setSixarea1total(Integer sixarea1total) {
		this.sixarea1total = sixarea1total;
	}

	public Integer getSixarea2total() {
		return sixarea2total;
	}

	public void setSixarea2total(Integer sixarea2total) {
		this.sixarea2total = sixarea2total;
	}

	public Integer getSixarea3total() {
		return sixarea3total;
	}

	public void setSixarea3total(Integer sixarea3total) {
		this.sixarea3total = sixarea3total;
	}

	public Integer getSixarea4total() {
		return sixarea4total;
	}

	public void setSixarea4total(Integer sixarea4total) {
		this.sixarea4total = sixarea4total;
	}

	public Integer getSixarea5total() {
		return sixarea5total;
	}

	public void setSixarea5total(Integer sixarea5total) {
		this.sixarea5total = sixarea5total;
	}

	public Integer getSixarea6total() {
		return sixarea6total;
	}

	public void setSixarea6total(Integer sixarea6total) {
		this.sixarea6total = sixarea6total;
	}

	public Integer getSixarea1near() {
		return sixarea1near;
	}

	public void setSixarea1near(Integer sixarea1near) {
		this.sixarea1near = sixarea1near;
	}

	public Integer getSixarea2near() {
		return sixarea2near;
	}

	public void setSixarea2near(Integer sixarea2near) {
		this.sixarea2near = sixarea2near;
	}

	public Integer getSixarea3near() {
		return sixarea3near;
	}

	public void setSixarea3near(Integer sixarea3near) {
		this.sixarea3near = sixarea3near;
	}

	public Integer getSixarea4near() {
		return sixarea4near;
	}

	public void setSixarea4near(Integer sixarea4near) {
		this.sixarea4near = sixarea4near;
	}

	public Integer getSixarea5near() {
		return sixarea5near;
	}

	public void setSixarea5near(Integer sixarea5near) {
		this.sixarea5near = sixarea5near;
	}

	public Integer getSixarea6near() {
		return sixarea6near;
	}

	public void setSixarea6near(Integer sixarea6near) {
		this.sixarea6near = sixarea6near;
	}

	public Integer getNinearea1total() {
		return ninearea1total;
	}

	public void setNinearea1total(Integer ninearea1total) {
		this.ninearea1total = ninearea1total;
	}

	public Integer getNinearea2total() {
		return ninearea2total;
	}

	public void setNinearea2total(Integer ninearea2total) {
		this.ninearea2total = ninearea2total;
	}

	public Integer getNinearea3total() {
		return ninearea3total;
	}

	public void setNinearea3total(Integer ninearea3total) {
		this.ninearea3total = ninearea3total;
	}

	public Integer getNinearea4total() {
		return ninearea4total;
	}

	public void setNinearea4total(Integer ninearea4total) {
		this.ninearea4total = ninearea4total;
	}

	public Integer getNinearea5total() {
		return ninearea5total;
	}

	public void setNinearea5total(Integer ninearea5total) {
		this.ninearea5total = ninearea5total;
	}

	public Integer getNinearea6total() {
		return ninearea6total;
	}

	public void setNinearea6total(Integer ninearea6total) {
		this.ninearea6total = ninearea6total;
	}

	public Integer getNinearea7total() {
		return ninearea7total;
	}

	public void setNinearea7total(Integer ninearea7total) {
		this.ninearea7total = ninearea7total;
	}

	public Integer getNinearea8total() {
		return ninearea8total;
	}

	public void setNinearea8total(Integer ninearea8total) {
		this.ninearea8total = ninearea8total;
	}

	public Integer getNinearea9total() {
		return ninearea9total;
	}

	public void setNinearea9total(Integer ninearea9total) {
		this.ninearea9total = ninearea9total;
	}

	public Integer getNinearea1near() {
		return ninearea1near;
	}

	public void setNinearea1near(Integer ninearea1near) {
		this.ninearea1near = ninearea1near;
	}

	public Integer getNinearea2near() {
		return ninearea2near;
	}

	public void setNinearea2near(Integer ninearea2near) {
		this.ninearea2near = ninearea2near;
	}

	public Integer getNinearea3near() {
		return ninearea3near;
	}

	public void setNinearea3near(Integer ninearea3near) {
		this.ninearea3near = ninearea3near;
	}

	public Integer getNinearea4near() {
		return ninearea4near;
	}

	public void setNinearea4near(Integer ninearea4near) {
		this.ninearea4near = ninearea4near;
	}

	public Integer getNinearea5near() {
		return ninearea5near;
	}

	public void setNinearea5near(Integer ninearea5near) {
		this.ninearea5near = ninearea5near;
	}

	public Integer getNinearea6near() {
		return ninearea6near;
	}

	public void setNinearea6near(Integer ninearea6near) {
		this.ninearea6near = ninearea6near;
	}

	public Integer getNinearea7near() {
		return ninearea7near;
	}

	public void setNinearea7near(Integer ninearea7near) {
		this.ninearea7near = ninearea7near;
	}

	public Integer getNinearea8near() {
		return ninearea8near;
	}

	public void setNinearea8near(Integer ninearea8near) {
		this.ninearea8near = ninearea8near;
	}

	public Integer getNinearea9near() {
		return ninearea9near;
	}

	public void setNinearea9near(Integer ninearea9near) {
		this.ninearea9near = ninearea9near;
	}

	public Integer getConsecutivenumber() {
		return consecutivenumber;
	}

	public void setConsecutivenumber(Integer consecutivenumber) {
		this.consecutivenumber = consecutivenumber;
	}

	public String getIntervaland() {
		return Integerervaland;
	}

	public void setIntervaland(String Integerervaland) {
		this.Integerervaland = Integerervaland;
	}

	public Integer getIntervalandtotal() {
		return Integerervalandtotal;
	}

	public void setIntervalandtotal(Integer Integerervalandtotal) {
		this.Integerervalandtotal = Integerervalandtotal;
	}

	public Integer getIntervalandmin() {
		return Integerervalandmin;
	}

	public void setIntervalandmin(Integer Integerervalandmin) {
		this.Integerervalandmin = Integerervalandmin;
	}

	public Integer getIntervalandmax() {
		return Integerervalandmax;
	}

	public void setIntervalandmax(Integer Integerervalandmax) {
		this.Integerervalandmax = Integerervalandmax;
	}

	public Integer getIntervalandpostmin() {
		return Integerervalandpostmin;
	}

	public void setIntervalandpostmin(Integer Integerervalandpostmin) {
		this.Integerervalandpostmin = Integerervalandpostmin;
	}

	public Integer getIntervalandpostmax() {
		return Integerervalandpostmax;
	}

	public void setIntervalandpostmax(Integer Integerervalandpostmax) {
		this.Integerervalandpostmax = Integerervalandpostmax;
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

	public Integer getTotalmin() {
		return totalmin;
	}

	public void setTotalmin(Integer totalmin) {
		this.totalmin = totalmin;
	}

	public Integer getTotalmax() {
		return totalmax;
	}

	public void setTotalmax(Integer totalmax) {
		this.totalmax = totalmax;
	}

	public Double getTotalavg() {
		return totalavg;
	}

	public void setTotalavg(Double totalavg) {
		this.totalavg = totalavg;
	}

	public Integer getThanthehorizontalspacingadd() {
		return thanthehorizontalspacingadd;
	}

	public void setThanthehorizontalspacingadd(Integer thanthehorizontalspacingadd) {
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

	public Integer getNewno() {
		return newno;
	}

	public void setNewno(Integer newno) {
		this.newno = newno;
	}

	public Integer getRepeatno() {
		return repeatno;
	}

	public void setRepeatno(Integer repeatno) {
		this.repeatno = repeatno;
	}

	public Integer getNoside() {
		return noside;
	}

	public void setNoside(Integer noside) {
		this.noside = noside;
	}

	public String getRatioonthethreenumbers() {
		return ratioonthethreenumbers;
	}

	public void setRatioonthethreenumbers(String ratioonthethreenumbers) {
		this.ratioonthethreenumbers = ratioonthethreenumbers;
	}

	public String getRatioonthefivenumbers() {
		return ratioonthefivenumbers;
	}

	public void setRatioonthefivenumbers(String ratioonthefivenumbers) {
		this.ratioonthefivenumbers = ratioonthefivenumbers;
	}

	public String getRatioonthesevennumbers() {
		return ratioonthesevennumbers;
	}

	public void setRatioonthesevennumbers(String ratioonthesevennumbers) {
		this.ratioonthesevennumbers = ratioonthesevennumbers;
	}

	public String getRatioonthetennumbers() {
		return ratioonthetennumbers;
	}

	public void setRatioonthetennumbers(String ratioonthetennumbers) {
		this.ratioonthetennumbers = ratioonthetennumbers;
	}

	public String getLastvalueappears() {
		return lastvalueappears;
	}

	public void setLastvalueappears(String lastvalueappears) {
		this.lastvalueappears = lastvalueappears;
	}

	public Integer getHeat1() {
		return heat1;
	}

	public void setHeat1(Integer heat1) {
		this.heat1 = heat1;
	}

	public Integer getHeat2() {
		return heat2;
	}

	public void setHeat2(Integer heat2) {
		this.heat2 = heat2;
	}

	public Integer getHeat3() {
		return heat3;
	}

	public void setHeat3(Integer heat3) {
		this.heat3 = heat3;
	}

	public Integer getHeat4() {
		return heat4;
	}

	public void setHeat4(Integer heat4) {
		this.heat4 = heat4;
	}

	public Integer getHeat5() {
		return heat5;
	}

	public void setHeat5(Integer heat5) {
		this.heat5 = heat5;
	}

	public Integer getHeat6() {
		return heat6;
	}

	public void setHeat6(Integer heat6) {
		this.heat6 = heat6;
	}

	public Integer getHeat7() {
		return heat7;
	}

	public void setHeat7(Integer heat7) {
		this.heat7 = heat7;
	}

	public Integer getHeat8() {
		return heat8;
	}

	public void setHeat8(Integer heat8) {
		this.heat8 = heat8;
	}

	public Integer getHeat9() {
		return heat9;
	}

	public void setHeat9(Integer heat9) {
		this.heat9 = heat9;
	}

	public Integer getHeat10() {
		return heat10;
	}

	public void setHeat10(Integer heat10) {
		this.heat10 = heat10;
	}

	public Integer getHeat11() {
		return heat11;
	}

	public void setHeat11(Integer heat11) {
		this.heat11 = heat11;
	}

	public Integer getHeat12() {
		return heat12;
	}

	public void setHeat12(Integer heat12) {
		this.heat12 = heat12;
	}

	public Integer getHeat13() {
		return heat13;
	}

	public void setHeat13(Integer heat13) {
		this.heat13 = heat13;
	}

	public Integer getHeat14() {
		return heat14;
	}

	public void setHeat14(Integer heat14) {
		this.heat14 = heat14;
	}

	public Integer getHeat15() {
		return heat15;
	}

	public void setHeat15(Integer heat15) {
		this.heat15 = heat15;
	}

	public Integer getHeat16() {
		return heat16;
	}

	public void setHeat16(Integer heat16) {
		this.heat16 = heat16;
	}

	public Integer getHeat17() {
		return heat17;
	}

	public void setHeat17(Integer heat17) {
		this.heat17 = heat17;
	}

	public Integer getHeat18() {
		return heat18;
	}

	public void setHeat18(Integer heat18) {
		this.heat18 = heat18;
	}

	public Integer getHeat19() {
		return heat19;
	}

	public void setHeat19(Integer heat19) {
		this.heat19 = heat19;
	}

	public Integer getHeat20() {
		return heat20;
	}

	public void setHeat20(Integer heat20) {
		this.heat20 = heat20;
	}

	public Integer getHeat21() {
		return heat21;
	}

	public void setHeat21(Integer heat21) {
		this.heat21 = heat21;
	}

	public Integer getHeat22() {
		return heat22;
	}

	public void setHeat22(Integer heat22) {
		this.heat22 = heat22;
	}

	public Integer getHeat23() {
		return heat23;
	}

	public void setHeat23(Integer heat23) {
		this.heat23 = heat23;
	}

	public Integer getHeat24() {
		return heat24;
	}

	public void setHeat24(Integer heat24) {
		this.heat24 = heat24;
	}

	public Integer getHeat25() {
		return heat25;
	}

	public void setHeat25(Integer heat25) {
		this.heat25 = heat25;
	}

	public Integer getHeat26() {
		return heat26;
	}

	public void setHeat26(Integer heat26) {
		this.heat26 = heat26;
	}

	public Integer getHeat27() {
		return heat27;
	}

	public void setHeat27(Integer heat27) {
		this.heat27 = heat27;
	}

	public Integer getHeat28() {
		return heat28;
	}

	public void setHeat28(Integer heat28) {
		this.heat28 = heat28;
	}

	public Integer getHeat29() {
		return heat29;
	}

	public void setHeat29(Integer heat29) {
		this.heat29 = heat29;
	}

	public Integer getHeat30() {
		return heat30;
	}

	public void setHeat30(Integer heat30) {
		this.heat30 = heat30;
	}

	public Integer getHeat31() {
		return heat31;
	}

	public void setHeat31(Integer heat31) {
		this.heat31 = heat31;
	}

	public Integer getHeat32() {
		return heat32;
	}

	public void setHeat32(Integer heat32) {
		this.heat32 = heat32;
	}

	public Integer getHeat33() {
		return heat33;
	}

	public void setHeat33(Integer heat33) {
		this.heat33 = heat33;
	}

	public Integer getHeat34() {
		return heat34;
	}

	public void setHeat34(Integer heat34) {
		this.heat34 = heat34;
	}

	public Integer getHeat35() {
		return heat35;
	}

	public void setHeat35(Integer heat35) {
		this.heat35 = heat35;
	}

	public Integer getHeat36() {
		return heat36;
	}

	public void setHeat36(Integer heat36) {
		this.heat36 = heat36;
	}

	public Integer getIntervaland1() {
		return Integerervaland1;
	}

	public void setIntervaland1(Integer Integerervaland1) {
		this.Integerervaland1 = Integerervaland1;
	}

	public Integer getIntervaland2() {
		return Integerervaland2;
	}

	public void setIntervaland2(Integer Integerervaland2) {
		this.Integerervaland2 = Integerervaland2;
	}

	public Integer getIntervaland3() {
		return Integerervaland3;
	}

	public void setIntervaland3(Integer Integerervaland3) {
		this.Integerervaland3 = Integerervaland3;
	}

	public Integer getIntervaland4() {
		return Integerervaland4;
	}

	public void setIntervaland4(Integer Integerervaland4) {
		this.Integerervaland4 = Integerervaland4;
	}

	public Integer getIntervaland5() {
		return Integerervaland5;
	}

	public void setIntervaland5(Integer Integerervaland5) {
		this.Integerervaland5 = Integerervaland5;
	}

	public Integer getIntervaland6() {
		return Integerervaland6;
	}

	public void setIntervaland6(Integer Integerervaland6) {
		this.Integerervaland6 = Integerervaland6;
	}

	public Integer getIntervaland7() {
		return Integerervaland7;
	}

	public void setIntervaland7(Integer Integerervaland7) {
		this.Integerervaland7 = Integerervaland7;
	}

	public Integer getIntervaland8() {
		return Integerervaland8;
	}

	public void setIntervaland8(Integer Integerervaland8) {
		this.Integerervaland8 = Integerervaland8;
	}

	public Integer getIntervaland9() {
		return Integerervaland9;
	}

	public void setIntervaland9(Integer Integerervaland9) {
		this.Integerervaland9 = Integerervaland9;
	}

	public Integer getIntervaland10() {
		return Integerervaland10;
	}

	public void setIntervaland10(Integer Integerervaland10) {
		this.Integerervaland10 = Integerervaland10;
	}

	public Integer getIntervaland11() {
		return Integerervaland11;
	}

	public void setIntervaland11(Integer Integerervaland11) {
		this.Integerervaland11 = Integerervaland11;
	}

	public Integer getIntervaland12() {
		return Integerervaland12;
	}

	public void setIntervaland12(Integer Integerervaland12) {
		this.Integerervaland12 = Integerervaland12;
	}

	public Integer getIntervaland13() {
		return Integerervaland13;
	}

	public void setIntervaland13(Integer Integerervaland13) {
		this.Integerervaland13 = Integerervaland13;
	}

	public Integer getIntervaland14() {
		return Integerervaland14;
	}

	public void setIntervaland14(Integer Integerervaland14) {
		this.Integerervaland14 = Integerervaland14;
	}

	public Integer getIntervaland15() {
		return Integerervaland15;
	}

	public void setIntervaland15(Integer Integerervaland15) {
		this.Integerervaland15 = Integerervaland15;
	}

	public Integer getIntervaland16() {
		return Integerervaland16;
	}

	public void setIntervaland16(Integer Integerervaland16) {
		this.Integerervaland16 = Integerervaland16;
	}

	public Integer getIntervaland17() {
		return Integerervaland17;
	}

	public void setIntervaland17(Integer Integerervaland17) {
		this.Integerervaland17 = Integerervaland17;
	}

	public Integer getIntervaland18() {
		return Integerervaland18;
	}

	public void setIntervaland18(Integer Integerervaland18) {
		this.Integerervaland18 = Integerervaland18;
	}

	public Integer getIntervaland19() {
		return Integerervaland19;
	}

	public void setIntervaland19(Integer Integerervaland19) {
		this.Integerervaland19 = Integerervaland19;
	}

	public Integer getIntervaland20() {
		return Integerervaland20;
	}

	public void setIntervaland20(Integer Integerervaland20) {
		this.Integerervaland20 = Integerervaland20;
	}

	public Integer getIntervaland21() {
		return Integerervaland21;
	}

	public void setIntervaland21(Integer Integerervaland21) {
		this.Integerervaland21 = Integerervaland21;
	}

	public Integer getIntervaland22() {
		return Integerervaland22;
	}

	public void setIntervaland22(Integer Integerervaland22) {
		this.Integerervaland22 = Integerervaland22;
	}

	public Integer getIntervaland23() {
		return Integerervaland23;
	}

	public void setIntervaland23(Integer Integerervaland23) {
		this.Integerervaland23 = Integerervaland23;
	}

	public Integer getIntervaland24() {
		return Integerervaland24;
	}

	public void setIntervaland24(Integer Integerervaland24) {
		this.Integerervaland24 = Integerervaland24;
	}

	public Integer getIntervaland25() {
		return Integerervaland25;
	}

	public void setIntervaland25(Integer Integerervaland25) {
		this.Integerervaland25 = Integerervaland25;
	}

	public Integer getIntervaland26() {
		return Integerervaland26;
	}

	public void setIntervaland26(Integer Integerervaland26) {
		this.Integerervaland26 = Integerervaland26;
	}

	public Integer getIntervaland27() {
		return Integerervaland27;
	}

	public void setIntervaland27(Integer Integerervaland27) {
		this.Integerervaland27 = Integerervaland27;
	}

	public Integer getIntervaland28() {
		return Integerervaland28;
	}

	public void setIntervaland28(Integer Integerervaland28) {
		this.Integerervaland28 = Integerervaland28;
	}

	public Integer getIntervaland29() {
		return Integerervaland29;
	}

	public void setIntervaland29(Integer Integerervaland29) {
		this.Integerervaland29 = Integerervaland29;
	}

	public Integer getIntervaland30() {
		return Integerervaland30;
	}

	public void setIntervaland30(Integer Integerervaland30) {
		this.Integerervaland30 = Integerervaland30;
	}

	public Integer getIntervaland31() {
		return Integerervaland31;
	}

	public void setIntervaland31(Integer Integerervaland31) {
		this.Integerervaland31 = Integerervaland31;
	}

	public Integer getIntervaland32() {
		return Integerervaland32;
	}

	public void setIntervaland32(Integer Integerervaland32) {
		this.Integerervaland32 = Integerervaland32;
	}

	public Integer getIntervaland33() {
		return Integerervaland33;
	}

	public void setIntervaland33(Integer Integerervaland33) {
		this.Integerervaland33 = Integerervaland33;
	}

	public Integer getIntervaland34() {
		return Integerervaland34;
	}

	public void setIntervaland34(Integer Integerervaland34) {
		this.Integerervaland34 = Integerervaland34;
	}

	public Integer getIntervaland35() {
		return Integerervaland35;
	}

	public void setIntervaland35(Integer Integerervaland35) {
		this.Integerervaland35 = Integerervaland35;
	}

	public Integer getIntervaland36() {
		return Integerervaland36;
	}

	public void setIntervaland36(Integer Integerervaland36) {
		this.Integerervaland36 = Integerervaland36;
	}

	public Date getDrawtime() {
		return drawtime;
	}

	public void setDrawtime(Date drawtime) {
		this.drawtime = drawtime;
	}

	public String getWhether() {
		return whether;
	}

	public void setWhether(String whether) {
		this.whether = whether;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getHorver() {
		return horver;
	}

	public void setHorver(String horver) {
		this.horver = horver;
	}

	public Integer getThreeareas1() {
		return threeareas1;
	}

	public void setThreeareas1(Integer threeareas1) {
		this.threeareas1 = threeareas1;
	}

	public Integer getThreeareas2() {
		return threeareas2;
	}

	public void setThreeareas2(Integer threeareas2) {
		this.threeareas2 = threeareas2;
	}

	public Integer getThreeareas3() {
		return threeareas3;
	}

	public void setThreeareas3(Integer threeareas3) {
		this.threeareas3 = threeareas3;
	}

	public Integer getIntervalandone() {
		return Integerervalandone;
	}

	public void setIntervalandone(Integer Integerervalandone) {
		this.Integerervalandone = Integerervalandone;
	}

	public Integer getFirstnum() {
		return firstnum;
	}

	public void setFirstnum(Integer firstnum) {
		this.firstnum = firstnum;
	}

	public Integer getUpperlowerareas() {
		return upperlowerareas;
	}

	public void setUpperlowerareas(Integer upperlowerareas) {
		this.upperlowerareas = upperlowerareas;
	}

	public Integer getThreeareas() {
		return threeareas;
	}

	public void setThreeareas(Integer threeareas) {
		this.threeareas = threeareas;
	}

	public Integer getFourthareas() {
		return fourthareas;
	}

	public void setFourthareas(Integer fourthareas) {
		this.fourthareas = fourthareas;
	}

	public Integer getSixareas() {
		return sixareas;
	}

	public void setSixareas(Integer sixareas) {
		this.sixareas = sixareas;
	}

	public Integer getNineareas() {
		return nineareas;
	}

	public void setNineareas(Integer nineareas) {
		this.nineareas = nineareas;
	}

	public Integer getThanthreeratios() {
		return thanthreeratios;
	}

	public void setThanthreeratios(Integer thanthreeratios) {
		this.thanthreeratios = thanthreeratios;
	}

	public Integer getThanfiveratios() {
		return thanfiveratios;
	}

	public void setThanfiveratios(Integer thanfiveratios) {
		this.thanfiveratios = thanfiveratios;
	}

	public Integer getThansevenratios() {
		return thansevenratios;
	}

	public void setThansevenratios(Integer thansevenratios) {
		this.thansevenratios = thansevenratios;
	}

	public String getStrnum() {
		return strnum;
	}

	public void setStrnum(String strnum) {
		this.strnum = strnum;
	}
	public void initHeat0(Model lottery){
		lottery.setHeat1(0);
		lottery.setHeat2(0);
		lottery.setHeat3(0);
		lottery.setHeat4(0);
		lottery.setHeat5(0);
		lottery.setHeat6(0);
		lottery.setHeat7(0);
		lottery.setHeat8(0);
		lottery.setHeat9(0);
		lottery.setHeat10(0);
		lottery.setHeat11(0);
		lottery.setHeat12(0);
		lottery.setHeat13(0);
		lottery.setHeat14(0);
		lottery.setHeat15(0);
		lottery.setHeat16(0);
		lottery.setHeat17(0);
		lottery.setHeat18(0);
		lottery.setHeat19(0);
		lottery.setHeat20(0);
		lottery.setHeat21(0);
		lottery.setHeat22(0);
		lottery.setHeat23(0);
		lottery.setHeat24(0);
		lottery.setHeat25(0);
		lottery.setHeat26(0);
		lottery.setHeat27(0);
		lottery.setHeat28(0);
		lottery.setHeat29(0);
		lottery.setHeat30(0);
		lottery.setHeat31(0);
		lottery.setHeat32(0);
		lottery.setHeat33(0);
		lottery.setHeat34(0);
		lottery.setHeat35(0);
		lottery.setHeat36(0);
	}
	public void copyHeat0(Model lottery,Model plottery){
			lottery.setHeat1(plottery.getHeat1());
			lottery.setHeat2(plottery.getHeat2());
			lottery.setHeat3(plottery.getHeat3());
			lottery.setHeat4(plottery.getHeat4());
			lottery.setHeat5(plottery.getHeat5());
			lottery.setHeat6(plottery.getHeat6());
			lottery.setHeat7(plottery.getHeat7());
			lottery.setHeat8(plottery.getHeat8());
			lottery.setHeat9(plottery.getHeat9());
			lottery.setHeat10(plottery.getHeat10());
			lottery.setHeat11(plottery.getHeat11());
			lottery.setHeat12(plottery.getHeat12());
			lottery.setHeat13(plottery.getHeat13());
			lottery.setHeat14(plottery.getHeat14());
			lottery.setHeat15(plottery.getHeat15());
			lottery.setHeat16(plottery.getHeat16());
			lottery.setHeat17(plottery.getHeat17());
			lottery.setHeat18(plottery.getHeat18());
			lottery.setHeat19(plottery.getHeat19());
			lottery.setHeat20(plottery.getHeat20());
			lottery.setHeat21(plottery.getHeat21());
			lottery.setHeat22(plottery.getHeat22());
			lottery.setHeat23(plottery.getHeat23());
			lottery.setHeat24(plottery.getHeat24());
			lottery.setHeat25(plottery.getHeat25());
			lottery.setHeat26(plottery.getHeat26());
			lottery.setHeat27(plottery.getHeat27());
			lottery.setHeat28(plottery.getHeat28());
			lottery.setHeat29(plottery.getHeat29());
			lottery.setHeat30(plottery.getHeat30());
			lottery.setHeat31(plottery.getHeat31());
			lottery.setHeat32(plottery.getHeat32());
			lottery.setHeat33(plottery.getHeat33());
			lottery.setHeat34(plottery.getHeat34());
			lottery.setHeat35(plottery.getHeat35());
			lottery.setHeat36(plottery.getHeat36());
	}
	public void calcHeat0(Model lottery,Model plottery,int num){
		if(num==1){
			lottery.setHeat1(Check.toString(plottery.getHeat1())+1);
		}else if(num==2){
			lottery.setHeat2(Check.toString(plottery.getHeat2())+1);
		}else if(num==3){
			lottery.setHeat3(Check.toString(plottery.getHeat3())+1);
		}else if(num==4){
			lottery.setHeat4(Check.toString(plottery.getHeat4())+1);
		}else if(num==5){
			lottery.setHeat5(Check.toString(plottery.getHeat5())+1);
		}else if(num==6){
			lottery.setHeat6(Check.toString(plottery.getHeat6())+1);
		}else if(num==7){
			lottery.setHeat7(Check.toString(plottery.getHeat7())+1);
		}else if(num==8){
			lottery.setHeat8(Check.toString(plottery.getHeat8())+1);
		}else if(num==9){
			lottery.setHeat9(Check.toString(plottery.getHeat9())+1);
		}else if(num==10){
			lottery.setHeat10(Check.toString(plottery.getHeat10())+1);
		}else if(num==11){
			lottery.setHeat11(Check.toString(plottery.getHeat11())+1);
		}else if(num==12){
			lottery.setHeat12(Check.toString(plottery.getHeat12())+1);
		}else if(num==13){
			lottery.setHeat13(Check.toString(plottery.getHeat13())+1);
		}else if(num==14){
			lottery.setHeat14(Check.toString(plottery.getHeat14())+1);
		}else if(num==15){
			lottery.setHeat15(Check.toString(plottery.getHeat15())+1);
		}else if(num==16){
			lottery.setHeat16(Check.toString(plottery.getHeat16())+1);
		}else if(num==17){
			lottery.setHeat17(Check.toString(plottery.getHeat17())+1);
		}else if(num==18){
			lottery.setHeat18(Check.toString(plottery.getHeat18())+1);
		}else if(num==19){
			lottery.setHeat19(Check.toString(plottery.getHeat19())+1);
		}else if(num==20){
			lottery.setHeat20(Check.toString(plottery.getHeat20())+1);
		}else if(num==21){
			lottery.setHeat21(Check.toString(plottery.getHeat21())+1);
		}else if(num==22){
			lottery.setHeat22(Check.toString(plottery.getHeat22())+1);
		}else if(num==23){
			lottery.setHeat23(Check.toString(plottery.getHeat23())+1);
		}else if(num==24){
			lottery.setHeat24(Check.toString(plottery.getHeat24())+1);
		}else if(num==25){
			lottery.setHeat25(Check.toString(plottery.getHeat25())+1);
		}else if(num==26){
			lottery.setHeat26(Check.toString(plottery.getHeat26())+1);
		}else if(num==27){
			lottery.setHeat27(Check.toString(plottery.getHeat27())+1);
		}else if(num==28){
			lottery.setHeat28(Check.toString(plottery.getHeat28())+1);
		}else if(num==29){
			lottery.setHeat29(Check.toString(plottery.getHeat29())+1);
		}else if(num==30){
			lottery.setHeat30(Check.toString(plottery.getHeat30())+1);
		}else if(num==31){
			lottery.setHeat31(Check.toString(plottery.getHeat31())+1);
		}else if(num==32){
			lottery.setHeat32(Check.toString(plottery.getHeat32())+1);
		}else if(num==33){
			lottery.setHeat33(Check.toString(plottery.getHeat33())+1);
		}else if(num==34){
			lottery.setHeat34(Check.toString(plottery.getHeat34())+1);
		}else if(num==35){
			lottery.setHeat35(Check.toString(plottery.getHeat35())+1);
		}else if(num==36){
			lottery.setHeat36(Check.toString(plottery.getHeat36())+1);
		}		
	}
	public void initIntervaland0(Model lottery){
		lottery.setIntervaland1(0);
		lottery.setIntervaland2(0);
		lottery.setIntervaland3(0);
		lottery.setIntervaland4(0);
		lottery.setIntervaland5(0);
		lottery.setIntervaland6(0);
		lottery.setIntervaland7(0);
		lottery.setIntervaland8(0);
		lottery.setIntervaland9(0);
		lottery.setIntervaland10(0);
		lottery.setIntervaland11(0);
		lottery.setIntervaland12(0);
		lottery.setIntervaland13(0);
		lottery.setIntervaland14(0);
		lottery.setIntervaland15(0);
		lottery.setIntervaland16(0);
		lottery.setIntervaland17(0);
		lottery.setIntervaland18(0);
		lottery.setIntervaland19(0);
		lottery.setIntervaland20(0);
		lottery.setIntervaland21(0);
		lottery.setIntervaland22(0);
		lottery.setIntervaland23(0);
		lottery.setIntervaland24(0);
		lottery.setIntervaland25(0);
		lottery.setIntervaland26(0);
		lottery.setIntervaland27(0);
		lottery.setIntervaland28(0);
		lottery.setIntervaland29(0);
		lottery.setIntervaland30(0);
		lottery.setIntervaland31(0);
		lottery.setIntervaland32(0);
		lottery.setIntervaland33(0);
		lottery.setIntervaland34(0);
		lottery.setIntervaland35(0);
		lottery.setIntervaland36(0);
		lottery.setIntervaland("");
		lottery.setIntervalandmax(0);
		lottery.setIntervalandmin(0);
		lottery.setIntervalandone(0);
		lottery.setIntervalandpostmax(0);
		lottery.setIntervalandpostmin(0);
		lottery.setIntervalandtotal(0);
	}
	public void calcIntervaland0(Model lottery,Model plottery,int num){
		if(num==1){
			int intervaland =Check.toString(plottery.getIntervaland1());
			intervaland(lottery, intervaland);
			lottery.setIntervaland1(0);
		}else if(num==2){
			int intervaland =Check.toString(plottery.getIntervaland2());
			intervaland(lottery, intervaland);
			lottery.setIntervaland2(0); 
		}else if(num==3){
			int intervaland =Check.toString(plottery.getIntervaland3());
			intervaland(lottery, intervaland);
			lottery.setIntervaland3(0);
		}else if(num==4){
			int intervaland =Check.toString(plottery.getIntervaland4());
			intervaland(lottery, intervaland);
			lottery.setIntervaland4(0);
		}else if(num==5){
			int intervaland =Check.toString(plottery.getIntervaland5());
			intervaland(lottery, intervaland);
			lottery.setIntervaland5(0);
		}else if(num==6){
			int intervaland =Check.toString(plottery.getIntervaland6());
			intervaland(lottery, intervaland);
			lottery.setIntervaland6(0);
		}else if(num==7){
			int intervaland =Check.toString(plottery.getIntervaland7());
			intervaland(lottery, intervaland);
			lottery.setIntervaland7(0);
		}else if(num==8){
			int intervaland =Check.toString(plottery.getIntervaland8());
			intervaland(lottery, intervaland);
			lottery.setIntervaland8(0);
		}else if(num==9){
			int intervaland =Check.toString(plottery.getIntervaland9());
			intervaland(lottery, intervaland);
			lottery.setIntervaland9(0);
		}else if(num==10){
			int intervaland =Check.toString(plottery.getIntervaland10());
			intervaland(lottery, intervaland);
			lottery.setIntervaland10(0);
		}else if(num==11){
			int intervaland =Check.toString(plottery.getIntervaland11());
			intervaland(lottery, intervaland);
			lottery.setIntervaland11(0);
		}else if(num==12){
			int intervaland =Check.toString(plottery.getIntervaland12());
			intervaland(lottery, intervaland);
			lottery.setIntervaland12(0);
		}else if(num==13){
			int intervaland =Check.toString(plottery.getIntervaland13());
			intervaland(lottery, intervaland);
			lottery.setIntervaland13(0);
		}else if(num==14){
			int intervaland =Check.toString(plottery.getIntervaland14());
			intervaland(lottery, intervaland);
			lottery.setIntervaland14(0);
		}else if(num==15){
			int intervaland =Check.toString(plottery.getIntervaland15());
			intervaland(lottery, intervaland);
			lottery.setIntervaland15(0);
		}else if(num==16){
			int intervaland =Check.toString(plottery.getIntervaland16());
			intervaland(lottery, intervaland);
			lottery.setIntervaland16(0);
		}else if(num==17){
			int intervaland =Check.toString(plottery.getIntervaland17());
			intervaland(lottery, intervaland);
			lottery.setIntervaland17(0);
		}else if(num==18){
			int intervaland =Check.toString(plottery.getIntervaland18());
			intervaland(lottery, intervaland);
			lottery.setIntervaland18(0);
		}else if(num==19){
			int intervaland =Check.toString(plottery.getIntervaland19());
			intervaland(lottery, intervaland);
			lottery.setIntervaland19(0);
		}else if(num==20){
			int intervaland =Check.toString(plottery.getIntervaland20());
			intervaland(lottery, intervaland);
			lottery.setIntervaland20(0); 
		}else if(num==21){
			int intervaland =Check.toString(plottery.getIntervaland21());
			intervaland(lottery, intervaland);
			lottery.setIntervaland21(0); 
		}else if(num==22){
			int intervaland =Check.toString(plottery.getIntervaland22());
			intervaland(lottery, intervaland);
			lottery.setIntervaland22(0); 
		}else if(num==23){
			int intervaland =Check.toString(plottery.getIntervaland23());
			intervaland(lottery, intervaland);
			lottery.setIntervaland23(0); 
		}else if(num==24){
			int intervaland =Check.toString(plottery.getIntervaland24());
			intervaland(lottery, intervaland);
			lottery.setIntervaland24(0); 
		}else if(num==25){
			int intervaland =Check.toString(plottery.getIntervaland25());
			intervaland(lottery, intervaland);
			lottery.setIntervaland25(0); 
		}else if(num==26){
			int intervaland =Check.toString(plottery.getIntervaland26());
			intervaland(lottery, intervaland);
			lottery.setIntervaland26(0); 
		}else if(num==27){
			int intervaland =Check.toString(plottery.getIntervaland27());
			intervaland(lottery, intervaland);
			lottery.setIntervaland27(0); 
		}else if(num==28){
			int intervaland =Check.toString(plottery.getIntervaland28());
			intervaland(lottery, intervaland);
			lottery.setIntervaland28(0); 
		}else if(num==29){
			int intervaland =Check.toString(plottery.getIntervaland29());
			intervaland(lottery, intervaland);
			lottery.setIntervaland29(0); 
		}else if(num==30){
			int intervaland =Check.toString(plottery.getIntervaland30());
			intervaland(lottery, intervaland);
			lottery.setIntervaland30(0);
		}else if(num==31){
			int intervaland =Check.toString(plottery.getIntervaland31());
			intervaland(lottery, intervaland);
			lottery.setIntervaland31(0);
		}else if(num==32){
			int intervaland =Check.toString(plottery.getIntervaland32());
			intervaland(lottery, intervaland);
			lottery.setIntervaland32(0);
		}else if(num==33){
			int intervaland =Check.toString(plottery.getIntervaland33());
			intervaland(lottery, intervaland);
			lottery.setIntervaland33(0);
		}else if(num==34){
			int intervaland =Check.toString(plottery.getIntervaland34());
			intervaland(lottery, intervaland);
			lottery.setIntervaland34(0);
		}else if(num==35){
			int intervaland =Check.toString(plottery.getIntervaland35());
			intervaland(lottery, intervaland);
			lottery.setIntervaland35(0);
		}else if(num==36){
			int intervaland =Check.toString(plottery.getIntervaland36());
			intervaland(lottery, intervaland);
			lottery.setIntervaland36(0);
		}
		
	}

	private void intervaland(Model lottery, int intervaland) {
		lottery.setIntervalandtotal(Check.toString(lottery.getIntervalandtotal())+intervaland);
		if(Check.toString(lottery.getIntervalandmin())>=intervaland){
			lottery.setIntervalandmin(intervaland);
		}
		if(Check.toString(lottery.getIntervalandmax())<=intervaland){
			lottery.setIntervalandmax(intervaland);
		}
		lottery.setIntervaland(Check.toString(lottery.getIntervaland())+intervaland+"+");
	}
	
	public void copyIntervaland0(Model lottery,Model plottery){
			lottery.setIntervaland1(Check.toString(plottery.getIntervaland1())+1);
			lottery.setIntervaland2(Check.toString(plottery.getIntervaland2())+1);
			lottery.setIntervaland3(Check.toString(plottery.getIntervaland3())+1);
			lottery.setIntervaland4(Check.toString(plottery.getIntervaland4())+1);
			lottery.setIntervaland5(Check.toString(plottery.getIntervaland5())+1);
			lottery.setIntervaland6(Check.toString(plottery.getIntervaland6())+1);
			lottery.setIntervaland7(Check.toString(plottery.getIntervaland7())+1);
			lottery.setIntervaland8(Check.toString(plottery.getIntervaland8())+1);
			lottery.setIntervaland9(Check.toString(plottery.getIntervaland9())+1);
			lottery.setIntervaland10(Check.toString(plottery.getIntervaland10())+1);
			lottery.setIntervaland11(Check.toString(plottery.getIntervaland11())+1);
			lottery.setIntervaland12(Check.toString(plottery.getIntervaland12())+1);
			lottery.setIntervaland13(Check.toString(plottery.getIntervaland13())+1);
			lottery.setIntervaland14(Check.toString(plottery.getIntervaland14())+1);
			lottery.setIntervaland15(Check.toString(plottery.getIntervaland15())+1);
			lottery.setIntervaland16(Check.toString(plottery.getIntervaland16())+1);
			lottery.setIntervaland17(Check.toString(plottery.getIntervaland17())+1);
			lottery.setIntervaland18(Check.toString(plottery.getIntervaland18())+1);
			lottery.setIntervaland19(Check.toString(plottery.getIntervaland19())+1);
			lottery.setIntervaland20(Check.toString(plottery.getIntervaland20())+1);
			lottery.setIntervaland21(Check.toString(plottery.getIntervaland21())+1);
			lottery.setIntervaland22(Check.toString(plottery.getIntervaland22())+1);
			lottery.setIntervaland23(Check.toString(plottery.getIntervaland23())+1);
			lottery.setIntervaland24(Check.toString(plottery.getIntervaland24())+1);
			lottery.setIntervaland25(Check.toString(plottery.getIntervaland25())+1);
			lottery.setIntervaland26(Check.toString(plottery.getIntervaland26())+1);
			lottery.setIntervaland27(Check.toString(plottery.getIntervaland27())+1);
			lottery.setIntervaland28(Check.toString(plottery.getIntervaland28())+1);
			lottery.setIntervaland29(Check.toString(plottery.getIntervaland29())+1);
			lottery.setIntervaland30(Check.toString(plottery.getIntervaland30())+1);
			lottery.setIntervaland31(Check.toString(plottery.getIntervaland31())+1);
			lottery.setIntervaland32(Check.toString(plottery.getIntervaland32())+1);
			lottery.setIntervaland33(Check.toString(plottery.getIntervaland33())+1);
			lottery.setIntervaland34(Check.toString(plottery.getIntervaland34())+1);
			lottery.setIntervaland35(Check.toString(plottery.getIntervaland35())+1);
			lottery.setIntervaland36(Check.toString(plottery.getIntervaland36())+1);
	}
	public void init(Model lottery){
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
