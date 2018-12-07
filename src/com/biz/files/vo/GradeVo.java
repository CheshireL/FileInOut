package com.biz.files.vo;

public class GradeVo {

	private String strNum;
	private String strName;
	private int intK;
	private int intE;
	private int intM;
	private int intSum;
	private float floatAvg;
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public int getIntK() {
		return intK;
	}
	public void setIntK(int intK) {
		this.intK = intK;
	}
	public int getIntE() {
		return intE;
	}
	public void setIntE(int intE) {
		this.intE = intE;
	}
	public int getIntM() {
		return intM;
	}
	public void setIntM(int intM) {
		this.intM = intM;
	}
	public int getIntSum() {
		return intSum;
	}
	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}
	public float getFloatAvg() {
		return floatAvg;
	}
	public void setFloatAvg(float floatAvg) {
		this.floatAvg = floatAvg;
	}
	@Override
	public String toString() {
		return "GradeVo [strNum=" + strNum + ", strName=" + strName + ", intK=" + intK + ", intE=" + intE + ", intM="
				+ intM + ", intSum=" + intSum + ", floatAvg=" + floatAvg + "]";
	}
	
	
	
	
}
