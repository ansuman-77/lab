package com.cg.iter;

public class SBU {
	   private String sbuCode;
	   private String sbuHead;
	   private String sbuName;
	   
	public SBU() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SBU(String sbuCode, String sbuHead, String sbuName ) {
		super();
		this.sbuCode = sbuCode;
		this.sbuHead = sbuHead;
		this.sbuName = sbuName;
	}
	@Override
	public String toString() {
		return " SBU [sbuCode=" + sbuCode + ", sbuHead=" + sbuHead + ", sbuName=" + sbuName + " ";
				//return "\n Address [areaName=" + areaName + ", city=" + city + "]";
	}
	public String getSbuCode() {
		return sbuCode;
	}
	public void setSbuCode(String sbuCode) {
		this.sbuCode = sbuCode;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}

}