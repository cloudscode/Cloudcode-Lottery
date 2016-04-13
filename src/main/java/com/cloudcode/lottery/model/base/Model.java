package com.cloudcode.lottery.model.base;

import java.util.Date;

import javax.persistence.MappedSuperclass;

import com.cloudcode.framework.utils.Check;

@MappedSuperclass
public class Model extends Base {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5581913243900041888L;

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

	private String integerervaland;
	private Integer integerervalandtotal;
	private Integer integerervalandmin;
	private Integer integerervalandmax;
	private Integer integerervalandpostmin;
	private Integer integerervalandpostmax;

	private Integer totalmin;
	private Integer totalmax;
	private Double totalavg;
	private Integer newno;
	private Integer repeatno;
	private Integer noside;
	private String ratioonthethreenumbers;
	private String ratioonthefivenumbers;
	private String ratioonthesevennumbers;
	private String ratioonthetennumbers;

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
	private Integer integerervaland1;
	private Integer integerervaland2;
	private Integer integerervaland3;
	private Integer integerervaland4;
	private Integer integerervaland5;
	private Integer integerervaland6;
	private Integer integerervaland7;
	private Integer integerervaland8;
	private Integer integerervaland9;
	private Integer integerervaland10;
	private Integer integerervaland11;
	private Integer integerervaland12;
	private Integer integerervaland13;
	private Integer integerervaland14;
	private Integer integerervaland15;
	private Integer integerervaland16;
	private Integer integerervaland17;
	private Integer integerervaland18;
	private Integer integerervaland19;
	private Integer integerervaland20;
	private Integer integerervaland21;
	private Integer integerervaland22;
	private Integer integerervaland23;
	private Integer integerervaland24;
	private Integer integerervaland25;
	private Integer integerervaland26;
	private Integer integerervaland27;
	private Integer integerervaland28;
	private Integer integerervaland29;
	private Integer integerervaland30;
	private Integer integerervaland31;
	private Integer integerervaland32;
	private Integer integerervaland33;
	private Integer integerervaland34;
	private Integer integerervaland35;
	private Integer integerervaland36;
	private Date drawtime;
	private String whether;
	private String remark;

	private Integer threeareas1;
	private Integer threeareas2;
	private Integer threeareas3;
	private Integer integerervalandone;

	private Integer upperlowerareas;
	private Integer threeareas;
	private Integer fourthareas;
	private Integer sixareas;
	private Integer nineareas;
	private Integer thanthreeratios;
	private Integer thanfiveratios;
	private Integer thansevenratios;

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

	public Integer getIntegerervalandtotal() {
		return integerervalandtotal;
	}

	public void setIntegerervalandtotal(Integer integerervalandtotal) {
		this.integerervalandtotal = integerervalandtotal;
	}

	public Integer getIntegerervalandmin() {
		return integerervalandmin;
	}

	public void setIntegerervalandmin(Integer integerervalandmin) {
		this.integerervalandmin = integerervalandmin;
	}

	public Integer getIntegerervalandmax() {
		return integerervalandmax;
	}

	public void setIntegerervalandmax(Integer integerervalandmax) {
		this.integerervalandmax = integerervalandmax;
	}

	public Integer getIntegerervalandpostmin() {
		return integerervalandpostmin;
	}

	public void setIntegerervalandpostmin(Integer integerervalandpostmin) {
		this.integerervalandpostmin = integerervalandpostmin;
	}

	public Integer getIntegerervalandpostmax() {
		return integerervalandpostmax;
	}

	public void setIntegerervalandpostmax(Integer integerervalandpostmax) {
		this.integerervalandpostmax = integerervalandpostmax;
	}

	public Integer getIntegerervaland1() {
		return integerervaland1;
	}

	public void setIntegerervaland1(Integer integerervaland1) {
		this.integerervaland1 = integerervaland1;
	}

	public Integer getIntegerervaland2() {
		return integerervaland2;
	}

	public void setIntegerervaland2(Integer integerervaland2) {
		this.integerervaland2 = integerervaland2;
	}

	public Integer getIntegerervaland3() {
		return integerervaland3;
	}

	public void setIntegerervaland3(Integer integerervaland3) {
		this.integerervaland3 = integerervaland3;
	}

	public Integer getIntegerervaland4() {
		return integerervaland4;
	}

	public void setIntegerervaland4(Integer integerervaland4) {
		this.integerervaland4 = integerervaland4;
	}

	public Integer getIntegerervaland5() {
		return integerervaland5;
	}

	public void setIntegerervaland5(Integer integerervaland5) {
		this.integerervaland5 = integerervaland5;
	}

	public Integer getIntegerervaland6() {
		return integerervaland6;
	}

	public void setIntegerervaland6(Integer integerervaland6) {
		this.integerervaland6 = integerervaland6;
	}

	public Integer getIntegerervaland7() {
		return integerervaland7;
	}

	public void setIntegerervaland7(Integer integerervaland7) {
		this.integerervaland7 = integerervaland7;
	}

	public Integer getIntegerervaland8() {
		return integerervaland8;
	}

	public void setIntegerervaland8(Integer integerervaland8) {
		this.integerervaland8 = integerervaland8;
	}

	public Integer getIntegerervaland9() {
		return integerervaland9;
	}

	public void setIntegerervaland9(Integer integerervaland9) {
		this.integerervaland9 = integerervaland9;
	}

	public Integer getIntegerervaland10() {
		return integerervaland10;
	}

	public void setIntegerervaland10(Integer integerervaland10) {
		this.integerervaland10 = integerervaland10;
	}

	public Integer getIntegerervaland11() {
		return integerervaland11;
	}

	public void setIntegerervaland11(Integer integerervaland11) {
		this.integerervaland11 = integerervaland11;
	}

	public Integer getIntegerervaland12() {
		return integerervaland12;
	}

	public void setIntegerervaland12(Integer integerervaland12) {
		this.integerervaland12 = integerervaland12;
	}

	public Integer getIntegerervaland13() {
		return integerervaland13;
	}

	public void setIntegerervaland13(Integer integerervaland13) {
		this.integerervaland13 = integerervaland13;
	}

	public Integer getIntegerervaland14() {
		return integerervaland14;
	}

	public void setIntegerervaland14(Integer integerervaland14) {
		this.integerervaland14 = integerervaland14;
	}

	public Integer getIntegerervaland15() {
		return integerervaland15;
	}

	public void setIntegerervaland15(Integer integerervaland15) {
		this.integerervaland15 = integerervaland15;
	}

	public Integer getIntegerervaland16() {
		return integerervaland16;
	}

	public void setIntegerervaland16(Integer integerervaland16) {
		this.integerervaland16 = integerervaland16;
	}

	public Integer getIntegerervaland17() {
		return integerervaland17;
	}

	public void setIntegerervaland17(Integer integerervaland17) {
		this.integerervaland17 = integerervaland17;
	}

	public Integer getIntegerervaland18() {
		return integerervaland18;
	}

	public void setIntegerervaland18(Integer integerervaland18) {
		this.integerervaland18 = integerervaland18;
	}

	public Integer getIntegerervaland19() {
		return integerervaland19;
	}

	public void setIntegerervaland19(Integer integerervaland19) {
		this.integerervaland19 = integerervaland19;
	}

	public Integer getIntegerervaland20() {
		return integerervaland20;
	}

	public void setIntegerervaland20(Integer integerervaland20) {
		this.integerervaland20 = integerervaland20;
	}

	public Integer getIntegerervaland21() {
		return integerervaland21;
	}

	public void setIntegerervaland21(Integer integerervaland21) {
		this.integerervaland21 = integerervaland21;
	}

	public Integer getIntegerervaland22() {
		return integerervaland22;
	}

	public void setIntegerervaland22(Integer integerervaland22) {
		this.integerervaland22 = integerervaland22;
	}

	public Integer getIntegerervaland23() {
		return integerervaland23;
	}

	public void setIntegerervaland23(Integer integerervaland23) {
		this.integerervaland23 = integerervaland23;
	}

	public Integer getIntegerervaland24() {
		return integerervaland24;
	}

	public void setIntegerervaland24(Integer integerervaland24) {
		this.integerervaland24 = integerervaland24;
	}

	public Integer getIntegerervaland25() {
		return integerervaland25;
	}

	public void setIntegerervaland25(Integer integerervaland25) {
		this.integerervaland25 = integerervaland25;
	}

	public Integer getIntegerervaland26() {
		return integerervaland26;
	}

	public void setIntegerervaland26(Integer integerervaland26) {
		this.integerervaland26 = integerervaland26;
	}

	public Integer getIntegerervaland27() {
		return integerervaland27;
	}

	public void setIntegerervaland27(Integer integerervaland27) {
		this.integerervaland27 = integerervaland27;
	}

	public Integer getIntegerervaland28() {
		return integerervaland28;
	}

	public void setIntegerervaland28(Integer integerervaland28) {
		this.integerervaland28 = integerervaland28;
	}

	public Integer getIntegerervaland29() {
		return integerervaland29;
	}

	public void setIntegerervaland29(Integer integerervaland29) {
		this.integerervaland29 = integerervaland29;
	}

	public Integer getIntegerervaland30() {
		return integerervaland30;
	}

	public void setIntegerervaland30(Integer integerervaland30) {
		this.integerervaland30 = integerervaland30;
	}

	public Integer getIntegerervaland31() {
		return integerervaland31;
	}

	public void setIntegerervaland31(Integer integerervaland31) {
		this.integerervaland31 = integerervaland31;
	}

	public Integer getIntegerervaland32() {
		return integerervaland32;
	}

	public void setIntegerervaland32(Integer integerervaland32) {
		this.integerervaland32 = integerervaland32;
	}

	public Integer getIntegerervaland33() {
		return integerervaland33;
	}

	public void setIntegerervaland33(Integer integerervaland33) {
		this.integerervaland33 = integerervaland33;
	}

	public Integer getIntegerervaland34() {
		return integerervaland34;
	}

	public void setIntegerervaland34(Integer integerervaland34) {
		this.integerervaland34 = integerervaland34;
	}

	public Integer getIntegerervaland35() {
		return integerervaland35;
	}

	public void setIntegerervaland35(Integer integerervaland35) {
		this.integerervaland35 = integerervaland35;
	}

	public Integer getIntegerervaland36() {
		return integerervaland36;
	}

	public void setIntegerervaland36(Integer integerervaland36) {
		this.integerervaland36 = integerervaland36;
	}

	public Integer getIntegerervalandone() {
		return integerervalandone;
	}

	public void setIntegerervalandone(Integer integerervalandone) {
		this.integerervalandone = integerervalandone;
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

	public String getIntegerervaland() {
		return integerervaland;
	}

	public void setIntegerervaland(String integerervaland) {
		this.integerervaland = integerervaland;
	}

	public void initHeat0(Model lottery) {
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

	public void copyHeat0(Model lottery, Model plottery) {
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

	public void calcHeat0(Model lottery, Model plottery, int num) {
		if (num == 1) {
			lottery.setHeat1(Check.toString(plottery.getHeat1()) + 1);
		} else if (num == 2) {
			lottery.setHeat2(Check.toString(plottery.getHeat2()) + 1);
		} else if (num == 3) {
			lottery.setHeat3(Check.toString(plottery.getHeat3()) + 1);
		} else if (num == 4) {
			lottery.setHeat4(Check.toString(plottery.getHeat4()) + 1);
		} else if (num == 5) {
			lottery.setHeat5(Check.toString(plottery.getHeat5()) + 1);
		} else if (num == 6) {
			lottery.setHeat6(Check.toString(plottery.getHeat6()) + 1);
		} else if (num == 7) {
			lottery.setHeat7(Check.toString(plottery.getHeat7()) + 1);
		} else if (num == 8) {
			lottery.setHeat8(Check.toString(plottery.getHeat8()) + 1);
		} else if (num == 9) {
			lottery.setHeat9(Check.toString(plottery.getHeat9()) + 1);
		} else if (num == 10) {
			lottery.setHeat10(Check.toString(plottery.getHeat10()) + 1);
		} else if (num == 11) {
			lottery.setHeat11(Check.toString(plottery.getHeat11()) + 1);
		} else if (num == 12) {
			lottery.setHeat12(Check.toString(plottery.getHeat12()) + 1);
		} else if (num == 13) {
			lottery.setHeat13(Check.toString(plottery.getHeat13()) + 1);
		} else if (num == 14) {
			lottery.setHeat14(Check.toString(plottery.getHeat14()) + 1);
		} else if (num == 15) {
			lottery.setHeat15(Check.toString(plottery.getHeat15()) + 1);
		} else if (num == 16) {
			lottery.setHeat16(Check.toString(plottery.getHeat16()) + 1);
		} else if (num == 17) {
			lottery.setHeat17(Check.toString(plottery.getHeat17()) + 1);
		} else if (num == 18) {
			lottery.setHeat18(Check.toString(plottery.getHeat18()) + 1);
		} else if (num == 19) {
			lottery.setHeat19(Check.toString(plottery.getHeat19()) + 1);
		} else if (num == 20) {
			lottery.setHeat20(Check.toString(plottery.getHeat20()) + 1);
		} else if (num == 21) {
			lottery.setHeat21(Check.toString(plottery.getHeat21()) + 1);
		} else if (num == 22) {
			lottery.setHeat22(Check.toString(plottery.getHeat22()) + 1);
		} else if (num == 23) {
			lottery.setHeat23(Check.toString(plottery.getHeat23()) + 1);
		} else if (num == 24) {
			lottery.setHeat24(Check.toString(plottery.getHeat24()) + 1);
		} else if (num == 25) {
			lottery.setHeat25(Check.toString(plottery.getHeat25()) + 1);
		} else if (num == 26) {
			lottery.setHeat26(Check.toString(plottery.getHeat26()) + 1);
		} else if (num == 27) {
			lottery.setHeat27(Check.toString(plottery.getHeat27()) + 1);
		} else if (num == 28) {
			lottery.setHeat28(Check.toString(plottery.getHeat28()) + 1);
		} else if (num == 29) {
			lottery.setHeat29(Check.toString(plottery.getHeat29()) + 1);
		} else if (num == 30) {
			lottery.setHeat30(Check.toString(plottery.getHeat30()) + 1);
		} else if (num == 31) {
			lottery.setHeat31(Check.toString(plottery.getHeat31()) + 1);
		} else if (num == 32) {
			lottery.setHeat32(Check.toString(plottery.getHeat32()) + 1);
		} else if (num == 33) {
			lottery.setHeat33(Check.toString(plottery.getHeat33()) + 1);
		} else if (num == 34) {
			lottery.setHeat34(Check.toString(plottery.getHeat34()) + 1);
		} else if (num == 35) {
			lottery.setHeat35(Check.toString(plottery.getHeat35()) + 1);
		} else if (num == 36) {
			lottery.setHeat36(Check.toString(plottery.getHeat36()) + 1);
		}
	}

	public void initIntervaland0(Model lottery) {
		lottery.setIntegerervaland1(0);
		lottery.setIntegerervaland2(0);
		lottery.setIntegerervaland3(0);
		lottery.setIntegerervaland4(0);
		lottery.setIntegerervaland5(0);
		lottery.setIntegerervaland6(0);
		lottery.setIntegerervaland7(0);
		lottery.setIntegerervaland8(0);
		lottery.setIntegerervaland9(0);
		lottery.setIntegerervaland10(0);
		lottery.setIntegerervaland11(0);
		lottery.setIntegerervaland12(0);
		lottery.setIntegerervaland13(0);
		lottery.setIntegerervaland14(0);
		lottery.setIntegerervaland15(0);
		lottery.setIntegerervaland16(0);
		lottery.setIntegerervaland17(0);
		lottery.setIntegerervaland18(0);
		lottery.setIntegerervaland19(0);
		lottery.setIntegerervaland20(0);
		lottery.setIntegerervaland21(0);
		lottery.setIntegerervaland22(0);
		lottery.setIntegerervaland23(0);
		lottery.setIntegerervaland24(0);
		lottery.setIntegerervaland25(0);
		lottery.setIntegerervaland26(0);
		lottery.setIntegerervaland27(0);
		lottery.setIntegerervaland28(0);
		lottery.setIntegerervaland29(0);
		lottery.setIntegerervaland30(0);
		lottery.setIntegerervaland31(0);
		lottery.setIntegerervaland32(0);
		lottery.setIntegerervaland33(0);
		lottery.setIntegerervaland34(0);
		lottery.setIntegerervaland35(0);
		lottery.setIntegerervaland36(0);
		lottery.setIntegerervaland("");
		lottery.setIntegerervalandmax(0);
		lottery.setIntegerervalandmin(0);
		lottery.setIntegerervalandone(0);
		lottery.setIntegerervalandpostmax(0);
		lottery.setIntegerervalandpostmin(0);
		lottery.setIntegerervalandtotal(0);
	}

	public void initIntervaland1(Model lottery) {
		lottery.setIntegerervaland1(1);
		lottery.setIntegerervaland2(1);
		lottery.setIntegerervaland3(1);
		lottery.setIntegerervaland4(1);
		lottery.setIntegerervaland5(1);
		lottery.setIntegerervaland6(1);
		lottery.setIntegerervaland7(1);
		lottery.setIntegerervaland8(1);
		lottery.setIntegerervaland9(1);
		lottery.setIntegerervaland10(1);
		lottery.setIntegerervaland11(1);
		lottery.setIntegerervaland12(1);
		lottery.setIntegerervaland13(1);
		lottery.setIntegerervaland14(1);
		lottery.setIntegerervaland15(1);
		lottery.setIntegerervaland16(1);
		lottery.setIntegerervaland17(1);
		lottery.setIntegerervaland18(1);
		lottery.setIntegerervaland19(1);
		lottery.setIntegerervaland20(1);
		lottery.setIntegerervaland21(1);
		lottery.setIntegerervaland22(1);
		lottery.setIntegerervaland23(1);
		lottery.setIntegerervaland24(1);
		lottery.setIntegerervaland25(1);
		lottery.setIntegerervaland26(1);
		lottery.setIntegerervaland27(1);
		lottery.setIntegerervaland28(1);
		lottery.setIntegerervaland29(1);
		lottery.setIntegerervaland30(1);
		lottery.setIntegerervaland31(1);
		lottery.setIntegerervaland32(1);
		lottery.setIntegerervaland33(1);
		lottery.setIntegerervaland34(1);
		lottery.setIntegerervaland35(1);
		lottery.setIntegerervaland36(1);
		lottery.setIntegerervaland("");
		lottery.setIntegerervalandmax(0);
		lottery.setIntegerervalandmin(0);
		lottery.setIntegerervalandone(0);
		lottery.setIntegerervalandpostmax(0);
		lottery.setIntegerervalandpostmin(0);
		lottery.setIntegerervalandtotal(0);
	}

	public void calcIntervaland0(Model lottery, Model plottery, int num) {
		if (num == 1) {
			int intervaland = Check.toString(plottery.getIntegerervaland1());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland1(0);
		} else if (num == 2) {
			int intervaland = Check.toString(plottery.getIntegerervaland2());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland2(0);
		} else if (num == 3) {
			int intervaland = Check.toString(plottery.getIntegerervaland3());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland3(0);
		} else if (num == 4) {
			int intervaland = Check.toString(plottery.getIntegerervaland4());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland4(0);
		} else if (num == 5) {
			int intervaland = Check.toString(plottery.getIntegerervaland5());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland5(0);
		} else if (num == 6) {
			int intervaland = Check.toString(plottery.getIntegerervaland6());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland6(0);
		} else if (num == 7) {
			int intervaland = Check.toString(plottery.getIntegerervaland7());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland7(0);
		} else if (num == 8) {
			int intervaland = Check.toString(plottery.getIntegerervaland8());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland8(0);
		} else if (num == 9) {
			int intervaland = Check.toString(plottery.getIntegerervaland9());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland9(0);
		} else if (num == 10) {
			int intervaland = Check.toString(plottery.getIntegerervaland10());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland10(0);
		} else if (num == 11) {
			int intervaland = Check.toString(plottery.getIntegerervaland11());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland11(0);
		} else if (num == 12) {
			int intervaland = Check.toString(plottery.getIntegerervaland12());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland12(0);
		} else if (num == 13) {
			int intervaland = Check.toString(plottery.getIntegerervaland13());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland13(0);
		} else if (num == 14) {
			int intervaland = Check.toString(plottery.getIntegerervaland14());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland14(0);
		} else if (num == 15) {
			int intervaland = Check.toString(plottery.getIntegerervaland15());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland15(0);
		} else if (num == 16) {
			int intervaland = Check.toString(plottery.getIntegerervaland16());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland16(0);
		} else if (num == 17) {
			int intervaland = Check.toString(plottery.getIntegerervaland17());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland17(0);
		} else if (num == 18) {
			int intervaland = Check.toString(plottery.getIntegerervaland18());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland18(0);
		} else if (num == 19) {
			int intervaland = Check.toString(plottery.getIntegerervaland19());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland19(0);
		} else if (num == 20) {
			int intervaland = Check.toString(plottery.getIntegerervaland20());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland20(0);
		} else if (num == 21) {
			int intervaland = Check.toString(plottery.getIntegerervaland21());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland21(0);
		} else if (num == 22) {
			int intervaland = Check.toString(plottery.getIntegerervaland22());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland22(0);
		} else if (num == 23) {
			int intervaland = Check.toString(plottery.getIntegerervaland23());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland23(0);
		} else if (num == 24) {
			int intervaland = Check.toString(plottery.getIntegerervaland24());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland24(0);
		} else if (num == 25) {
			int intervaland = Check.toString(plottery.getIntegerervaland25());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland25(0);
		} else if (num == 26) {
			int intervaland = Check.toString(plottery.getIntegerervaland26());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland26(0);
		} else if (num == 27) {
			int intervaland = Check.toString(plottery.getIntegerervaland27());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland27(0);
		} else if (num == 28) {
			int intervaland = Check.toString(plottery.getIntegerervaland28());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland28(0);
		} else if (num == 29) {
			int intervaland = Check.toString(plottery.getIntegerervaland29());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland29(0);
		} else if (num == 30) {
			int intervaland = Check.toString(plottery.getIntegerervaland30());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland30(0);
		} else if (num == 31) {
			int intervaland = Check.toString(plottery.getIntegerervaland31());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland31(0);
		} else if (num == 32) {
			int intervaland = Check.toString(plottery.getIntegerervaland32());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland32(0);
		} else if (num == 33) {
			int intervaland = Check.toString(plottery.getIntegerervaland33());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland33(0);
		} else if (num == 34) {
			int intervaland = Check.toString(plottery.getIntegerervaland34());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland34(0);
		} else if (num == 35) {
			int intervaland = Check.toString(plottery.getIntegerervaland35());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland35(0);
		} else if (num == 36) {
			int intervaland = Check.toString(plottery.getIntegerervaland36());
			intervaland(lottery, intervaland);
			lottery.setIntegerervaland36(0);
		}

	}

	private void intervaland(Model lottery, int intervaland) {
		lottery.setIntegerervalandtotal(Check.toString(lottery
				.getIntegerervalandtotal()) + intervaland);
		if (Check.toString(lottery.getIntegerervalandmin()) >= intervaland) {
			lottery.setIntegerervalandmin(intervaland);
		}
		if (Check.toString(lottery.getIntegerervalandmax()) <= intervaland) {
			lottery.setIntegerervalandmax(intervaland);
		}
		lottery.setIntegerervaland(Check.toString(lottery.getIntegerervaland())
				+ intervaland + "+");
	}

	public void copyIntervaland0(Model lottery, Model plottery) {
		lottery.setIntegerervaland1(Check.toString(plottery
				.getIntegerervaland1()) + 1);
		lottery.setIntegerervaland2(Check.toString(plottery
				.getIntegerervaland2()) + 1);
		lottery.setIntegerervaland3(Check.toString(plottery
				.getIntegerervaland3()) + 1);
		lottery.setIntegerervaland4(Check.toString(plottery
				.getIntegerervaland4()) + 1);
		lottery.setIntegerervaland5(Check.toString(plottery
				.getIntegerervaland5()) + 1);
		lottery.setIntegerervaland6(Check.toString(plottery
				.getIntegerervaland6()) + 1);
		lottery.setIntegerervaland7(Check.toString(plottery
				.getIntegerervaland7()) + 1);
		lottery.setIntegerervaland8(Check.toString(plottery
				.getIntegerervaland8()) + 1);
		lottery.setIntegerervaland9(Check.toString(plottery
				.getIntegerervaland9()) + 1);
		lottery.setIntegerervaland10(Check.toString(plottery
				.getIntegerervaland10()) + 1);
		lottery.setIntegerervaland11(Check.toString(plottery
				.getIntegerervaland11()) + 1);
		lottery.setIntegerervaland12(Check.toString(plottery
				.getIntegerervaland12()) + 1);
		lottery.setIntegerervaland13(Check.toString(plottery
				.getIntegerervaland13()) + 1);
		lottery.setIntegerervaland14(Check.toString(plottery
				.getIntegerervaland14()) + 1);
		lottery.setIntegerervaland15(Check.toString(plottery
				.getIntegerervaland15()) + 1);
		lottery.setIntegerervaland16(Check.toString(plottery
				.getIntegerervaland16()) + 1);
		lottery.setIntegerervaland17(Check.toString(plottery
				.getIntegerervaland17()) + 1);
		lottery.setIntegerervaland18(Check.toString(plottery
				.getIntegerervaland18()) + 1);
		lottery.setIntegerervaland19(Check.toString(plottery
				.getIntegerervaland19()) + 1);
		lottery.setIntegerervaland20(Check.toString(plottery
				.getIntegerervaland20()) + 1);
		lottery.setIntegerervaland21(Check.toString(plottery
				.getIntegerervaland21()) + 1);
		lottery.setIntegerervaland22(Check.toString(plottery
				.getIntegerervaland22()) + 1);
		lottery.setIntegerervaland23(Check.toString(plottery
				.getIntegerervaland23()) + 1);
		lottery.setIntegerervaland24(Check.toString(plottery
				.getIntegerervaland24()) + 1);
		lottery.setIntegerervaland25(Check.toString(plottery
				.getIntegerervaland25()) + 1);
		lottery.setIntegerervaland26(Check.toString(plottery
				.getIntegerervaland26()) + 1);
		lottery.setIntegerervaland27(Check.toString(plottery
				.getIntegerervaland27()) + 1);
		lottery.setIntegerervaland28(Check.toString(plottery
				.getIntegerervaland28()) + 1);
		lottery.setIntegerervaland29(Check.toString(plottery
				.getIntegerervaland29()) + 1);
		lottery.setIntegerervaland30(Check.toString(plottery
				.getIntegerervaland30()) + 1);
		lottery.setIntegerervaland31(Check.toString(plottery
				.getIntegerervaland31()) + 1);
		lottery.setIntegerervaland32(Check.toString(plottery
				.getIntegerervaland32()) + 1);
		lottery.setIntegerervaland33(Check.toString(plottery
				.getIntegerervaland33()) + 1);
		lottery.setIntegerervaland34(Check.toString(plottery
				.getIntegerervaland34()) + 1);
		lottery.setIntegerervaland35(Check.toString(plottery
				.getIntegerervaland35()) + 1);
		lottery.setIntegerervaland36(Check.toString(plottery
				.getIntegerervaland36()) + 1);
		lottery.setIntegerervaland("");
	}

	public void init(Model lottery) {
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
